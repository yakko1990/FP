<!DOCTYPE html>
<html lang="es">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

      <title>Document</title>
  </head>
  <body>
    <?php
      require_once "conexion.php";
      require_once "queryUser.php";

      $user = usuarios();    
      $rols = rol();
      /*
      echo "<pre>";
      print_r($user);
      print_r($user[0]["email"]);
      echo"</pre>";
      */
    ?>
    <div class="container registro">
      <h1>Registrar Usuario</h1>
      <br>
      <form role="form" method="post">
        <div class="form-group">
          <label for="email">Email address:</label>
          <input type="email" name="email" class="form-control" id="email">
        </div>
        <div class="form-group">
          <label for="pwd">Password:</label>
          <input type="password" name="pwd" class="form-control" id="pwd">
        </div>
        <div class="form-group">
          <label for="pwd2">Confirm Password:</label>
          <input type="password" name="pwd2" class="form-control" id="pwd2">
        </div>
        <div class="form-group">
          <label for="rol">seleccione el rol</label>
          <select name="rol" id="rol">         

            <?php 
                if (count($rols) > 0) :
                    foreach ($rols as $rol) :
            ?>
            <option value="<?= $rol["id"] ?>"><?= $rol["name"] ?></option>
            <?php 
                    endforeach;
                endif;        
            ?>
          </select>

        </div>
        <button type="submit" class="btn btn-default">REGISTRO</button>
      </form>
    </div>

    <?php
      if (isset($_POST["email"]) && isset($_POST["pwd"]) && isset($_POST["pwd2"])) {
        $email = $_POST["email"];
        $pwd = $_POST["pwd"];
        $pwd2 = $_POST["pwd2"];
        $pwdH = password_hash($_POST["pwd"], PASSWORD_BCRYPT);
        $pwd2H = password_hash($_POST["pwd2"], PASSWORD_BCRYPT);
        $rol = $_POST["rol"];
        //var_dump($rol);
        //var_dump($email, $pwd, $pwd2);
      
        function existeUsuario($email)
        {
          global $user;
          for ($i = 0; $i < count($user); $i++) {
            if (($user[$i]["email"]) == $email)
              return true;
          }
        }

        if (existeUsuario($email)) {
          echo '<div class="alert alert-danger" role="alert">';
          echo "El usuario ya existe";
          echo '</div>';
        } else {
          if ($pwd == $pwd2) {
            try {
              $con = getConnection();
              $con->beginTransaction();
              $query = "INSERT INTO usuario (email, pwdhash )
                  VALUES (:email, :pwdhash)";
              $stmt = $con->prepare($query);
              $stmt->bindValue("email", $email);
              $stmt->bindValue("pwdhash", $pwdH);
              $stmt->execute();
              $userValue = $con->lastInsertId();
              $stmt_usuario_rol = $con->prepare("INSERT INTO usuario_rol (idUsuario, idRol) VALUES (:user_id, :rol_id)");
              $stmt_usuario_rol->bindParam("user_id", $userValue);

              $stmt_usuario_rol->bindParam("rol_id", $rol);
              if (!$stmt_usuario_rol->execute()) {
                throw new Exception();
              }
              $con->commit();
          ?>
                <div class="alert alert-success" role="alert">
                  El usuario se ha creado correctamente
                  </div>
                
            <?php

          } catch (PDOException $e) {
            $con->rollBack();
            ?>
              <div class="alert  alert-danger" role="alert">
                Ha ocurrido un error
                </div>
              
              <?php $e->getMessage();
          }
        } else
        ?>
        <div class="alert  alert-danger" role="alert">
          Las contraseñas no coinciden
          </div>
        
        <?php

      }

    }

    /*
    $password = password_hash("pepito", PASSWORD_BCRYPT);
    $exito = password_verify("", $password);
    var_dump($exito);
    echo $password;
    */
    ?>
    
  </body>
</html>
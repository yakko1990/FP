<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Document</title>

</head>
<body>
    
    <div class="container login">
        <h1> Loguin</h1>
        <br>
        <form role="form" method="post">
            <div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" name="loginEmail" class="form-control" id="loginEmail">
            </div>
            <div class="form-group">
            <label for="pwd">Contraseña:</label>
            <input type="password" name="loginPwd" class="form-control" id="loginPwd">
            </div>
            <p>
            <button type="submit" class="btn btn-default">Login</button>
            </p>
        </form>
    </div>
        
    <?php
        require_once "conexion.php";
        require_once "queryUser.php";

        $user = usuarios();
        $rols = rol();
        //echo "<pre>";
        //print_r($rols);
        //echo"</pre>";
        $user_rol = user_rol();
        //echo "<pre>";
        //print_r($user_rol);
        //echo "</pre>";
      
        if (isset($_POST["loginEmail"]) && isset($_POST["loginPwd"])) {
            global $user;
            
            $loginEmail = $_POST["loginEmail"];
            $loginPwd = $_POST["loginPwd"];
            function existeUserPwd($email, $pwd) {
                global $user;
                global $rols;
                global $user_rol;
            for ($i = 0; $i < count($user); $i++) {
                    if (($user[$i]["email"]) == $email && password_verify($pwd, $user[$i]["pwdhash"])) {
                        obtenerRol($user[$i]["id"], $user_rol, $rols);
                        return true;
                    }
            }
            return false;
            }
  
            if (!existeUserPwd($loginEmail, $loginPwd)) {
    
            echo '<div class="alert alert-danger" role="alert">';
            echo "Los datos introducidos son incorrectos";
            echo '</div>';
            } else {
            echo '<div class="alert alert-success" role="alert">';
            echo "Se ha iniciado sesión correctamente";
            echo '</div>';
            }
        
        
        }
        function obtenerRol($id,$userRol,$rols){
            for ($i=0; $i < count($userRol); $i++) { 
            if($id == $userRol[$i]["idUsuario"]){
                    for ($k=0; $k < count($rols); $k++) { 
                        if ($userRol[$i]["idRol"] == $rols[$k]["id"]) {
                            return print_r($rols[$k]);
                        }
                    }
            }
        }
        
        }

      
    ?>

    
</body>
</html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Visits counter</title>
</head>

<body>

    <h1>Visits counter</h1>
    <?php
    $borrado = false;

    if (isset($_POST["eliminarCookie"])){
        setcookie("visitas", "", time() - 3600);
        unset($_COOKIE["visitas"]);
        $borrado = true;
    }      

    if (!$borrado){

        if (isset($_COOKIE["visitas"])) {

            $visitas = $_COOKIE["visitas"];
            setcookie("visitas", ++$visitas, time() + 3600);
            //El nuevo valor no estará disponible en $_COOKIE hasta la próxima petición HTTP 
            //Por ese motivo no podemos usar $_COOKIE["visitas] para mostrar su valor
    
        ?>
    
            <p>Nos ha visitado <?= $visitas ?> veces</p>
        <?php  } else {
            setcookie("visitas", 1, time() + 3600);
        ?>
            <p>Bienvenido</p>
        <?php
        }
    }
   
    ?>
    <form method="post">
        <input type="submit" name="eliminarCookie" id="" value="Eliminar cookie"class="btn btn-secondary btn-block mb-4">
        
    </form>

   

</body>

</html>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Autor</title>
</head>
<body>

    <?php

    require_once './conexion.php';
    require_once './query_crear.php';   

        if ($_SERVER["REQUEST_METHOD"] == "POST") { // PREGUNTAR POR ESTO......
            $result =  crearAutor($_POST);

            if ($result) {
                echo "<p>Creado correctamente</p>";
            } else {
                echo "<p>Ocurrió un error</p>";
            }
        }

    ?>


    <h1>Vas a crear un nuevo autor</h1>
    <form action="" method="post">
        <p>
            <label for="nombre">Nombre del Autor: </label>
            <input type="text" name="nombre">
        </p>
        <p>
            <label for="apellido1">Primer apellido: </label>
            <input type="text" name="apellido1">
        </p>
        <p>
            <label for="apellido2">Segundo apellido: </label>
            <input type="text" name="apellido2">
        </p>
        <p>
            <label for="cumpleaños">cumpleaños del Autor: </label>
            <input type="date" name="cumple">
        </p>
        <input type="submit" value= "crear nuevo Autor">   

    </form>
   
    <form action="index.php">
        <input type="submit" value="volver">
    </form>


    
</body>
</html>

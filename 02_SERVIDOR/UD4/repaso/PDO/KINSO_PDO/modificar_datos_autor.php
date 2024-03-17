<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<h1>Se ha modificado correctamente</h1>
<a href="./index.php">volver</a>
    <?php

    require_once './query_modificar.php';

    $datos_mod = modificarAutor($_POST);
    //var_dump($datos_mod);

    ?>
</body>
</html>
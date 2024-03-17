<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<h1>Datos del Autor</h1>
<hr>
    <?php

    require_once "./query_autor.php";
    // var_dump($_POST['id']);

    $id = $_POST['id'];
    //var_dump(datosAutor($id));

    $datos = datosAutor($id);

    foreach ($datos as $key => $value) {
        echo''. $key .': '. $value .'';
        echo "<br>";
    }
    ?>
<hr>
    <a href="index.php">volver</a>

</body>
</html>
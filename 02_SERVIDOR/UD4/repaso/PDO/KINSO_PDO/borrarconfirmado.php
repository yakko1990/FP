<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>Se ha borrado correctamente</h1>
<br>
<a href="index.php">volver</a>
<?php
require_once './query_borrar.php';

//var_dump($_POST);
$id_autor = $_POST['id'];
borrarAutor($id_autor);
//crearAutor($datos);



?>
</body>
</html>


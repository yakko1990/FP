<?php
require_once "utils.php";
const  CARPETA_DESTINO =__DIR__.DIRECTORY_SEPARATOR."imgUp";
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tarea UD3</title>
</head>
<body>
 <H1>ADJUNTAR FOTOGRAFIA</H1>
    <form action="" method="post" enctype="multipart/form-data">
        <p>
            <label for="archivo"> Selecciona la fotografia que desees enviar:</label>
            <p> <input type="file" name="archivo[]" id="" accept=".jpg" multiple></p>                  
        </p>        
        <input type="submit" value="enviar">
    </form>

    <?php   

    if (isset ($_FILES["archivo"])){ 

    mostrarlista();
    subirArchivos();
    }
    ?>
</body>
</html>
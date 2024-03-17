<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>actualizar autor</h1>
    <?php

    require_once "./query_select_autor.php";
    require_once "./query_update_autor.php";

    $id_author = $_GET["id"];
    $author = get_author($id_author);

    if ($_SERVER["REQUEST_METHOD"] == "POST") {

        $success = update_author($_POST);
        if ($success) {
            $author = get_author($id_author);
        }
    }

    ?>

    <form action="" method="post">
        <div class="">
            <input type="hidden" name="author_id" value=<?php echo $author[0]["author_id"] ?>>
        </div>
        <div class="">
            <label for="first_name">Nombre:</label>
            <input type="text" name="first_name" value=<?php echo $author[0]["first_name"] ?>>
        </div>
        <div class="">
            <label for="middle_name">Segundo Nombre:</label>
            <input type="text" name="middle_name" value=<?php echo $author[0]["middle_name"] ?>>
        </div>
        <div class="">
            <label for="last_name">Apellidos:</label>
            <input type="text" name="last_name" value=<?php echo $author[0]["last_name"] ?>>
        </div>
        <div class="">
            <label for="birth_date">fecha de nacimiento</label>
            <input type="date" name="birth_date" value=<?php echo $author[0]["birth_date"] ?>>
        </div>
        <input type="submit" value="enviar">
    </form>

    <a href="index.php">volver</a>

</body>

</html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear autor</title>
</head>

<body>

    <?php

    require_once "./query_insert_autor.php";

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $success =  insert_author($_POST);

        if ($success) {
            echo "<p>Creado correctamente</p>";
        } else {
            echo "<p>Ocurrió un error</p>";
        }
    }

    ?>


    <form action="" method="post">

        <div class="input">
            <label for="">Nombre:</label>
            <input type="text" name="first_name">

        </div>
        <div class="input">
            <label for="">Segundo Nombre:</label>
            <input type="text" name="middle_name">

        </div>
        <div class="input">
            <label for="">Apellidos:</label>
            <input type="text" name="last_name">

        </div>
        <div class="input">
            <label for="">Fecha de Nacimiento</label>
            <input type="date" name="birth_date">

        </div>

        <input type="submit">
    </form>
    <br><br><br><br><br>
    <div>
        <a href="./index.php">Volver</a>
    </div>
</body>

</html>
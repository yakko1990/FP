<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear autor</title>
</head>

<body>

    <div>
        <a href="form_crear_autor.php"> Crear autor</a>
    </div>

    <input type="hidden">
    <?php
    
    require_once "./query_select_autores.php";
    require_once "./query_delete_autor.php";


    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $success = delete_author($_POST["id"]);
        if ($success) {
            echo "Eliminado correctamente";
        } else {
            echo "No se pudo eliminar";
        }
    }


    $datos_autores = get_authors();

    foreach ($datos_autores as  $autor) {
        $first_name = $autor["first_name"];
        $last_name = $autor["last_name"];
        $author_id = $autor['author_id'];
        echo "<div>";
        echo "<span>$first_name</span>" . " ";
        echo "<span>$last_name</span>";
        echo "<form   action='./form_update_autor.php'   method=''>";

        echo "<input type='hidden' name='id' value='{$author_id}'>";
        echo "<input type='submit'  value='actualizar'>";
        echo "</form>";

        echo "<form   action=''   method='POST'>";
        echo "<input type='hidden' name='id' value='{$author_id}'>";
        echo "<input type='submit' onclick=\"return confirm('¿Borrar autor?')\"  value='eliminar'>";
        echo "</form>";
        echo "</div>";
    }

    echo "<pre>";
    print_r($datos_autores);
    echo "</pre>";

    ?>

</body>

</html>
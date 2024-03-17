<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Búsqueda</title>
</head>

<body>
    <h1>Búsqueda de libros</h1>

    <form method="GET">
        <label for="busqueda">Introduzca los términos de búsqueda: </label>
        <input type="search" name="busqueda" id="busqueda" required>
        <button type="submit">Buscar</button>
    </form>
</body>

</html>
<?php
if (isset($_GET["busqueda"])) {
    $terminos_busqueda = $_GET["busqueda"];
    if (trim($terminos_busqueda) !== "") {

        require_once "MyPDO.php";

        try {
            $con = new MyPDO();

            //En la bd bookdb no importan mayúsculas/minúsculas porque está usando collation caseinsensitive, pero no está demás que nuestro código no dependa de la collation de la base de datos
            // $stmt = $con->prepare("select title as resultado from books where UPPER(title) like :busqueda 
            //     union 
            //     select TRIM(Concat(coalesce(first_name, '') , coalesce(middle_name, ' '), coalesce(last_name, '')))
            //      as resultado from authors where first_name like :busqueda;");

            // No tan útil para obtener los resultados y mostrarlos en html:
            // SELECT title, first_name, middle_name, last_name
            // FROM books b
            // LEFT JOIN book_authors ba ON b.book_id = ba.book_id
            // LEFT JOIN authors a ON ba.author_id = a.author_id
            // WHERE UPPER(title) like '%a%' OR first_name LIKE '%a%';

            
            $filtro = "%" . strtoupper($terminos_busqueda) . "%";
            $stmt->bindParam("busqueda", $filtro);

            // echo "<pre>";
            // $stmt->debugDumpParams();
            // echo "</pre>";

            $stmt->execute();

            echo "<pre>";
            $stmt->debugDumpParams();
            echo "</pre>";

            $counter = 0;
            while (($row = $stmt->fetch(PDO::FETCH_ASSOC)) !== false) {
                $counter++;
                if ($counter == 1) {
                    echo "<ol>";
                }
                echo "<li>" . $row["resultado"] . "</li>";
              
            }
            if($counter >0){
                echo "</ol>";
            }
            if ($counter == 0) {
                echo "<p>No se han encontrado resultados</p>";
            }
        } catch (Exception $e) {
            echo "<p>Ha ocurrido una excepción: " . $e->getMessage() . "</p>";
        }
        //Cerramos los recursos
        $con = null;
        $stmt = null;
    } else {
        echo "<p> Introduzca una cadena no vacía </p>";
    }
}

?>
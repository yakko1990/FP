<?php

require_once "./conexion.php";
function get_authors()
{

    try {
        $conn = getConnection();
        $consulta = "SELECT * from authors";
        $stmt = $conn->prepare($consulta);
        $stmt->execute();
        $resultado = $stmt->fetchAll(PDO::FETCH_ASSOC);

        return $resultado;
    } catch (PDOException $ex) {
        echo $ex->getMessage();
        die("Ocurrió un error");
    }
}

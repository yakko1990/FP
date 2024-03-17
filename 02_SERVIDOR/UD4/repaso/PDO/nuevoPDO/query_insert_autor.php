<?php
require_once "./conexion.php";

function insert_author($datos)
{

    try {
        $conn = getConnection();
        $query = "INSERT INTO authors ( `first_name`, `middle_name`, `last_name`, `birth_date`) VALUES(:first_name, :middle_name, :last_name, :birth_date)";

        $stmt = $conn->prepare($query);
        // $stmt->debugDumpParams();
        $success = $stmt->execute($datos);
        // echo "<br>";
        // $stmt->debugDumpParams();
        return $success;
    } catch (PDOException $ex) {
        echo $ex->getMessage();
        return false;
    }
}

<?php

require_once "./conexion.php";


function get_author($id)
{

    try {
        $conn = getConnection();

        $query = "SELECT * FROM authors WHERE author_id = :id";
        $stmt = $conn->prepare($query);
        $stmt->bindParam("id", $id);
        $stmt->execute();

        $rows = $stmt->fetchAll(PDO::FETCH_ASSOC);

        return $rows;
    } catch (PDOException $ex) {

        $message = $ex->getMessage();
        echo "<p style=\"background-color:red; color:white; \">$message</p>";
        return [];
    }
}

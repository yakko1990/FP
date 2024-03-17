<?php

require_once "./conexion.php";


function delete_author($author_id)
{
    try {
        $conn = getConnection();
        $query = "DELETE from authors WHERE author_id = :author_id";
        $stmt = $conn->prepare($query);
        $stmt->bindParam("author_id", $author_id);
        $success = $stmt->execute();

        return $success;
        
    } catch (PDOException   $ex) {
        $message = $ex->getMessage();
        echo "<p>$message</p>";
        return false;
    }
}

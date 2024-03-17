<?php

require_once "./conexion.php";

function update_author($data)
{
    

    try {
        $conn = getConnection();
        $query = "UPDATE authors SET 
        first_name = :first_name, 
        middle_name = :middle_name, 
        last_name = :last_name, 
        birth_date = :birth_date 
        WHERE author_id = :author_id";

        $stmt = $conn->prepare($query);
        $success = $stmt->execute($data);

        return $success;

    } catch (PDOException $ex) {
        echo $ex->getMessage();
        return false;
    }
}

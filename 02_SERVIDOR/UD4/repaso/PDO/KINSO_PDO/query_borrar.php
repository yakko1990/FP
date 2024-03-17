<?php

require_once "./conexion.php";

function borrarAutor($id)
{
    try {

        $conn = getConnection();

        $query = "DELETE FROM authors WHERE author_id = :id";

        $stmt = $conn->prepare($query);
        $stmt->bindParam("id", $id);
        $result = $stmt->execute();        
        return $result;


    }
    catch (PDOException $e) {  
        echo "ha habido un error". $e->getMessage();    
    }
}

?>
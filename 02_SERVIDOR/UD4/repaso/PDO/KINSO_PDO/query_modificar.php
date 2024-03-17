<?php

    require_once './conexion.php';


function modificarAutor($datos) //dtos de donde viene
{
 //var_dump($datos);
    try {
        $conn = getConnection();

        $query = "UPDATE authors SET 
        first_name = :nombre, 
        middle_name = :apellido1, 
        last_name = :apellido2, 
        birth_date = :cumple 
        WHERE author_id = :author_id";
        $stmt = $conn->prepare($query);
        $result =$stmt->execute($datos);
       // $result = $stmt->fetchAll(PDO::FETCH_ASSOC);/// por que sobra esta linea?
        return $result;

    } catch (PDOException $e) {
        echo $e->getMessage();
        return false;
    }
}


?>
<?php
require_once './conexion.php';

function crearAutor($datos)
    {
 //var_dump($datos);
        try {
            $conn = getConnection();
            $query = "INSERT INTO authors (`first_name`, `middle_name`, `last_name`, `birth_date`)
            VALUES ( :nombre,:apellido1, :apellido2, :cumple)";

            $stmt = $conn->prepare($query);
            //$stmt->debugDumpParams();
            $result = $stmt->execute($datos);
            //$stmt->debugDumpParams();
            return $result;
            
        } catch (PDOException $e) {
            echo "ha ocurrido un error" . $e->getMessage();
            return false;

        }
    }
?>
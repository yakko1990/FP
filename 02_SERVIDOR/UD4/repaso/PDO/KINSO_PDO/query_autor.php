<?php

    require_once('./conexion.php');              

    function datosAutor($id)
    {

        try {
            $conn = getConnection();
            $query = "SELECT * FROM authors WHERE author_id= :id";
            $stmt = $conn->prepare($query);
            $stmt->bindParam("id", $id);
            $stmt->execute();
            
            //$resultado = $stmt->fetchAll();
            while (($row = $stmt->fetch(PDO::FETCH_ASSOC)) !== false)
            return $row;

        } catch (PDOException $e) {
            echo "ha ocurrido un eror" . $e->getMessage();
        }
    }

    /*$pdostmt = $mbd->prepare('SELECT * from books where title like :nombre ');
    $filtro = "P%";
    $pdostmt->bindParam("nombre",  $filtro);
    $pdostmt->execute();

    while (($row = $pdostmt->fetch(PDO::FETCH_OBJ)) !== false) {
        echo "<pre>";       
        print_r($row);
        echo"</pre>";    
    }*/
    ?>
<?php

require_once "conexion.php" ;

function usuarios(){
    try{
        $con = getConnection();
        $query = " SELECT `usuario`.`id`,
        `usuario`.`email`,
        `usuario`.`pwdhash`
        FROM `notas`.`usuario`";
        $stmt = $con->prepare($query);
        $stmt->execute();
        $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
        return $result;
    }
    catch(PDOException $e)
    {
        echo "ha ocurrido un error".$e->getMessage();
    }  

}
function rol(){
    try{
        $con = getConnection();
        $query = " SELECT `rol`.`id`,
        `rol`.`name`
        FROM `notas`.`rol`";
        $stmt = $con->prepare($query);
        $stmt->execute();
        $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
        return $result;
    }
    catch(PDOException $e)
    {
        echo "ha ocurrido un error".$e->getMessage();
    }
}

function user_rol(){
    try{
        $con = getConnection();
        $query = "SELECT `usuario_rol`.`idUsuario`,
        `usuario_rol`.`idRol`
    FROM `notas`.`usuario_rol`";
        $stmt = $con->prepare($query);
        $stmt->execute();
        $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
        return $result;
    }
    catch(PDOException $e)
    {
        echo "ha ocurrido un error".$e->getMessage();
    }
}
?>

<?php
require_once './conexion.php';

function get_Authors()
{
    try {
        $conn = getConnection();
        $query = "SELECT * FROM authors ";
        $stmt = $conn->prepare($query);
        $stmt->execute();

        $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
        return $result;
        
    } catch (PDOException $e) {
        echo "ha ocurrido un error al recibir los datos"
            . $e->getMessage();
    }
}
?>
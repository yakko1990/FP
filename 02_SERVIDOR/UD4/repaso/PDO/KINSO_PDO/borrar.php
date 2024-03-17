
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
$id_autor = $_POST['id'];
var_dump( $id_autor );
?>
    <h1>Estas seguro?</h1>
<form action="borrarconfirmado.php" method="post">
    <input type="hidden" name="id" id="id" value="<?php echo $id_autor ?>">
    <input type="submit" id="si" value="si">
</form>
<form action="index.php">
    <input type="submit" name="no" id="no" value="no">
</form>


</body>
</html>
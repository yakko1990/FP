
<?php

/**
 * Summary of getConnection
 * Crea un objeto mysqli. Si ocurre algún error leyendo el fichero de configuración lanza una excepción.
 * @return mysqli|null un objeto mysqli si ha habido éxito creando la conexión, null en caso contrario
 */
function getConnection():mysqli{

    $con = null;
    $host = "localhost";
    $db = "bookdb";
    $user = "user-bookdb";
    $pass = "abc123.";
    $port = 3306;   

    $con = new mysqli($host, $user, $pass, $db, $port);

    return $con;
}

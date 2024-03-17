
<?php

const SETTINGS_DB_FILE = "db_settings.ini";

/**
 * Summary of getConnection
 * Crea un objeto mysqli. Si ocurre algún error leyendo el fichero de configuración lanza una excepción.
 * @return mysqli|null un objeto mysqli si ha habido éxito creando la conexión, null en caso contrario
 */
function getConnection():mysqli{

    //APARTADO NUMERO 1
    if (!$settings = parse_ini_file(SETTINGS_DB_FILE, true))
        throw new Exception("ERROR : Unable to open " . SETTINGS_DB_FILE);
    $con = null;
    $host = $settings["database"]["host"];
    $db = $settings["database"]["schema"];
    $user = $settings["database"]["username"];
    $pass = $settings["database"]["password"];
    $port = $settings["database"]["port"]; 

    $con = new mysqli($host, $user, $pass, $db, $port);

    return $con;
}

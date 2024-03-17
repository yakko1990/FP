<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <title>Cookies.php</title>
</head>

<body>
    <div class="container border border-3 rounded-4 mt-5 bg-light p-4 mb-3" id="form-container">
        <h1>Introduzca datos para crear una cookie</h1>
        <form class="form-floating p-3" method=post>
            <div class="form-floating mb-3">
                <p><label for="cookieName" class="form-label">Cookie name:</label></p>
                <input type="text" class="form-control" id="cookieName" name="cookieName" aria-describedby="cookiesName" required>
            </div>

            <div class="form-floating mb-3">
                <p><label for="cookieValue" class="form-label">Cookie value:</label></p>
                <input type="text" class="form-control" id="cookieValue" name="cookieValue" aria-describedby="cookiesValue" required>
            </div>

            <div class="form-floating mb-3">
                <p><label for="cookieExpirationSeconds" class="form-label">Cookie expiration seconds:</label></p>
                <input type="number" class="form-control" pattern="^[1-9]\d*$" id="cookieExpirationSeconds" name="cookieExpirationSeconds" aria-describedby="cookieExpirationInSeconds">
                <div id="cookieExpirationSeconds" class="form-text">.</div>
            </div>

            <button type="submit" class="btn btn-primary">Añadir cookie</button>
        </form>
    </div>
    
    <?php

    if (isset($_POST["cookieName"], $_POST["cookieValue"])) {

    $cookieName = $_POST["cookieName"];
    $cookieValue = $_POST["cookieValue"];

    //verificamos si se le  ha dado un valor  al campo expiracion o aplicamos su valor por defecto
    $cookieExpirationSeconds = isset($_POST["cookieExpirationSeconds"]) ? (int) $_POST["cookieExpirationSeconds"] : 0;
    // he tenido que añadir algunos parametros  para las pruebas porque en mi navegador daba error. Lo dejo en comentarios por si es necesario;
    setcookie($cookieName, $cookieValue, time() + $cookieExpirationSeconds);
    }
    
    ?>


    <div id="cookiesCreadas" class="container mb-3">
        <h2>Cookies creadas</h2>

        <!-- del rol B
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Nombre</th>
                    <th scope="col">Valor</th>
                </tr>
            </thead>
            <tbody>
                
                <?php
                // declaramos e inicializamos un array vacio para  almacenar nombre y valor de las cookies
                // $cookiesArray = array();
                // recorremos nombre y valor de todas las cookies presentes en $_COOKIE recopilandolas en la array
                // foreach ($_COOKIE as $name => $value) {
                //   $cookiesArray[$name] = $value;
                // }
                // recorremos nuestra array para mostrarla por pantalla
                // foreach ($cookiesArray as $cookieName => $cookieValue) {
                //   echo "<tr><td>$cookieName</td><td>$cookieValue</td></tr>";
                // }
                ?>

            </tbody>
        </table>

    </div> -->


    <div id="borrarCookies" class="container mb-3">
        <button type="submit" class="btn btn-primary">Borrar cookies</button>
    </div>
</body>

</html>
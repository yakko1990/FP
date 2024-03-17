<?php
?>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Cookies</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body>

    <div class="container-fluid">
        <h1>Introduzca datos para crear una cookie</h1>
        <?php
        //print_r($_COOKIE);
        require_once 'tabla_cookies.php';


        check_borrar_cookies();

        if (isset($_POST["name"]) && isset($_POST["value"])) {
            $nombre = $_POST["name"];
            $valor = $_POST["value"];
            $seconds = 0;

            if (isset($_POST["seconds"])) {
                $seconds = (int) $_POST["seconds"];
            }

            setcookie($nombre, $valor, $seconds != 0 ? time() + $seconds : $seconds);

            header("location: cookies.php");
            exit; 
        }
        ?>

        <div class="row justify-content-center">
            <div class="col-sm-12 col-md-6">
                <form method="post">
                    <!-- Titulo input -->
                    <div class="form-group mb-4 ">
                        <label class="form-label" for="name">Cookie name:</label>
                        <input type="text" id="name" class="form-control" name="name" required />

                    </div>
                    <div class="form-group mb-4 ">
                        <label class="form-label" for="value">Cookie value:</label>
                        <input type="text" id="value" class="form-control" name="value" required />

                    </div>
                    <div class="form-group mb-4 ">
                        <label class="form-label" for="seconds">Cookie expiration seconds</label>
                        <input type="number" id="seconds" class="form-control" name="seconds" min="0" />

                    </div>

                    <!-- Submit button -->
                    <input type="submit" class="btn btn-primary btn-block mb-4" value="Añadir cookie"></button>


                </form>
            </div>
        </div>

        <?php show_table_cookies(); ?>



</body>

</html>
<?php
?>
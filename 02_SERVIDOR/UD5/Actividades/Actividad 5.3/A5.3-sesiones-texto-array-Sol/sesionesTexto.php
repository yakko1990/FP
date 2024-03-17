<?php
ob_start();
require_once 'util.php';
?>
<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Textos en sesión</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body>

    <div class="container-fluid">
        <h1>Introduzca textos en la sesión</h1>
        <?php
        iniciarSesion();

        if (isset($_POST["borrar"])) {
            cerrarSesion();
        }

        if (isset($_POST["texto"])) {
            $texto = $_POST["texto"];
            // if(!isset($_SESSION["textos"])){
            //     $_SESSION["textos"] = array();                
            // }
            // array_push($_SESSION["textos"], $texto);

            $_SESSION["textos"][] = $texto;

          //  print_r($_SESSION["textos"]);
        }

        if (isset($_SESSION["textos"]) && count($_SESSION["textos"]) > 0) {
            ?>
            <ul>
                <?php foreach ($_SESSION["textos"] as $key => $value) { ?>
                    <li>
                        <?= $value ?>
                    </li>
                <?php } ?>

            </ul>
        <?php }
        ?>

        <div class="row justify-content-center">
            <div class="col-sm-12 col-md-6">
                <form method="post">
                    <!-- Email input -->
                    <div class="form-group mb-4 ">
                        <label class="form-label" for="texto">Texto</label>
                        <input type="text" id="texto" class="form-control" name="texto" required />

                    </div>
                    <!-- Submit button -->
                    <input type="submit" class="btn btn-primary btn-block mb-4" value="Añadir"></button>

                </form>
            </div>
        </div>

        <?php if(isset($_SESSION) && count($_SESSION)>0) {?>
        <div class="row justify-content-center">
            <div class="col-sm-12 col-md-6">
                <form method="post">
                    <!-- Submit button -->
                    <input type="submit" name="borrar" class="btn btn-secondary btn-block mb-4"
                        value="Borrar sesion"></button>


                </form>
            </div>
        </div>
        <?php }?>
</body>

</html>
<?php
ob_end_flush();
?>
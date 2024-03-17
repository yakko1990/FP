<?php
var_dump($_COOKIE);

function MostrarTabla(){

    if (!empty($_COOKIE)) {   
         ?>
        <h2>Cookies creadas</h2>
        <table class="container border border-3 rounded-4 mt-5 bg-light p-4 mb-3" >
            <thead>
            <tr>
                <th scope="col">Cookie name</th>
                <th scope="col">Cookie value</th>
            </tr>
            </thead>
            <tbody>
                <?php foreach ($_COOKIE as $key => $value) {?>
                    <tr>
                        <td>
                            <? $key?>
                        </td>
                        <td>
                        <? $value?>
                        </td>
                    </tr>
                    <?php
                }
                ?>
            </tbody>
        </table>
        <?php
        show_borrar_cookies();
    }
}
function show_borrar_cookies()
{
    echo '
    <div class="row justify-content-center">
        <div class="col-sm-12 col-md-6">
            <form method="post">
                <!-- Submit button -->
                <input type="submit" name="borrar" class="btn btn-secondary btn-block mb-4" value="Borrar cookies"></button>
            </form>
        </div>
    </div>';

}

function check_borrar_cookies()
{
    if (isset($_POST["borrar"])) {
        foreach ($_COOKIE as $key => $value) {

            setcookie($key, "", time() - 1000);
        }
        header("location: cookies.php");
        exit;
    }
}
?>


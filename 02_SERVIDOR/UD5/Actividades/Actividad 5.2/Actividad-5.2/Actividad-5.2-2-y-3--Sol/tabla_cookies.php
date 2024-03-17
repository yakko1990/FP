<?php

function show_table_cookies()
{
    if (count($_COOKIE) > 0) {
        ?>
        <h2>Cookies creadas</h2>
        <table class="table table-striped">
            <thead>
                <tr>

                    <th scope="col">Cookie name</th>
                    <th scope="col">Cookie value</th>


                </tr>
            </thead>
            <tbody>

                <?php foreach ($_COOKIE as $key => $value): ?>
                    <tr>

                        <td>
                            <?= $key ?>
                        </td>
                        <!-- 2nd td -->
                        <td>
                            <?= $value ?>
                        </td>

                    </tr>
                    <?php
                endforeach;
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
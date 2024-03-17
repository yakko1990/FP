<?php

/**
 * Summary of comprobar_email
 * @param string $input
 * @return bool
 */
function comprobar_email(string $input): bool {
    global $usuarios;
    foreach ($usuarios as $key => $value) {
        if ($key == $input) {
            return true;}
    }
    return false;
}

/**
 * Summary of comprobar_pass
 * @param string $input
 * @return bool
 */
function comprobar_pass(string $input): bool {
    global $usuarios;
    global $email;   
        
        if($usuarios[$email]['pwd'] == $input){
            return true;
        }
    
    return  false;                                     
}
/**
 * Summary of contraseñas_nuevas_iguales
 * @param string $input
 * @param string $input2
 * @return bool
 */
function contraseñas_nuevas_iguales(string $input, string $input2): bool
{
    if ($input == $input2) {
        return true;
    }
    return false;
}
/**
 * Summary of comparar_nueva_contraseña_con_anteriores
 * @param string $input
 * @return bool
 */
function comparar_nueva_contraseña_con_anteriores(string $input): bool{

    global $usuarios;
    global $email;  

    if (($input != $usuarios[$email]["pwd-1"]) || ($input != $usuarios[$email]["pwd-2"])) {

        return true;
    }
    return false;
}
/**
 * Summary of comprobar_mayuscula
 * @param string $input
 * @return bool
 */

function comprobar_mayuscula(string $input): bool  {
    if( preg_match('/[A-Z]/', $input)){
        return true;
    };
    return false;
}
/**
 * Summary of comprobar_numero
 * @param string $input
 * @return bool
 */
function comprobar_numero(string $input): bool  {
    if(preg_match('/\d/', $input)){
        return true;
    };
    return false;
}
/**
 * Summary of comprobar_simbolo
 * @param string $input
 * @return bool
 * Comprueba si la nueva contraseña tiene un simbolo se los que se exigen
 */
function comprobar_simbolo(string $input): bool  {
    global $simbolos;
    $i = 0;
    foreach ($simbolos as $key => $value) {
        if(str_contains( $input, $simbolos[$i])) {
            return true;
        }$i++;        
    }
    return false;
}

?>
<?php



function getNomesBailes(Baile $baile){
    return $baile->getNome();
}

function mostrarImporte(Alumno $alumno) {
    $cuotaA1 = $alumno->aPagar();
    echo "Alumno/a: " . $alumno->getNome() . " debe pagar $cuotaA1 €<br/>";
}
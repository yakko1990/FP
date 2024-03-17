'use strict'

let numero1 = parseInt(prompt('Introduce el numero'));
let numerosPrimos =[];

//Ejemplo de bucle que pide numeros hasta que sean correctos

while (numero1 <= 0 || isNaN(numero1)) {
    numero1 = parseInt(prompt('Introduce el numero', 0));

}

//Función que comprueba si un numero es primo
function esPrimo(numero1) {
    if (numero1==2)
        return true;

    for (let i = 2; i < numero1; i++) {
        if (numero1 % i == 0)
            return false;
    }

    return true;
}

function mostrar(numero1, mostrarPrimo=false) {
    mostrarPrimo = esPrimo(numero1);

    console.log(mostrarPrimo);
    if (mostrarPrimo){
        document.write("<h3> El numero " + numero1 + " es primo </h3>");
        numerosPrimos.push(numero1);
    }
        
        
    else console.log("El numero " + numero1 + " no es primo");;
}

//Llamada a la funcion mostrar si un numero es primo y todos los menores que el  
for (let i = 2; i <= numero1; i++)
    mostrar(i);
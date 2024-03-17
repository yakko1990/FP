'use strict'

let numero1 = parseInt(prompt('Introduce el numero'));


//Ejemplo de bucle que pide numeros hasta que sean correctos

while (numero1 <= 0 || isNaN(numero1)) {
    numero1 = parseInt(prompt('Introduce el numero', 0));

}

//Función que comprueba si un numero es primo
function esPrimo(numero1) {
    if (numero1 == 2)
        return true;

    for (let i = 2; i < numero1; i++) {
        if (numero1 % i == 0)
            return false;
    }

    return true;
}


//Función que comprueba y muestra todos los primos menores al número introducido
function mostrarPrimos(numero1) {
    
    document.write(`<h1> PRIMOS MENORES QUE EL NÚMERO INTRODUCIDO </h1>`);
    for (let i = 2; i < numero1; i++) {

        //Visualiza el array de primos
        if (esPrimo(i))
            document.write("<h3> El numero " + i + " es primo </h3>");
    }
}

if (esPrimo(numero1)) {
    document.write(`<h3> El numero ${numero1} es primo </h3>`);
    //Llamada a la funcion mostrarPrimos si un numero es primo para comprobar los primos menores  
    mostrarPrimos(numero1)
}

else
    document.write(`El numero ${numero1} no es primo`);
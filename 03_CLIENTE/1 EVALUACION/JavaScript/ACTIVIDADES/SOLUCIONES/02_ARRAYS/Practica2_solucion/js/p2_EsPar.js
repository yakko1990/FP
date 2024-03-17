//Realizar un script que indique si un número es par

'use strict'
    
var numero1 = parseInt(prompt('Introduce el primer numero'));

//Ejemplo de bucle que pide numeros hasta que sean correctos

while (numero1 <=0  || isNaN(numero1) ){
    numero1 = parseInt(prompt('Introduce el primer numero',0));
    
}

//Función que comprueba si un numero es par
function esPar(numero1){
    if (numero1 % 2 == 0)
    return true;
else  return false;
}

function mostrar(numero1, mostrarParImpar=false){
    mostrarParImpar=esPar(numero1);

    console.log(mostrarParImpar);
    if (mostrarParImpar)
        console.log("El numero " +numero1+ " es par");
    else   document.write("<h3> El numero " +numero1+ " es impar </h3>");
}

//Llamada a la funcion mostrar por consola o documento si es par o impar 
for (var i=0;i<=numero1;i++)
    mostrar(i);
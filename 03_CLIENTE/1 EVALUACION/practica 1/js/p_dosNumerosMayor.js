//Programa que pida dos números y me diga cual es mayor, menor o iguales

'use strict'
    
let numero1 = parseInt(prompt('Introduce el primer numero'));
let numero2 = parseInt(prompt('Introduce el segundo numero',0));

console.log(numero1+numero2);
//Ejemplo de bucle que pide numeros hasta que sean correctos

while (numero1 <=0 || numero2 <= 0 || isNaN(numero1) || isNaN(numero2)){
    numero1 = parseInt(prompt('Introduce el primer numero',0));
    numero2 = parseInt(prompt('Introduce el segundo numero',0));

    console.log(numero1);
    console.log(numero2);
}
if (numero1 == numero2)
    alert("LOS NUMEROS SON IGUALES");
else if (numero1 > numero2)
        alert("EL NUMERO MAYOR ES "+ numero1);
    else
        alert("EL NUMERO MAYOR ES "+ numero2);


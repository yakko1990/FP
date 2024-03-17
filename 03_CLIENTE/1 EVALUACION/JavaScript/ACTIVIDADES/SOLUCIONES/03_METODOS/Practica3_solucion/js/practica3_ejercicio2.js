//Programa que compruebe si existe un nombre en un array

'use strict'
    
let numeros=[];  //Declaracion de array
let numerosReverse=[];  //Declaracion de array


//Solicita 10 numeros//


for (let i=0;i<10;i++) {
    let numero=parseInt(prompt('Introduce el numero',0));
    if (isNaN(numero)){
        alert("ERROR, debes introducir un numero");
        i--;
    }
    else
        numeros[i]=numero;
    
}
//Visualiza los numeros almacenados en el array
visualizar(numeros);

alReves(numeros);
console.log(numeros.reverse());
//Visualiza los numeros al revés 
console.log("Listado al reves");
visualizar(numerosReverse);

//Función que da la vuelta a un array
function alReves(numeros){
    let j=0;
    for (let i=((numeros.length)-1);i>=0;i--){
        numerosReverse[j]=numeros[i];
        j++;

    }
   
}

//Funcion que visualiza el array
function visualizar(lista){
    for (let i=0;i<lista.length;i++)
        console.log(`Numero : ${lista[i]}`);
}
    
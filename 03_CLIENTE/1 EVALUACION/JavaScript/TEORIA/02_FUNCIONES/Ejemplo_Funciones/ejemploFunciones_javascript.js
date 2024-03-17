//Ejemplo de funciones anónimas. Función que no tiene nombre

'use strict'
    
const pelicula=function (nombre){
        return "La pelicula es: "+ nombre
}
//Llamada a la funcion
console.log(pelicula("Regreso al futuro"));

//Otro ejemplo de funcion callback. Sumar todos los números pares de una lista

const numeros=[3,4,8,12,25];

const esPar=function(numero){
    if (numero % 2 == 0)
    return true;
else  return false;

}
function sumaPar(numeros){
    let suma=0;
    numeros.forEach(numero => {
        console.log(numero);
        if (esPar(numero))
            suma=suma+numero
    });
    document.write(`La suma de los numeros pares es ${suma}`);
    
}

//Llamada a la funcion sumaPar
sumaPar(numeros);


//Ejemplo callBack

const potencia=function(numero){
    document.write(`<p> La potencia de ${numero} es ${Math.pow(numero,2)}`);

}
const mostrarPotencias=function(potencia){
    
    numeros.forEach(numero => {
        potencia(numero);
    });
    
    
}

//Ejecutar
mostrarPotencias(potencia);

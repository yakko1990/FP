//Programa que compruebe si existe un nombre en un array

'use strict'
    
let nombre = prompt('Introduce nombre, pulse Cancelar para finalizar');
let listaNombres=[];  //Declaracion de array
let i=0;
let nombreAencontrar="";

//Solicita nombres hasta que el usuario pulse cancelar//


while (nombre!=null) {
    listaNombres[i]=nombre;
    nombre = prompt('Introduce el nombre, pulse Cancelar para finalizar');
    i++;
}
//Visualiza los nombres almacenados en el array
visualizarNombres(listaNombres);

//Función que comprueba si ha encontrado el nombre a buscar
function encontrado(nombre, listaNombres){
    let encontrar=false;
    for (let i=0;i<listaNombres.length;i++){
        if (nombre==listaNombres[i]){
            console.log(nombre);
            encontrar=true;
            break;
        }
    }
    
    return encontrar;
}

const mostrar=function(){
    if (encontrado(nombreAencontrar,listaNombres))
        alert("El nombre de "+nombreAencontrar+ " ha sido encontrado");
    else   alert("El nombre de "+nombreAencontrar+ " no ha sido encontrado");
}

//Llamada a la funcion mostrar si el array tiene elementos 
if (listaNombres.length>0){
    nombreAencontrar = prompt('Introduce nombre a buscar');
    mostrar();
}

//Funcion que visualiza los nombres por consola
function visualizarNombres(listaNombres){

    for (let i=0;i<listaNombres.length;i++)
        console.log(" "+listaNombres[i]);
}
    
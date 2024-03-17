/*
Realizar una pequeña aplicación en JavaScript que al usuario adivinar un número de 0 a 50. El usuario dispone de 5 intentos.
• Generar un número aleatorio de 0 a 50. Mostrar el número generado por la consola para comprobar
que el programa funciona correctamente
• Mediante prompt se le solicita un número al usuario. Si Acierta finaliza la ejecución del programa
con un Alert en el que se le indica que “Enhorabuena”
• En caso contrario le indica al usuario si el número es mayor o menor.
• Si transcurridos los 5 intentos no encuentra el número muestra un Alert “Lo siento, no ha conseguido adivinar el número “ 
*/

let aleatorio = (Math.round(Math.random()*50));
console.log("Número aleatorio  " + aleatorio);

let intentos = parseInt(prompt("cuantos intentos necesitas para adivinar el número?"))
let peticion = parseInt(prompt("Dime un numero"));
let cont=0;

while(( aleatorio != peticion ) && (cont< intentos -1)){    
    cont++;    
   
    if (aleatorio<peticion){
        alert("tu número es mayor");
    }
    else{
        alert("tu número es nemor")
    }
    peticion = parseInt(prompt("intentalo de nuevo"));    
    
}

if (aleatorio == peticion){
    alert("Enhorabuena");
    document.write("Felicidades has acertado");

}else{
    alert("Lo siento no has conseguido adivinar el número");
    document.write("Lo siento no has conseguido adivinar el número");
}





 
 

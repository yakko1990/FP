/*
Realizar una pequeña aplicación en JavaScript que al usuario adivinar un número de 0 a 50. El usuario dispone de 5 intentos.
• Generar un número aleatorio de 0 a 50. Mostrar el número generado por la consola para comprobar
que el programa funciona correctamente
• Mediante prompt se le solicita un número al usuario. Si Acierta finaliza la ejecución del programa
con un Alert en el que se le indica que “Enhorabuena”
• En caso contrario le indica al usuario si el número es mayor o menor.
• Si transcurridos los 5 intentos no encuentra el número muestra un Alert “Lo siento, no ha conseguido adivinar el número “ 
*/

let aleatorio = (Math.round(Math.random()*50));                                 // para obtener un número aleatorio y que sea un número entero
console.log("Número aleatorio  " + aleatorio);

let peticion = parseInt(prompt("Dime un numero"));                              // Se solicita al usuario un número y lo pasamos a número entero

while (isNaN(peticion) || ( peticion > 50) || (peticion < 0)){                  //  Para comprobar que el usuario introduce un dato correcto,    
    peticion = parseInt(prompt("por favor inserta un número enter 0 y 50"));    //utilizo un bucle while para que introduzca datos  hasta que sea correcto 
}    

for (let i = 0; i < 4 ; i++) {                                                  // Al saber el número de iteraciones, es preferible escoger el bucle for

    if (aleatorio == peticion){                                                 // Al acertar salimos del bucle
        break;
    } 
    if (aleatorio<peticion){                                                    // Si el usuario no ha acertado le decimos si su elección es mayor o menor que el número aleatorio
        alert("tu número es mayor");
    }
    else{
        alert("tu número es nemor")
    }

    peticion = parseInt(prompt("intentalo de nuevo"));                          //  se vuelve a pedir un número hasta que se agoten los intentos o el usuario acierte
    while (isNaN(peticion)|| ( peticion > 50) || (peticion < 0)){               // se vuelve a comprobar que el dato introducido es correcto.
        peticion = parseInt(prompt("Por favor insertar un número entre el 0 y el 50"));
    }    
}
 
if(aleatorio == peticion){  
    alert("!!!! Enhorabuena has acertado el número !!!!");                                                      // se manda un mensaje al susario para decirle que ha ganado o perdido.    
}
else{
    alert("Lo siento, no ha conseguido adivinar el número")
}





 
 

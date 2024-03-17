// console.log("hola");
// Ejercicio : Realiza un script al que se le introduce un número e indique si dicho número es
// primo. En ese caso mostrará una lista con todos los números primos menores que dicho número

const numeroPrimo = (numero) => {

    let contador = 0;

    if (numero == 1) return false;

    for (let index = 1; index <= numero; index++) {
        if (numero % index == 0) contador++;

    }

    if (contador > 2) return false;

    return true;


}

const numerosPrimosMenores = (numero) => {


    if (numeroPrimo(numero)) {

        console.log(`${numero} es un número primo`);

        for (let numeroMenor = 1; numeroMenor < numero; numeroMenor++) {
            if (numeroPrimo(numeroMenor))
                console.log(numeroMenor);

        }


    } else {
        console.log(`${numero} no es un número primo`);
    }

}

numerosPrimosMenores(23);

const media = (array) => {

    let sumaTotal = 0;
    for (let index = 0; index < array.length; index++) {
        sumaTotal += array[index];
    }

    console.log("Media: " + sumaTotal / array.length);

}

// media([1, 4, 6, 10]);

const factorial = (numero) => {

    let total = 1;

    for (let index = 1; index <= numero; index++) {
        total *= index;

    }

    console.log("factorial: " + total);

}

// factorial(5);


const esPar = (numero) => {

    return numero % 2 == 0;

}

const pares = (array) => {

    for (let index = 0; index < array.length; index++) {
        if (esPar(array[index])) {
            console.log("Par: " + array[index]);
        } else {
            document.write(`<p>${array[index]}</p>`);
        }
    }
}


// pares([1, 2, 4, 5, 8, 15]);


function mediaValores() {
    let contador = 0;
    let sumaTotal = 0;
    let respuesta;
    let numero;
    let numerosValidos = [];

    respuesta = prompt("introduce número");

    while (respuesta != null) {

        numero = parseInt(respuesta);

        if (isNaN(numero)) {
            alert("Valor no válido");
        } else {
            sumaTotal += numero;
            contador++;
            numerosValidos.push(numero);
        }

        respuesta = prompt("Introduce número");
    }

    let tmp = "";

    for (let index = 0; index < numerosValidos.length; index++) {
        tmp += numerosValidos[index] + ",";

    }


    alert(`Total: ${sumaTotal}\nNúmero válidos introducidos: ${contador}\n Media: ${sumaTotal / contador}\nNumero introducidos: [${tmp}]`);


}

mediaValores();



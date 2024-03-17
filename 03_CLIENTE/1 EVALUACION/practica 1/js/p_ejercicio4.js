window.onload = function () {
    let numero = 0;
    let numeroI = 0;

    let cont = 0;
    


    numero = (prompt("Introduce un numero entero", 0));
    if (numero == null)
        alert("Ha pulsado cancelar");
    else {
        numero = parseInt(numero);
        if (isNaN(numero))
            alert("Valor incorrecto");
        else {
            document.write("<h2>CALCULAR EL NUMERO DE CIFRAS DE UN NUMERO </h2>" + "<BR>");
            numeroI = numero;

            do {
                numero = numero / 10;
                numero = Math.floor(numero);
                cont++;

            } while (numero > 0);
            document.write(`<p>El numero ${numeroI} tiene ${cont} cifras </p>`);
        }
    }
}
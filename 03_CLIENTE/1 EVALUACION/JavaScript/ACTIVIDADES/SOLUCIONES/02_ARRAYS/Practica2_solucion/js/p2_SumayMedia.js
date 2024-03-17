let numero1;
let suma=0;
let media;
let cont=0;  
//Declarar un array vacío
let numeros=[];

numero1 = parseInt(prompt('Introduce números, cero para finalizar'));

while (numero1!=0){
    numeros.push(numero1);
    suma=suma+numero1;
    cont++;    
    numero1 = parseInt(prompt('Introduce números, cero para finalizar'));
}while (numero1>0);

media=suma/cont--;

document.write(`<p> La suma de los numeros es ${suma} </p>`);
document.write(`<p> La media de los numeros es ${media} </p>`);

document.write("<hr>");//Muestra una linea horizontal

document.write("<h1>LOS NUMEROS SON </h1>"); 
document.write("<hr>");//Muestra una linea horizontal


//Mostrar los números almacenados en el array
numeros.forEach(num => {
    document.write(num+"-");
});

//Calcular la suma y media recorriendo el array con un bucle for
let sumaA=0;
let mediaA=0;

for (let i=0;i<numeros.length;i++){
    console.log(numeros[i]);
    sumaA=sumaA+numeros[i];
}
//Calcular la media
media=suma/numeros.length;

document.write("<h1>MEDIA Y SUMA RECORRIENDO EL ARRAY </h1"); 
document.write("<hr>");//Muestra una linea horizontal

document.write(`<p> La suma de los numeros es ${suma} </p>`);
document.write(`<p> La media de los numeros es ${media} </p>`);

document.write("<hr>");//Muestra una linea horizontal

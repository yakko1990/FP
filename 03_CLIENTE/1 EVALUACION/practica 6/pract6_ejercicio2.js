'use strict'
//El evento onload de Javascript 
//se activa cuando se termina de cargar la página.

window.addEventListener('load', function() {
    console.log('La página ha terminado de cargarse!!');
    
    let boton=document.getElementById('crear');   
    boton.addEventListener('click',crearCajas);

    let insertar=document.getElementById('antes');
    insertar.addEventListener('click',anadirAntes);

    let despues=document.getElementById('despues');
    despues.addEventListener('click',anadirDespues);
});

//Función que cambia el color de la caja al pasar con el ratón por encima

function cambiarColor(event){  
   
    //this.style.background='blue';
    //Otra forma
    event.target.style.background='blue';
}

/* Función que vuelve al color original al sacar el ratón. Para ello 
   debe comprobar de que clase se trata*/

function volverColor(event){  
    console.log("De que clase se trata"+this.getAttribute('class'));
    if (this.getAttribute('class')=="caja amarillo")
         this.style.background='chartreuse';
    else if (this.getAttribute('class')=="caja naranja")
            this.style.background='orangered';
        else
            this.style.background='blueviolet';
}

//Añadir cajas antes de una posicion determinada
function anadirAntes(){
    let cajasCreadas=document.getElementsByClassName('caja');

    let posicion=document.getElementById('numeroAnterior').value;
    //Obtener el padre de las cajas
    let padre=cajasCreadas[0].parentNode;

    //Crear la nueva caja
    let nuevacaja=document.createElement("div");
    
    //Asignar estilos a la caja
    nuevacaja.setAttribute('class', 'caja amarillo');
    //Poner las cajas a la escucha del evento mouse
    nuevacaja.addEventListener('mouseenter',cambiarColor);

    nuevacaja.addEventListener('mouseleave',volverColor);
  
    padre.insertBefore(nuevacaja,cajasCreadas[posicion]);

    //Volver a numerar las cajas 
    for ( let i=posicion-1; i<cajasCreadas.length;i++){

        //Asignar un id a la caja
        cajasCreadas[i].setAttribute('id', i);
        cajasCreadas[i].innerHTML=`<h1>${i}</h1>`;
        
        
    }



}

//Javascript no proporciona una funcion para insertar despues de una posicion dada
function insertAfter(e,i){ 
    if(e.nextSibling){ 
        e.parentNode.insertBefore(i,e.nextSibling); 
    } else { 
        e.parentNode.appendChild(i); 
    }
}

//Añadir cajas despues de una posicion determinada
function anadirDespues(){
    let cajasCreadas=document.getElementsByClassName('caja');

    let posicion=document.getElementById('numeroPosterior').value;
    //Obtener el padre de las cajas
    let padre=cajasCreadas[0].parentNode;

    //Crear la nueva caja
    let nuevacaja=document.createElement("div");
    
    //Asignar estilos a la caja
    nuevacaja.setAttribute('class', 'caja naranja');
    //Poner las cajas a la escucha del evento mouse

    nuevacaja.addEventListener('mouseenter',cambiarColor);

    nuevacaja.addEventListener('mouseleave',volverColor);
  
   
    insertAfter(cajasCreadas[posicion],nuevacaja);

    //Volver a numerar las cajas 
    for ( let i=posicion; i<cajasCreadas.length;i++){

        //Asignar un id a la caja
        cajasCreadas[i].setAttribute('id', i);
        cajasCreadas[i].innerHTML=`<h1>${i}</h1>`;
        
        
    }
}

function crearCajas(){
    //Pasos para crear elementos de la estructura DOM
    //Numero de cajas que queremos crear
    let numero=parseInt(document.getElementById('cantidad').value);
    console.log(numero);

    let numeroDeCajas= document.querySelectorAll(".caja").length;
    console.log(numeroDeCajas);

    for ( let i=numeroDeCajas; i<numero;i++){

        let caja=document.createElement("div");
        console.log(caja);
        caja.setAttribute('id', i);

        caja.innerHTML=`<h1>${i}</h1>`;

        //Asignar estilos a la caja
        caja.setAttribute('class', 'caja');

        //Poner las cajas a la escucha del evento mouse
        caja.addEventListener('mouseenter',cambiarColor);

        caja.addEventListener('mouseleave',volverColor);

        //Añadir las cajas al documento
        let seccion=document.getElementById("seccion");
        seccion.append(caja);
    }
    

}

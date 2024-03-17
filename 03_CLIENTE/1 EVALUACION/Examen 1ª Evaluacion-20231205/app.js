'use strict'

window.onload = () => {
    let botonCalcular = document.getElementById("boton");
    
    botonCalcular.addEventListener("click", function (e) {
        console.log(e)
        let entrada = document.getElementById("entrada").value;
        calcular(entrada);
    });

    let botonModoTexto = document.getElementById("boton2");
    botonModoTexto.addEventListener("click", function (e) {
        console.log(e)
        let entrada = document.getElementById("entrada").value;
        calcularModoTexto(entrada)
    });
    
}
let padrePiramide = document.getElementById("cuerpoPiramide");
let array = [];



//let entrada = document.getElementById("entrada").value;
function calcular(entrada) {

    
    clear()   
    
        for (let i = 0; i < entrada; i++) {
            for (let j = 1; j < i + 2; j++) {
                let p = document.createElement('span');
                p.innerHTML = (j); 
                padrePiramide.appendChild(p)
            }           
            let br = document.createElement('br');
            padrePiramide.appendChild(br);

    }
}


function calcularModoTexto(entrada) {  
    clear()  
    
    for (let index = 0; index < entrada; index++) {
        let parentSpan = document.createElement('div');
                                                                                       
        for (let ind = 0; ind <= index; ind++) {
            
            let newDiv = document.createElement('div');
            //newDiv.style.backgroundColor = ("blue");            
            newDiv.setAttribute('class','caja');
            newDiv.innerHTML = ind +1;
            parentSpan.appendChild(newDiv);
            parentSpan.classList.add('seccion');
            parentSpan.addEventListener('click', remove);
        }
        ;
        padrePiramide.appendChild(parentSpan);
    }     
    
}

const remove = (evt) =>{
    evt.target.parentNode.remove();
}
  
function clear ()  {
    padrePiramide.innerHTML = "";
}

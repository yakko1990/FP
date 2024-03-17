

window.onload = () =>{
    let numeros = [];
    
    function numerosAleatorios() {
        while (numeros.length < 8) {
            let numero = Math.floor(Math.random() * 16) + 1;
            if (!numeros.includes(numero)) {
                numeros.push(numero);
            }
        }       
    }

    numerosAleatorios();
    console.log(numeros);

    let numerosUsuario = [];

    function numeroUsuario() {
       for (let i = 0; i < 4; i++) {      
           let userNumb = prompt("dime un número")
           numerosUsuario.push(userNumb);
       } 
    }
    
    numeroUsuario();
    console.log(numerosUsuario);

    let vistaNumero = document.querySelectorAll('td');
    console.log(vistaNumero);

    
    vistaNumero.forEach(element => {
        //console.log(element.id);
        if (numeros.includes(parseInt(element.id))) {
            element.innerText = element.id 
        } 
        if ((numerosUsuario.includes(element.id) ) && (numeros.includes(parseInt(element.id)))){
            element.setAttribute('style', 'background-color: yellow')
        }
       
            
    });

   numeros.forEach(element => {
    
   });
}



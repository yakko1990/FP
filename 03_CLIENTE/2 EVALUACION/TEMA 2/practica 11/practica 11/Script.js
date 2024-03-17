window.onload = () => {

    console.log(window.innerWidth);
    const coche1 = document.getElementById("coche1");
    const coche2 = document.getElementById("coche2");

    const posInicialCoche1 = coche1.setAttribute("left", "10"); 
    console.log(coche1.getAttribute("left"));
    console.log(posInicialCoche1);
    const posInicialCoche2 = coche2.setAttribute("left", "10");

    const Iniciar = document.getElementById("btnIniciar");

    Iniciar.addEventListener("click", comenzar);

   
    
    function comenzar() {
        console.log("escucho");

        let velocidad1 = parseInt(Math.random(10, 50)*10000);
        console.log(velocidad1);
        let velocidad2 = parseInt(Math.random(10, 50)*100);
        console.log(velocidad2);

        coche1.style.left = coche1.getAttribute("left")+velocidad1;
        coche2.style.left = coche2.getAttribute("left") + velocidad2;
        console.log(coche1.style.left);


    }



}
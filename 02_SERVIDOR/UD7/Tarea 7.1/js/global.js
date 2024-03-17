const base_url = "http://localhost:3000/controller/FrontController.php";
let userId = null;
window.onload = onceLoaded;


function onceLoaded() {
  console.debug("window loaded");
  document.querySelector("#formLogin").onsubmit = login;

  getRoles();

  let cerrar = document.getElementById("spacerrar");
  cerrar.addEventListener("click", logoutModal);

 
}

/*
 */

/* let cerrar = document.getElementById("spacerrar");
    cerrar.addEventListener("submit", (e) => {
        e.preventDefault();
        (showModal("spa_modal", "Confirmación de cierre de sesión",
            "Está seguro/a de que desea cerrarsesión?", "Aceptar",
            "Cancelar", logoutCliente))
    } )*/

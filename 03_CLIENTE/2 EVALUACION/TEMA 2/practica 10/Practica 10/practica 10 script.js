window.onload = () => {
  let contenedor = document.getElementById("resultado");

  let crear = document.getElementById("crear");

  const botonBorrar = document.createElement("button");
  botonBorrar.innerHTML = "Borrar";
  botonBorrar.disabled = true;
  crear.parentNode.appendChild(botonBorrar);

  crear.addEventListener("click", crearTabla);

  function crearTabla() {
    let filas = document.getElementById("fila").value;
    
    let columnas = document.getElementById("columna").value;
    
    let tabla = document.createElement("table");
    contenedor.appendChild(tabla);

    for (let i = 0; i < filas; i++) {
      let fila = document.createElement("tr");
      tabla.appendChild(fila);

      for (let j = 0; j < columnas; j++) {
        let columna = document.createElement("td");
        columna.innerHTML = i;
        fila.appendChild(columna);
      }
    }

    tabla.style.border = "2px,solid,blue";
  }
};

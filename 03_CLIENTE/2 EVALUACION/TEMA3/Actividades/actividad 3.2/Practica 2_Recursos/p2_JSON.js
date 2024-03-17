//window.addEventListener('DOMContentLoaded', () => { logica
//})


class Alumno{
    constructor(nombre, dni, direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;   
    }
    getNombre() { return this.nombre; }
    setNombre(nombre) { this.nombre = nombre; }

    getDni() { return this.dni; }
    setDni(dni) { this.dni = dni; }

    getDireccion() { return this.direccion; }
    setDireccion(direccion) { this.direccion = direccion; }
}

function crearAlumno(e) {
    e.preventDefault();
    const nombre = document.getElementById("addNombre").value;
    const dni = document.getElementById("addDni").value;
    const direccion = document.getElementById("addDireccion").value;
    
    const alumno = new Alumno(nombre, dni, direccion);
    console.log(alumno);
    localStorage.setItem(alumno.getDni(), JSON.stringify(alumno));

}

window.onload = () => {

    
    document.addEventListener("submit", crearAlumno);
    
    const mostrarAlumno = document.getElementById("mostrar");
    mostrarAlumno.addEventListener("click", mostrar);
    
    

    function modificar(nombre, direccion, dni) { }
    
    function borrar(dni) {

        localStorage.forEach(element => {

            console.log(element);
            
            
        });
        
    }
    
    function mostrar() {
        const divAlumno = document.getElementById("alumnos");

        const tableAlumnos = document.createElement("table");
        divAlumno.replaceChildren(tableAlumnos);

        const cabecera = document.createElement("thead");
        tableAlumnos.appendChild(cabecera);
        const tr = document.createElement("tr");
        cabecera.appendChild(tr);

        const datosCabeceraDni = document.createElement("th");
        datosCabeceraDni.innerHTML = "DNI";
        tr.appendChild(datosCabeceraDni);

        const datosCabeceraNombre = document.createElement("th");
        datosCabeceraNombre.innerHTML = "Nombre";
        tr.appendChild(datosCabeceraNombre);

        const datosCabeceraDireccion = document.createElement("th");
        datosCabeceraDireccion.innerHTML = "Direccion";
        tr.appendChild(datosCabeceraDireccion);

        const body = document.createElement("tbody")
        tableAlumnos.appendChild(body);

        const trBody = document.createElement("tr");
        body.appendChild(trBody);

        for (let i = 0; i < localStorage.length; i++) {           
            const trfor = document.createElement("tr");

            const alumnoDni = document.createElement("td");
            let alumno = JSON.parse(localStorage.getItem(localStorage.key(i)));
           
            alumnoDni.innerHTML = alumno.dni;
            trfor.appendChild(alumnoDni);
            
            const alumnoNombre = document.createElement("td");         
            alumnoNombre.innerHTML = alumno.nombre;
            trfor.appendChild(alumnoNombre);
    
            const alumnoDireccion = document.createElement("td");            
            alumnoDireccion.innerHTML = alumno.direccion;
            trfor.appendChild(alumnoDireccion);

            body.appendChild(trfor);
            
        }
        

       

        
        



    }
    
    


    
}
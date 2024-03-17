
// <script src="script"></script>
window.onload = () => {   
    
    'use strict'
//Clase Vehiculo
    class Vehiculo {
        constructor(modelo, marca, precio, km) {
            this.modelo = modelo;
            this.marca = marca;
            this.precio = precio;
            this.km = km;
        }
        getModelo(){
            return this.modelo;
            }
            setModelo(modelo){
            this.modelo=modelo;
            }
            getMarca(){
            return this.marca;
            }
            setMarca(marca){
            this.marca=value;
            }
            getPrecio(){
            return this.precio;
            }
            setPrecio(value){
            this.precio=value;
            }
            //metodos
            mostrarDatos() {
            return "El vehiculo " + this.modelo;
            }
           
    }
    //let vehiculos = {};

    document.addEventListener("submit", insertarVehiculo);


    function insertarVehiculo(e) {
        e.preventDefault();
        let vehiculos = document.getElementById("crearVehiculos")
        //console.log("estoy a la escucha")
    }

}
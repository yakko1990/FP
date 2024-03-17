package Excepciones.EmpleadosReparto;

public class ExcEmpleados extends Exception {

    public void comprobarNombre(String nombre) throws Exception {

        if ((!nombre.matches("^[a-zA-Z]*$")) || (nombre.length() > 20)){
            System.out.println("El nombre introducido tiene un formato incorrecto");
        }
    }
   public void  comprobarEdad( int edad) throws Exception {
       if (edad < 0 || edad > 999) {
           throw new Exception("La edad debe ser un número de hasta 3 dígitos");
       }
   }
    public void comprobarSalario( double salario) throws Exception {
        if (String.valueOf(salario).length() < 5) {
            throw new Exception("Error: El sueldo debe ser un número de 5 cifras.");
        }
    }
}
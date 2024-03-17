

package tema_10_excepciones.Empleados;


public abstract class Empleado {

  private String nombre;
  private String dni;
  private int edad;
  private double sueldoDiario;
  private double salario;
  
    //Constantes
  public final double plus = 300;
  
  public Empleado (String nombre, String dni, int edad, double salario){
      this.nombre = nombre;
      this.dni = dni;
      this.edad = edad;
      this.salario = salario;
  }
  
   public double getSalario() {
        return salario;
    }
 
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
  
    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", ";
    }
 
    
  //Metodo abstracto, obliga a las clases hijas que implementen esta función
    public abstract boolean plus();
 
}
package Excepciones.Vehiculos;

public class Vehiculo extends Excepciones{
    private String color;
    private String modelo;
    private String matricula;
    private  int anioFabricacion;

    public Vehiculo(String color, String modelo, String matricula, int anioFabricacion)throws MatriculaException, ColorException {
        if (!validarMatricula(matricula)) {
            throw new MatriculaException("La matrícula no cumple con el formato adecuado");
        }
        if (!validarColor(color)) {
            throw new ColorException("El color no es válido");
        }
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
    }

    private boolean validarMatricula(String matricula) {
        return matricula.length() == 7 && matricula.matches(".*[a-zA-Z]{3}$");
    }

    private boolean validarColor(String color) {
        return color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("blanco")
                || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("negro");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

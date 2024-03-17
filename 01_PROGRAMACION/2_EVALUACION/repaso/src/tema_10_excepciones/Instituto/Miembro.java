/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_10_excepciones.Instituto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nuria
 */
public abstract class Miembro extends Persona{
    private Date fechaIncorporacion;

    public Miembro(Date fechaIncorporacion, String DNI, String nombre, int edad, String direccion) {
        super(DNI, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public abstract void aplicarBonificacion();

    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        return super.toString() +
                "\nFecha Incorporacion: " + dateFormat.format(this.fechaIncorporacion);
    }
}

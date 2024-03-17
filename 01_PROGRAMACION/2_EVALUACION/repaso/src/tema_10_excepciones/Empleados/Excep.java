

package tema_10_excepciones.Empleados;

public class Excep extends Exception {

static final int NOMBRE_NOTEXTO = 1;    
static final int DNI_LETRA_MAL = 2;
static final int DNI_TAMANIO_MAL = 3;
static final int EDAD_NUMERO_MAL = 4;
static final int SUELDO_NUMERO_MAL = 5;
static final int ERROR_DESCONOCIDO = 6;


private String fallo;



public Excep (){}


public Excep (String s) {
 super(s); 
}

public Excep (int f) {

    switch (f){
        case 1:
            fallo = "ERROR: El nombre del empleado informado no es texto";
            break;
        case 2:
            fallo = "ERROR: La letra del DNI no es correcta";
            break;
        case 3:
            fallo = "ERROR: El número de dígitos del DNI no es correcto";
            break;
        case 4:
            fallo = "ERROR: No se han informado dígitos en la edad";
            break;
        case 5:
            fallo = "ERROR: No ha informado dígitos númericos en el sueldo";
            break;
        default:
            fallo = "ERROR: Error desconocido";
            break;            
    }   
}


public String getMessage(){
    return fallo;
}



    
}
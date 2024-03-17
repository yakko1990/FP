package MasEjercicios.g_Empleados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implementar en Java la siguiente jerarquía:
 * La clase Empleado contendrá la siguiente información: nombre, salario, fecha incorporación
 * De la clase Empleado heredarán la clase Directivo, descendiente de la clase Empleado, contendrá, además de los atributos de su clase base, los atributos
 * propios cargo y departamento; y la clase Operario, con su atributo propio área y nave.
 * A su vez, las clases Oficial (atributo propio línea de fabricación) y Técnico (atributo propio sección), serán descendientes de la clase Operario.
 * Todas las clases contendrán un método toString() para mostrar su información.
 *
 * En el main, crear un array de 7 elementos, que contenga empleados de todos los tipos y, posteriormente mostrar su información por pantalla. *
 * */


public class Principal {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Empleado[] emp = new Empleado[7];

        try {
            Date d = sdf.parse("01/01/2000");
            emp[0] = new Oficial("Paco", 1500, d, "zona 1", "nave 2", "linea 3");
            emp[1] = new Tecnico("Maria", 1600, sdf.parse("06/09/2015"), "zona 4", "nave 1", 2);
            emp[2] = new Oficial("Fernando", 1400, sdf.parse("01/03/2006"), "zona 2", "nave 3", "linea 2");
            emp[3] = new Oficial("Ana", 1450, sdf.parse("03/10/2009"), "zona 3", "nave 1", "linea 1");
            emp[4] = new Directivo("Marcos", 1900, sdf.parse("02/02/2000"), "supervisor", "personal");
            emp[5] = new Directivo("Miriam", 1980, sdf.parse("06/03/2002"), "gestor", "logistica");
            emp[6] = new Operario("Federico", 1300, sdf.parse("02/11/2018"), "zona 3", "nave 2");
        } catch (ParseException e) {
            System.out.println(e.getStackTrace());
        }

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());
        }
    }
}

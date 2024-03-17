package Excepciones.Excepciones_instituto;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validar {

    public static String nombre(String nombre)  {
        Scanner sc = new Scanner(System.in);
    do {
        try{
            Pattern pat = Pattern.compile("[A-Za-z]{1,20}");
            Matcher mat = pat.matcher(nombre);

            if(!mat.matches()){
                throw new Exception("El nombre del empleado informado no es texto");

            }else {
                return (nombre);
            }

        }catch( Exception e){
            System.out.println("Introduzca un nombre de empleado correcto: ");
            nombre= nombre(sc.next());
        }

    }while (true);

    }

    public static String validarFechaIncorporacion(String fecha){
        Scanner sc = new Scanner(System.in);
        do{
            try{

                Pattern pat = Pattern.compile("[0-3]{2}[0-2]{2}[0-9]{4}");
                Matcher mat = pat.matcher(fecha);

                if(!mat.matches()){
                    throw new Exception("la fecha que has introducido no esta en el formato correcto");
                }else {
                    return (fecha);
                }

            }catch (Exception e){
                System.out.println("por favor introduzca la fecha con el formato correcto dd/MM/yyyy gracias");
                fecha = (sc.next());
            }
        }while (true);
    }



    }




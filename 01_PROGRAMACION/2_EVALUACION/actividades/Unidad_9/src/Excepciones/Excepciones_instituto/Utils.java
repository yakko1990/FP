package utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static int calcularAnios(LocalTime fechaIncorporacion) {

        LocalTime ahora = LocalTime.now();
        long anios = Duration.between(ahora, fechaIncorporacion).toDays();

        return (int) anios / 365;

    }

    //string
    //int
    //fecha

    public static boolean validarString(String cadena, String regex, String msgInput, int codigoExcepcion) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(cadena);

                if (!matcher.matches())
//                    throw  new ExcepcionPersonalizada(codigoExcepcion);
                    throw new Exception("Valor no válido");


                return true;
            } catch (Exception exception) {

                exception.getMessage();
                System.out.println("Se produjo un error");
                System.out.println(msgInput);
                cadena = sc.next();
                sc.nextLine();

            }

        } while (true);

    }


}

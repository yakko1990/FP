package varios;//Desarrolla un programa que lea constantemente desde la entrada estándar hasta recibir
// un enter como finalización. Cada carácter será almacenado de forma independiente en
// una colección que permitirá recuperar el contenido en orden inverso al que fueron
// introducidos. Una vez recibido enter, recorre la coleccion mostrando por pantalla
// el contenido almacenado. Recuerda que los carácteres deben leerse por separado y
// no se debe de emplear la clase String.



import java.util.*;

    public class Ej3_pdf {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         ArrayList<Character> caracteres = new ArrayList<>();

         System.out.println("Ingresa los carácteres que desees añadir");
         char c = (char) sc.nextInt();
         while (c != 10){
             caracteres.add(c);
         }
         for (int i = caracteres.size()-1; i < 0 ; i--) {
             System.out.println(caracteres.get(i));

         }

         sc.close();

     }
    }


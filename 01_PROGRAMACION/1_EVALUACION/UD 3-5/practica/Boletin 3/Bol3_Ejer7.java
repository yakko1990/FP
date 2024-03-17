import java.util.Scanner;

public class Bol3_Ejer7 {

    /**
     * Hallar áreas
     * 
     * @param base    primer valor
     * @param altura  segundo valor
     * @param bandera valor que dependiendo de si es true o false desencadena una
     *                operacion determinada
     * @return el resultado del área ya sea de triangulo, rectangulo o cuadrado,
     *         dependerá del valor de la bandera
     */

    static double areas(double base, double altura, boolean bandera) {

        double area = 0;

        if (bandera == true) {
            area = (base * altura) / 2;
        } else {
            {
                area = base * altura;
            }
        }
        return area;
    }

    /**
     * Hallar el área de un circulo
     * 
     * @param radio valor del radio
     * @return el area del circulo
     */

    static double circulo(double radio) {
        double area;

        area = Math.PI * Bol3_Ejer3.potencia(radio, 2);
        return area;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double radio;
        boolean bandera;
        int opcion;

        do {
        System.out.println("1) Area de un triángulo (base*altura/2)");
        System.out.println("2) Area de un rectángulo (base*altura)");
        System.out.println("3) Area de un cuadrado (lado*lado)");
        System.out.println("4) Area de un círculo (Pi*radio)");
        System.out.println("5) Salir");
        opcion = sc.nextInt();

        switch (opcion) {

        case 1:
            System.out.println("Introduce base y altura");
            base = sc.nextDouble();
            altura = sc.nextDouble();
            bandera = true;
            System.out.println("Area del trangulo: " + areas(base, altura, bandera));
            break;
        case 2:
            System.out.println("Introduce base y altura");
            base = sc.nextDouble();
            altura = sc.nextDouble();
            bandera = false;
            System.out.println("Area del rectangulo: " + areas(base, altura, bandera));
            break;
        case 3:
            System.out.println("Introduce los lados");
            base = sc.nextDouble();
            //altura = sc.nextDouble();
            bandera = false;
            System.out.println("Area del cuadrado: " + areas(base, base, bandera));
            break;
        case 4:
            System.out.println("Introduce el radio");
            radio = sc.nextDouble();
            System.out.println("Area del circulo: " + circulo(radio));

            break;
        case 5:
            System.out.println("Fin del programa");
            break;

        default:
            System.out.println("Error, un número del menú");
            break;
        }//
    } while (opcion!=5);

    }

}

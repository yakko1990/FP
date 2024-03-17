public class variables_java {
    public static void main(String[] args) {

        String saludo= "Hola que tal? "; // los strings se caracterizan por que se pueden realizar muchas acciones
        int longitud = saludo.length();
        boolean stringVacio = saludo.isEmpty(); //

        int edad = 45; // nume+ros enteros
        float altura = 1.75F; // números decimales f al final
        double valorDecimalLargo = 5.36265895456458;  // double esto se usa cuando se esperan muchos decimales
        long numeroLargo = 45879654562123654L; //esto se usa cuando se va a usar un numero entero muy largo l al final
        boolean isday = true ; //para los boleanos solo pueden tener dos valores o true o false
        char miInicial = 'o'; //solo para usar un carazter

        System.out.println( saludo + longitud);
        System.out.println( saludo + stringVacio);

        System.out.println("mi edad es: "  + edad);
        System.out.println("mi altura es : "+ altura);
        System.out.println( numeroLargo +  " " + valorDecimalLargo);
        System.out.println("es de dia" + isday);
        System.out.println("inicial" + miInicial);

    }
}
package MasEjercicios.j_VehiculosInterfaces;

public class Ejecutable {
    static Vehiculo[] vehiculos;

    public static void main(String[] args) {
        rellenaArray();

        for (Vehiculo v: vehiculos) {
            for (int i = 0; i < 5; i++) {
                System.out.println(v.acelerar(25));
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(v.frenar(30));
            }
            System.out.println("_____________");
        }
    }

    private static void rellenaArray() {
        vehiculos = new Vehiculo[4];
        vehiculos[0] = new Motocicleta();
        vehiculos[1] = new Turismo();
        vehiculos[2] = new Motocicleta();
        vehiculos[3] = new Turismo();
    }
}

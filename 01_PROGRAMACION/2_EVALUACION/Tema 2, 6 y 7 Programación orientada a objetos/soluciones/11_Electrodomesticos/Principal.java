package MasEjercicios.Electrodomesticos;

public class Principal {
    public static void main(String[] args) {
        Electrodomestico elec[] = new Electrodomestico[10];

        elec[0] = new Electrodomestico(300, 80, 'C', "Azul");
        elec[1] = new Lavavajillas(250, 35);
        elec[2] = new Television(750, 50, 'C', "negro", 55, false);
        elec[3] = new Electrodomestico();
        elec[4] = new Electrodomestico(300, 20, 'E', "gris");
        elec[5] = new Lavavajillas(400, 70, 'X', "blanco", 40);
        elec[6] = new Television(550, 30);
        elec[7] = new Lavavajillas(200, 90, 'B', "verde", 9);
        elec[8] = new Television(700, 60, 'C', "gris", 900, true);
        elec[9] = new Electrodomestico(80, 20);

        double sumaTotal = 0;
        double sumaTV = 0;
        double sumaLavavajillas = 0;

        for (int i = 0; i < elec.length; i++) {

            sumaTotal += elec[i].precioFinal();

            if (elec[i] instanceof Lavavajillas) {
                sumaLavavajillas += elec[i].precioFinal();
            }
            if (elec[i] instanceof Television) {
                sumaTV += elec[i].precioFinal();
            }
        }

        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma lavavajillas: " + sumaLavavajillas);
        System.out.println("Suma televisiones: " + sumaTV);
    }
}

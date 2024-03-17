package MasEjercicios.ConsumoElectrico3;

public class Principal {
    public static void main(String[] args) {
        Aparato lampara = new Aparato(100);
        Aparato secador = new Aparato(1000);

        System.out.println("El consumo electrico inicial es " + Aparato.getConsumoTotal());

        System.out.println("Enciendo lampara");
        lampara.encender();

        System.out.println("Enciendo secador");
        secador.encender();

        System.out.println("El consumo electrico es " + Aparato.getConsumoTotal());

        System.out.println("Apago el secador");
        secador.apagar();

        System.out.println("El consumo electrico es " + Aparato.getConsumoTotal());
    }
}

package RAMA.ConsumoCoche;
/**
 * Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes características:
 *  Atributos:
 * – kms. Kilómetros recorridos por el coche.
 * – litros. Litros de combustible consumido
 * – vmed. Velocidad media.
 * – pgas. Precio de la gasolina.
 *  Métodos:
 * – getTiempo. Indicará el tiempo empleado en realizar el viaje.
 * – consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
 * – consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
 * No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más apropiado para cada atributo
 *
 *
 */
public class consumo2 {
    private double km;
    private double litros;
    private double vmed;
    private double pgas;

    public consumo2(int km, int litros, double vmed, double pgas) {
        this.km = km;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public double getTiempo(){
        return km/vmed;
    }
    public double consumoMedio(){
        return litros/km*100;
    }
    public double consumoEuros (){
        return pgas*consumoMedio();
    }


    public static void main(String[] args) {
        consumo2 consu = new consumo2(120,55,90,1.55);
        System.out.println("tiempo del viaje :"+consu.getTiempo());
        System.out.println("consumo medio: "+consu.consumoMedio());
        System.out.println("Gasto medio en euros de gasolina: "+consu.consumoEuros());
    }
}

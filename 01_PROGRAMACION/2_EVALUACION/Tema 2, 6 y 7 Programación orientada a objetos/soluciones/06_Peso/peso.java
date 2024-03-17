package RAMA.peso;

/*
* Crea la clase peso, la cual tendrá las siguientes características:
 Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
 En el constructor se le pasará el peso y la medida en la que se ha tomado (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
 Deberá de tener los siguientes métodos:
– getLibras. Devuelve el peso en libras.
– getLingotes. Devuelve el peso en lingotes.
– getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb’ para libras, ‘Li’ para lingotes,
‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
Para la realización del ejercicio toma como referencia los siguientes datos:
1 Libra = 16 onzas = 453 gramos.
1 Lingote = 32,17 libras = 14,59 kg.
1 Onza = 0,0625 libras = 28,35 gramos.
1 Penique = 0,05 onzas = 1,55 gramos.
1 Quintal = 100 libras = 43,3 kg.
Crea además un método main para testear y verificar los métodos de esta clase.
*
* */


public class peso {
    double p; //almacena el peso en Kg

    peso(double dat, String tipo) {
        p = dat;
        if (tipo == "Lb") {
            p = p / getLibras();
        }
        if (tipo == "Li") {
            p = p / getLingotes();
        }
        if (tipo == "Oz") {
            p = p / getOnzas();
        }
        if (tipo == "P") {
            p = p / getPeniques();
        }
        if (tipo == "G") {
            p = p / 1000;
        }
        if (tipo == "Q") {
            p = p / getQuintales();
        }
    }

    public double getLibras() {
        return p / 0.453;
    }

    public double getLingotes() {
        return p / 14.59;
    }

    public double getOnzas() {
        return p / 0.02835;
    }

    public double getPeniques() {
        return p / 0.00155;
    }

    public double getQuintales() {
        return p / 43.3;
    }

    public double getPeso(String tipo) {
        if (tipo == "Lb") {
            return getLibras();
        }
        if (tipo == "Li") {
            return getLingotes();
        }
        if (tipo == "Oz") {
            return getOnzas();
        }
        if (tipo == "P") {
            return getPeniques();
        }
        if (tipo == "K") {
            return p;
        }
        if (tipo == "G") {
            return p / 1000;
        }
        if (tipo == "Q") {
            return getQuintales();
        }
        return 0;
    }

    public static void main(String[] args) {
        peso c = new peso(1000, "G");
        System.out.println(c.getPeso("K"));
        System.out.println(c.getLibras());
    }
}
/*
 * 
//  crea la clase peso la cual tendra las siguientes caracteristicas:
//  deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
//  En el constructor se le pasará el peso y la medida en la que se ha tomado (`lb`para libras,
//  'LI' para lingotes, 'OZ' para onzas, 'P' para peniques, 'K' para kilos, 'G' para gramos y 'Q' para quintales).
//  debera tener los siguientes métodos:
//  getLibras. Devuelve el peso en libras.
//  getLingotes. Devuelve el peso en lingotes.
//  getPeso. devuelve el peso en la medida se se pase por parámetro ('Lb' para libras 'LI' para lingotes, 'OZ' para onzas,
//  'P' para peniques, 'K' para kilos, 'G' para gramos y 'Q' para quintales).
//  para la realizacion del ejercicio hay que tener en cuenta los siguientes datos:
//  1 libra = 16 onzas = 453 gramos
//  1 lingote = 32.17 libras = 28.35 gramos
//  1 onza = 0.0625 libras = 28.35 gramos
//  1 penique = 0.05 onzas = 1.55 gramos
//  1 quintal = 100 libras = 43.3kg
//  crea ademas un metodo main para testear y verificar los metodos de esta clase

package conversorPesos;

public class Peso {
    private double pesoKg;

    public Peso(double peso, String medida) {
        if (medida.equalsIgnoreCase("lb")) {
            pesoKg = peso * 0.453;
        } else if (medida.equalsIgnoreCase("li")) {
            pesoKg = peso * 32.17;
        } else if (medida.equalsIgnoreCase("oz")) {
            pesoKg = peso * 0.02835;
        } else if (medida.equalsIgnoreCase("p")) {
            pesoKg = peso * 0.00155;
        } else if (medida.equalsIgnoreCase("k")) {
            pesoKg = peso;
        } else if (medida.equalsIgnoreCase("g")) {
            pesoKg = peso * 0.001;
        } else if (medida.equalsIgnoreCase("q")) {
            pesoKg = peso * 43.3;
        }
    }

    public double getLibras() {
        return pesoKg / 0.453;
    }

    public double getLingotes() {
        return pesoKg / 32.17;
    }

    public double getPeso(String medida) {
        if (medida.equalsIgnoreCase("lb")) {
            return pesoKg / 0.453;
        } else if (medida.equalsIgnoreCase("li")) {
            return pesoKg / 32.17;
        } else if (medida.equalsIgnoreCase("oz")) {
            return pesoKg / 0.02835;
        } else if (medida.equalsIgnoreCase("p")) {
            return pesoKg / 0.00155;
        } else if (medida.equalsIgnoreCase("k")) {
            return pesoKg;
        } else if (medida.equalsIgnoreCase("g")) {
            return pesoKg / 0.001;
        } else if (medida.equalsIgnoreCase("q")) {
            return pesoKg / 43.3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Peso peso = new Peso(1000, "G");
        System.out.println("Peso en libras: " + peso.getLibras());
        System.out.println("Peso en lingotes: " + peso.getLingotes());
        System.out.println("Peso en onzas: " + peso.getPeso("oz"));
    }
}
 * 
 * 
 */



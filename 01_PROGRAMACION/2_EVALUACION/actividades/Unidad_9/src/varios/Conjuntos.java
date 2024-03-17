package varios;

import java.util.*;
public class Conjuntos {

    // Crear dos conjuntos ordenados de Integer


 static TreeSet<Integer> ti1 = new TreeSet<>();
 static TreeSet<Integer> ti2 = new TreeSet<>();

  private static void rellenarConjuntos() {
    for (int i = 0; i < 10; i++) {
     ti1.add (i);
     ti2.add (i+10);
    }
  }


}

import java.util.Arrays;
public class Main2 {

    public static void printArrayElements(int[][] elements) {

        int rowsLength = elements.length;
        int columsLength = elements[0].length;

        System.out.printf("%-4s ", " ");
        for (int col = 0; col < columsLength; col++) {
            System.out.printf("%-6d ", col);
        }
        System.out.println();

        // Imprimir separador de columnas
        for (int col = 0; col < columsLength; col++) {
            System.out.print("-------");
        }
        System.out.println();

        // Imprimir filas con números de fila y elementos
        for (int fila = 0; fila < rowsLength; fila++) {
            System.out.printf("%-2d | ", fila);
            for (int col = 0; col < columsLength; col++) {
                System.out.printf("%-6d ", elements[fila][col]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] arrayBi = new int[][]{
                {5, 3, 1, 0, 2}, {4, 8, 1, 5, 2}, {4, 0, 3, 3, 9}, {7, 4, 0, 5, 2},
                {3, 6, 3, 3, 3}
        };printArrayElements(arrayBi);

        int[]array= new int[] {5, 3, 1, 2};

        int numb = Arrays.stream(array).max().orElse(-1);
        System.out.println("numero " + numb);

        //System.out.printf(String.valueOf(Arrays.stream(array).max().orElse(-1)));


       // int columnalongitud = arrayBi[0].length;
        //int maxvalue = 10;
        int count= 0;
        int[]arraysum =new int[arrayBi[0].length];

        for (int col = 0; col <arrayBi[0].length ; col++) {
            count = 0;
            for (int fil = 0; fil < arrayBi.length ; fil++) {
                count += arrayBi[fil][col];
                arraysum[col]  = count;

            }
            System.out.println("prueba "+count);
        }
       // System.out.println(arraysum);   // System.out.println(arrayBi[fil][col]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        for (int value: arraysum) {
            System.out.println(value+ ' ');

        }
            int[][]array2= new int[arrayBi.length][arrayBi[0].length];
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[0].length ; j++) {
                array2[i][j]=arrayBi[j][i];
            }
        }
        printArrayElements(array2);

        String nombre = "pepe";

        String[] name = nombre.split("");
        for (String value: name) {
            System.out.print(value+  " - ");
        }


    }



}





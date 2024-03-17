import java.util.Arrays;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[][] matrix ={
                {1,2,3,9,0},
                {4,5,6,11,12},
                {7,8,9,22,23}};

        int[] arraynum = {1,2,3,4,5,6,7,8,9,};

        //1
        int[] mincol = getMinColumNum(matrix);
        System.out.println(Arrays.toString(mincol));

       // System.out.println(getMax(arraynum));

        //2
        int[] numbers = getMaxNums(matrix);
        //System.out.println( Arrays.toString(numbers));

        /*int valueIJ = 0;

        for (int i = 0; i < matrix.length ; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                valueIJ =(matrix[i][j]);
               // System.out.println(valueIJ);
            }
            //System.out.println(valueIJ);
        }
        //System.out.println(valueIJ);*/
    }

    //1. getMinColumNum(int[][] matrix) : return int[]
    //	Esta función recibo como argumento una matriz. Se debe devolver el número más pequeño de cada columna.
    //	Tiempo: 35 min


         public static int[] getMinColumNum(int[][] matrix) {
            int [] colum = new int[matrix[0].length];
            int []vector =  new int[matrix[0].length];
             for (int i = 0; i < matrix[0].length ; i++) {
                 for (int j = 0; j < matrix.length ; j++) {
                     colum[j]= matrix[j][i];
                     vector[i] = Arrays.stream(colum).min().orElse(-1);
                 }

             }
             return vector;
         }

    //2. getMaxNums(int[][] matrix) : return int[]
    //	Esta función recibe como parámetro una matriz. Debe devolver todos los números mayores de 10 que
    //	contenga la matriz. Recuerda que primero debes saber cuantos elementos debes devolver para crear
    //	el array que debes devolver con la longitud correcta.
    //	Tiempo: 40 min

    public static int[] getMaxNums(int[][] matrix){
        int cont = 0;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] > 10){
                    cont++;
                }
            }
        }
        int []numbers= new int[cont];
        int count = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]>10){
                    numbers[count] = matrix[i][j];
                    count++;
                }
            }
        }return numbers;
    }



    //3. getMax(int[] array) : return int
    //	Dado un array unidimensional, devolver el número mayor.
    //	Tiempo: 20 min




}
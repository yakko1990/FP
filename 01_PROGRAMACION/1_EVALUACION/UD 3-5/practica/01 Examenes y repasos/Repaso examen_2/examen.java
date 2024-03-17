import javax.swing.plaf.IconUIResource;
import java.util.Arrays;


public class examen {
    public static void main(String[] args) {
        System.out.println("Buena suerte!");
        //1
        //System.out.println(getPrimes(2,100));
        //2
        //System.out.println(getPrice(2, 75));
        //3
        /*
        int[]arraynumb = {1,2,3,4,5};

        int[] rever =getReverse(arraynumb);
        for (int value: rever) {
            System.out.println(value);
        }*/
        //4a
        int [][] matrix = {{1,2,3,},{4,5,6,},{7,8,9}};
        int [] result = getMultiples(matrix,5);
        for (int values: result) {
            System.out.println(values);
        }
        //4b
       int[] vector =  getMaxRow(matrix);
        for (int values: vector) {
            System.out.println(values);
        }
    }


//1
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int getPrimes(int num1, int num2){
        int count = 0;
            if(num1<num2) {
                for (int i = num1; i < num2 ; i++) {
                    if (isPrime(i)) {
                        count++;
                    }
                }
            }
        if(num1>num2) {
            for (int i = num2; i <num1 ; i++) {
                if (isPrime(i)){
                    count++;
                }
            }
        }
        return count;
    }


    //2
    public static double getPrice(int num, int age){

        int totalImpote = 60*num;

        if ((age>=35) && (age<50)){
            totalImpote = totalImpote - (totalImpote*20/100);
        }if (age >= 50){
            totalImpote = totalImpote - (totalImpote*40/100);
        }else {
            totalImpote = totalImpote;
        }

        return totalImpote;
    }
    //3
    public static int[] getReverse(int[] array){

        int[] rever = new int[array.length];
        int cont =0;
        for (int j = array.length-1; j >= 0 ; j--) {
                rever[cont] = array[j];
               // System.out.println(rever[cont]);
                cont++;
            }

       return rever;
    }

    public static int[] getMultiples(int[][] matrix, int num){
        int cont = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if( matrix[i][j] % num == 0){
                    cont++;
                }
            }
        }
        int [] arrayResult = new int[cont];
        int count = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if( matrix[i][j] % num == 0){
                    arrayResult[count] = matrix[i][j];
                    count ++;

                    //System.out.println(arrayResult[cont-1]);
                }
            }
        }
        return arrayResult;
    }

    public static int[] getMaxRow(int[][] matrix){

        int[] arrayNumbers = new int[matrix[0].length];
        int[] vector = new int[matrix[0].length];

        for (int fila = 0; fila <matrix.length ; fila++) {
            for (int columna = 0; columna < matrix[0].length; columna++) {
                arrayNumbers[fila]= matrix[fila][columna];
                //System.out.println(arrayNumbers);
                vector[fila] = Arrays.stream(arrayNumbers).max().orElse(-1);
            }
        }
        return vector;
    }

}

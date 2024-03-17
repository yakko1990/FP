import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    int[] array1 = {1,2,3,4,5};
    int[] array2 = {0};
    int[] array3 = {10,11,12,13,14,15};

    int[][] matrix1 = {{5,10,5}, {10,2,7}};
    int[][] matrix2 = {{3,6,9}, {12,3,7}, {21,2,1}};
    int[][] matrix3 = {{1,1,1}};


    @Test
    void getPrimes() {
        //0.5 puntos: Incluir ambos números
        assertEquals(Main.getPrimes(2,59), 17);
        assertEquals(Main.getPrimes(2,7), 4);
        //0.5 puntos: Reverse
        assertEquals(Main.getPrimes(58,2), 16);
        assertEquals(Main.getPrimes(7,2), 4);
        //0.5 puntos: Mayores que 100
        assertEquals(Main.getPrimes(100, 149), 10);
        //0.5 puntos: Menores que 2 no son primos
        assertEquals(Main.getPrimes(0,2), 1);
        assertEquals(Main.getPrimes(-50,1), 0);

    }

    @Test
    void getPrice() {
        //0.25 puntos: Mayor que 35
        assertEquals(Main.getPrice(4, 35), 192);
        //0.25 puntos: Mayores que 50
        assertEquals(Main.getPrice(2, 50), 72);
        //0.25 puntos: Menor que 35
        assertEquals(Main.getPrice(6, 34), 360);
        //0.25 puntos: 0 asignaturas
        assertEquals(Main.getPrice(0, 34), 0);
    }

    @Test
    void getResverse() {
        //1.5 puntos: Devuelve array en orden inverso
        int[] arraySol1 = {5,4,3,2,1};
        assertArrayEquals(Main.getReverse(array1), arraySol1);
        int[] arraySol2 = {0};
        assertArrayEquals(Main.getReverse(array2), arraySol2);
        int[] arraySol3 = {15,14,13,12,11,10};
        assertArrayEquals(Main.getReverse(array3), arraySol3);
    }

    @Test
    void getMultiples() {
        //2 puntos: Devuelve el array correctamente
        int[] arraySol1 = {5,10,5,10};
        assertArrayEquals(Main.getMultiples(matrix1, 5), arraySol1);
        int[] arraySol2 = {3,6,9,12,3,21};
        assertArrayEquals(Main.getMultiples(matrix2, 3), arraySol2);
        int[] arraySol3 = {1,1,1};
        assertArrayEquals(Main.getMultiples(matrix3, 1), arraySol3);

    }

    @Test
    void getMaxRow() {
        //1.5 puntos: Devuelve correctamente los números más altos de cada fila
        int[] arraySol1 = {10,10};
        assertArrayEquals(Main.getMaxRow(matrix1), arraySol1);
        int[] arraySol2 = {9,12,21};
        assertArrayEquals(Main.getMaxRow(matrix2), arraySol2);
        int[] arraySol3 = {1};
        assertArrayEquals(Main.getMaxRow(matrix3), arraySol3);
    }
}
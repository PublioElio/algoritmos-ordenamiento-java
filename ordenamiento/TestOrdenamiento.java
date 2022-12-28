package ordenamiento;

import java.util.Arrays;

public class TestOrdenamiento {

    public static void main(String[] args) {

        int[] arrayToSort1 = {29, 10, 14, 37, 14, 25, 3};
        System.out.println("Array desordenado: " + Arrays.toString(arrayToSort1));

        AlgoritmosOrdenamiento.burbuja(arrayToSort1);
        System.out.println("Burbuja: " + Arrays.toString(arrayToSort1));

        int[] arrayToSort2 = {29, 10, 14, 37, 14, 25, 3};
        AlgoritmosOrdenamiento.seleccion(arrayToSort2);
        System.out.println("Selección directa: " + Arrays.toString(arrayToSort2));

        int[] arrayToSort3 = {29, 10, 14, 37, 14, 25, 3};
        AlgoritmosOrdenamiento.insercion(arrayToSort3);
        System.out.println("Inserción directa: " + Arrays.toString(arrayToSort3));
    }

}

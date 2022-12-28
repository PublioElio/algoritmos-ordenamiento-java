package ordenamiento;

import java.util.Arrays;

public class TestOrdenamiento {

    public static void main(String[] args) {

        int[] arrayToSort1 = {29, 10, 14, 37, 14, 25, 3};
        System.out.println("Unsorted array: " + Arrays.toString(arrayToSort1));

        AlgoritmosOrdenamiento.bubbleSort(arrayToSort1);
        System.out.println("Bubble sort: " + Arrays.toString(arrayToSort1));

        int[] arrayToSort2 = {29, 10, 14, 37, 14, 25, 3};
        AlgoritmosOrdenamiento.selectionSort(arrayToSort2);
        System.out.println("Selection sort: " + Arrays.toString(arrayToSort2));

        int[] arrayToSort3 = {29, 10, 14, 37, 14, 25, 3};
        AlgoritmosOrdenamiento.insertionSort(arrayToSort3);
        System.out.println("Isertion sort: " + Arrays.toString(arrayToSort3));
    }

}

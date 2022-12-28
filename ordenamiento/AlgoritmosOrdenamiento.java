package ordenamiento;

public class AlgoritmosOrdenamiento {

    /**
     * Esta función intercambia los valores en dos posiciones de un array
     *
     * @param array
     * @param i primera posición
     * @param j segunda posición
     */
    public static void intercambiar(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void burbuja(int[] array) {
        boolean intercambiado = false;
        int ultimo = 0;

        do {
            intercambiado = false;
            for (int i = 0; i < (array.length - 1 - ultimo); i++) {
                if (array[i] > array[i + 1]) {
                    intercambiar(array, i, i + 1);
                    intercambiado = true;
                }
            }
            ultimo++;
        } while (intercambiado);
    }

    public static void seleccion(int[] array) {
        int min; // aquí guardamos el valor mínimo
        for (int indice = 0; indice < array.length - 1; indice++) {
            min = indice; // el primer valor es siempre el mínimo
            for (int recorrido = indice + 1; recorrido < array.length; recorrido++) {
                /* ahora comparamos si la siguiente posición tiene un valor 
                menor del que hemos guardado */
                min = (array[recorrido] < array[min]) ? recorrido : min;
            }
            /* si el valor ha cambiado, intercambiamos posiciones */
            if (min != indice) {
                intercambiar(array, min, indice);
            }
        }
    }

    public static void insercion(int[] array) {
        int previo, valorInsercion;
        
        /* comenzamos el primer bucle en la posición '1' del array */
        for (int indice = 1; indice < array.length; indice++) { 
            valorInsercion = array[indice]; // guardamos el valor a insertar
            previo = indice - 1; // además del valor previo, que compararemos
            
            /* si el valor de 'previo' es negativo, nos hemos salido de los 
            límites del array */
            while (previo >= 0 && (array[previo] > valorInsercion)) {
                array[previo + 1] = array[previo];
                previo--;
            }
            array[previo + 1] = valorInsercion;
        }
    }

}
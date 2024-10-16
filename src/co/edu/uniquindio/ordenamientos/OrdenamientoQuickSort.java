package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

public class OrdenamientoQuickSort {

    private final Utilidades utilidades;

    public OrdenamientoQuickSort() {
        this.utilidades = new Utilidades();
    }

    /**
     * Inicia proceso de ordenamiento bajo el método QuickSort
     *
     * @param arr arreglo desordenado
     */
    public void iniciarOrdenamientoQuickSort(int[] arr) {
        long startTime = System.currentTimeMillis();
        sort(arr, 0, arr.length - 1);
        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento QuickSort");
        //utilidades.imprimirArray(arr);
    }

    /**
     * Esta función toma el último elemento como pivote,
     * coloca el elemento de pivote en su posición correcta
     * posición en una matriz ordenada, y coloca todos
     * más pequeño (más pequeño que el pivote) a la izquierda de
     * pivote y todos los elementos mayores a la derecha de pivote
     *
     * @param arr  arreglo
     * @param low  número inicial para el ordenamiento
     * @param high número máximo para el ordenamiento
     * @return número partición
     */
    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * <a href="https://www.geeksforgeeks.org/java-program-for-quicksort/">Algoritmo tomado de/</a>
     *
     * @param arr  arreglo
     * @param low  número inicial para el ordenamiento
     * @param high número máximo para el ordenamiento
     */
    private void sort(int[] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}

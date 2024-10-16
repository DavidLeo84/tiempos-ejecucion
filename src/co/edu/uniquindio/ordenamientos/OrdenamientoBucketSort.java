package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

/**
 * @author Leo
 */
public class OrdenamientoBucketSort {

    private final Utilidades utilidades;

    public OrdenamientoBucketSort() {
        this.utilidades = new Utilidades();
    }

    /**
     * Inicia el proceso de ordenamiento usando el método Bucket Sort
     *
     * @param arr arreglo desordenado
     */
    public void iniciarOrdenamientoBucketSort(int[] arr) {

        long startTime = System.currentTimeMillis();

        ordenamientoBucketSort(arr, arr.length);

        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento BucketSort");

    }

    /**
     * Inicia el proceso de ordenamiento
     *
     * @param arr    arreglo desordenado
     * @param maxVal
     */
    private void ordenamientoBucketSort(int[] arr, int maxVal) {


        int[] bucket = new int[maxVal + 1];
        {
            int i = 0;
            while (i < bucket.length) {
                bucket[i] = 0;
                i++;
            }
        }
        for (int j : arr) {
            bucket[j]++;
        }

        int outPos = arr.length - 1;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == 1) {
                arr[outPos--] = i;
            }
        }
    }
}

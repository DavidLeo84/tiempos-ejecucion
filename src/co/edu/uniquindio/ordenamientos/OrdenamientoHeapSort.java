package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

public class OrdenamientoHeapSort {

    private final Utilidades utilidades;

    public OrdenamientoHeapSort() {
        this.utilidades = new Utilidades();
    }

    /**
     * Inicia el ordenamiento bajo el método HeapSort
     *
     * @param array arreglo en desorden
     */
    public void iniciarOrdenamientoHeapSort(int[] array) {
        long startTime = System.currentTimeMillis();
        sort(array);
        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento Heap Sort");
    }

    /**
     * Java program for implementation of Heap Sort
     *
     * @param arr arreglo en desorden
     */
    private void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     * To heapify a subtree rooted with node i which is an index in arr[]. n is size of heap
     *
     * @param arr arreglo
     * @param n   -
     * @param i   iteración
     */
    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}

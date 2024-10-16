package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

/**
 * @author Leo
 */
public class OrdenamientoBitonicSort {

    private final Utilidades utilidades;

    public OrdenamientoBitonicSort() {
        this.utilidades = new Utilidades();
    }

    /**
     * Inicia el ordenamiento por el método BitonicSort
     *
     * @param array arreglo desordenado
     */
    public void iniciarOrdenamientoBitonicSort(int[] array) {
        long starTime = System.currentTimeMillis();

        bitonicSort(array, 0, array.length, 1);

        utilidades.calcularTiempoEjecucion(starTime, System.currentTimeMillis(), "Ordenamiento BitonicSort");
    }

    /**
     * El parámetro dir indica la dirección de clasificación,
     * ASCENDENTE o DESCENDENTE; si (a[i] > a[j]) está de acuerdo
     * con la dirección, entonces a[i] y a[j] son intercambiados.
     *
     * @param a   array
     * @param i   posición
     * @param j   posición
     * @param dir direccion de la dirección
     */
    void compAndSwap(int[] a, int i, int j, int dir) {
        if ((a[i] > a[j] && dir == 1)
                || (a[i] < a[j] && dir == 0)) {
            // Swapping elements
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    /**
     *
     * @param a
     * @param low
     * @param cnt
     * @param dir
     */
    void bitonicMerge(int[] a, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++)
                compAndSwap(a, i, i + k, dir);
            bitonicMerge(a, low, k, dir);
            bitonicMerge(a, low + k, k, dir);
        }
    }

    /* This function first produces a bitonic sequence by
       recursively sorting its two halves in opposite
       sorting orders, and then  calls bitonicMerge to make
       them in the same order */
    void bitonicSort(int a[], int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;

            // sort in ascending order since dir here is 1
            bitonicSort(a, low, k, 1);

            // sort in descending order since dir here is 0
            bitonicSort(a, low + k, k, 0);

            // Will merge whole sequence in ascending order
            // since dir=1.
            bitonicMerge(a, low, cnt, dir);
        }
    }
}

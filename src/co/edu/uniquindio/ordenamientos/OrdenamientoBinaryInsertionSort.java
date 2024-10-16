package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;
import java.util.Arrays;

/**
 * Algoritmo tomado de <a href="https://www.geeksforgeeks.org/binary-insertion-sort/">https://www.geeksforgeeks.org/binary-insertion-sort/</a>
 * <p>
 * La clasificación por inserción binaria es un algoritmo de clasificación que es similar a la clasificación por inserción , pero en lugar de
 * usar la búsqueda lineal para encontrar la ubicación donde se debe insertar un elemento, usamos la búsqueda binaria . Por lo tanto, reducimos el valor comparativo de insertar un solo elemento de O (N) a O (log N).
 * Es un algoritmo flexible, lo que significa que funciona más rápido cuando los mismos miembros dados ya están muy ordenados, es
 * decir, la ubicación actual de la característica está más cerca de su ubicación real en la lista ordenada.
 * Es un algoritmo de filtrado estable: los elementos con los mismos valores aparecen en la misma secuencia en el último orden en
 * que estaban en la primera lista.
 *
 * @author Leo
 */
public class OrdenamientoBinaryInsertionSort {

    private final Utilidades utilidades;

    public OrdenamientoBinaryInsertionSort() {
        this.utilidades = new Utilidades();
    }

    /**
     * Inicia el ordenamiento mediante el método Binary Insertion Sort
     *
     * @param array arreglo desordenado
     */
    public void iniciarOrdenamientoBinaryInsertionSort(int[] array) {
        long statTime = System.currentTimeMillis();
        sort(array);
        utilidades.calcularTiempoEjecucion(statTime, System.currentTimeMillis(), "Ordenamiento Binary Insertion Sort");
    }

    /**
     * @param array arreglo desordenado
     */
    private void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];

            // Find location to insert
            // using binary search
            int j = Math.abs(
                    Arrays.binarySearch(array, 0,
                            i, x) + 1);

            // Shifting array to one
            // location right
            System.arraycopy(array, j,
                    array, j + 1, i - j);

            // Placing element at its
            // correct location
            array[j] = x;
        }
    }
}

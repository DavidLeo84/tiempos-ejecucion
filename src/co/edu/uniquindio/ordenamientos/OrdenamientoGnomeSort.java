package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

public class OrdenamientoGnomeSort {

    private final Utilidades utilidades;

    public OrdenamientoGnomeSort() {
        this.utilidades = new Utilidades();
    }

    /**
     * Inicia ordenamiento mediante el método GnomeSort
     * @param array arreglo desordenado
     */
    public void iniciarOrdenamientoGnomeSort(int[] array) {

        long startTime = System.currentTimeMillis();
        gnomeSort(array, array.length);
        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento GnomeSort");
    }

    /**
     * Realiza el ordenamiento del arreglo
     *
     * @param arr arreglo desordenado
     * @param n   última posición del arreglo
     */
    private void gnomeSort(int[] arr, int n) {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }
}
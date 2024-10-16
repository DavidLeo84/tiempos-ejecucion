package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

/**
 * @author Leo
 */
public class OrdenamientoCombSort {

    private final Utilidades utilidades;

    public OrdenamientoCombSort() {
        this.utilidades = new Utilidades();
    }

    /**
     * Inicia proceso de ordenamiento bajo el método CombSort
     * @param arr
     */
    public void iniciarOrdenamientoCombSort(int[] arr) {
        long startTime = System.currentTimeMillis();
        combSort(arr);
        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento CombSort");
        //utilidades.imprimirArray(arr);
    }

    // Método para encontrar la próxima brecha a usar
    private static int getNextGap(int gap) {
        // Reducción de la brecha por el factor (normalmente 1.3)
        gap = (gap * 10) / 13;
        if (gap < 1)
            return 1;
        return gap;
    }

    // Función para ordenar un array usando CombSort
    public static void combSort(int arr[]) {
        int n = arr.length;
        // Inicializar el gap
        int gap = n;
        // Inicializar el indicador de intercambio como verdadero
        boolean swapped = true;

        // Repetir mientras la brecha sea más de 1 o si aún hay intercambios
        while (gap != 1 || swapped == true) {
            // Encuentra el siguiente gap
            gap = getNextGap(gap);
            // Inicializar el indicador de intercambio como falso
            swapped = false;

            // Comparar y intercambiar elementos con la brecha actual
            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    // Intercambiar arr[i] y arr[i + gap]
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    // Marcar como intercambiado
                    swapped = true;
                }

            }
        }
    }
}
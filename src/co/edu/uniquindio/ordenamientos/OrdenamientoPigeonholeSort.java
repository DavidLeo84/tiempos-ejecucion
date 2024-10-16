package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

public class OrdenamientoPigeonholeSort {


    private final Utilidades utilidades;

    public OrdenamientoPigeonholeSort() {
        this.utilidades = new Utilidades();
    }

    public void iniciarOrdenamientoPigeonholeSort(int[] arr) {
        long startTime = System.currentTimeMillis();
        pigeonholeSort(arr);
        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento PigeonholeSort");
        //utilidades.imprimirArray(arr);
    }


    public void pigeonholeSort(int[] arr) {
        int n = arr.length;

        // Encuentra el mínimo y máximo en el arreglo
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int range = max - min + 1; // Calcula el rango de los valores

        // Crear un array de "pigeonholes" con el tamaño del rango
        int[] pigeonholes = new int[range];

        // Coloca cada elemento en su "pigeonhole" correspondiente
        for (int i = 0; i < n; i++) {
            pigeonholes[arr[i] - min]++;
        }

        // Extraer los elementos del "pigeonhole" y colocarlos de vuelta en el array original
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (pigeonholes[i]-- > 0) {
                arr[index++] = i + min;

            }

        }
    }
}
package co.edu.uniquindio.utilidades;

import java.util.Arrays;

public class Utilidades {

    public void calcularTiempoEjecucion(long startTime, long endTime, String algoritmo) {
        System.out.println("Tiempo ejecución  " + algoritmo + " = " + (endTime - startTime) + " milisegundos");
    }


    /**
     * Imprime el array
     *
     * @param array arreglo previamente ordenado
     */
    public void imprimirArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

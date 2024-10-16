package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

/**
 * @author Leo
 */
public class OrdenamientoSeleccionSort {

    private final Utilidades utilidades;
    public OrdenamientoSeleccionSort(){
        this.utilidades = new Utilidades();
    }

    /**
     * El algoritmo de selección realiza el ordenamiento seleccionando en cada iteración el menor elemento del
     * arreglo e intercambiarlo en la posición correspondiente.
     * Inicialmente, se encuentra el menor elemento dentro del arreglo y se intercambia con el primer elemento
     * del arreglo. Luego, desde la segunda posición del arreglo se busca el menor elemento y se intercambia
     * con el segundo elemento del arreglo. Sucesivamente, se busca cada elemento de acuerdo a su índice i y
     * se intercambia con el elemento que tiene el índice k.
     *
     * @param arreglo arreglo a ordenar
     */
    public int [] ordenamientoSeleccionSort(int[] arreglo) {

        long startTime = 0;
        long endTime = 0;
        startTime = System.currentTimeMillis();

        int i, j, k, menor;
        i = 0;
        while (i < arreglo.length - 1) {
            menor = arreglo[i];
            k = i;
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < menor) {
                    menor = arreglo[j];
                    k = j;
                }
            }
            arreglo[k] = arreglo[i];
            arreglo[i] = menor;
            i++;
        }
        endTime =  System.currentTimeMillis();
        utilidades.calcularTiempoEjecucion(startTime, endTime, "Ordenamiento SeleccionSort");
        return arreglo;
    }
}

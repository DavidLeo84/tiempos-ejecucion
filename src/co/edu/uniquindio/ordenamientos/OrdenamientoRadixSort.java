package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.nodos.ColaEnlazada;
import co.edu.uniquindio.utilidades.Utilidades;

/**
 *
 * @author Leo
 * Este algoritmo funciona trasladando los elementos a una cola, comenzando con el dígito menos significativo del
 * número (El número colocado más a la derecha tomando en cuenta unidades, decenas,centenas, etc.).
 * Cuando todos los elementos son ingresados a las colas, estas se recorren en orden para después agregarlos al vector.
 * Este algoritmo es muy rápido en comparación con otros algoritmos de ordenación, sin embargo, ocupa más espacio
 * de memoria al utilizar colas.
 */
public class OrdenamientoRadixSort {

    private final Utilidades utilidades;

    public OrdenamientoRadixSort() {
        this.utilidades = new Utilidades();
    }

    public int [] iniciarOrdenamientoRadixSort(int[] a) {
        long startTime = System.currentTimeMillis();
        int max = 0;
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }
        Integer maximo = max;
        String cadena = String.valueOf(maximo);
        int numeroDigitos = cadena.length();
        int [] arrayOrdenado =  sort(a, numeroDigitos, startTime);


        return arrayOrdenado;
    }

    private final ColaEnlazada[] Q = {
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada(),
            new ColaEnlazada()
    };

    /**
     * @param a             array
     * @param numeroDigitos dígitos del número
     */
    public int [] sort(int[] a, int numeroDigitos, long startTime) {
        int posArreglo;
        for (int i = 1; i < numeroDigitos; i++) {
            posArreglo = 0;
            for (int k : a) {
                Q[obtenerRadical(k, i)].
                        encolar(k);
            }
            for (ColaEnlazada colaEnlazada : Q) {
                while (!colaEnlazada.estaVacia()) {
                    a[posArreglo] = colaEnlazada.decolar();
                    posArreglo++;
                }
            }
        }
        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento RadixSort");

        return a;
    }

    /**
     * @param numero  .
     * @param radical .
     * @return numero radical
     */
    int obtenerRadical(int numero, int radical) {
        return (int)
                (numero / Math.pow(10, radical - 1)) % 10;
    }
}

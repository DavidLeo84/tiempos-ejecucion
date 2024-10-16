package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.persistencia.Persistencia;
import co.edu.uniquindio.utilidades.Utilidades;

/**
 * @author Leo
 */
public class MetodosOrdenamiento {

    private final Persistencia persistencia;
    private final Utilidades utilidades;


    private final OrdenamientoTimSort ordenamientoTimSort;
    private final OrdenamientoCombSort ordenamientoCombSort;
    private final OrdenamientoTreeSort ordenamientoTreeSort;
    private final OrdenamientoPigeonholeSort ordenamientoPigeonholeSort;
    private final OrdenamientoSeleccionSort ordenamientoSeleccionSort;
    private final OrdenamientoRadixSort ordenamientoRadixSort;
    private final OrdenamientoBucketSort ordenamientoBucketSort;
    private final OrdenamientoQuickSort ordenamientoQuickSort;
    private final OrdenamientoHeapSort ordenamientoHeapSort;
    private final OrdenamientoBitonicSort ordenamientoBitonicSort;
    private final OrdenamientoGnomeSort ordenamientoGnomeSort;
    private final OrdenamientoBinaryInsertionSort ordenamientoBinaryInsertionSort;



    /**
     * Método inicializador de la clase
     */
    public MetodosOrdenamiento() {

        this.utilidades = new Utilidades();
        this.persistencia = new Persistencia();
        this.ordenamientoTimSort = new OrdenamientoTimSort();
        this.ordenamientoCombSort = new OrdenamientoCombSort();
        this.ordenamientoSeleccionSort = new OrdenamientoSeleccionSort();
        this.ordenamientoTreeSort = new OrdenamientoTreeSort();
        this.ordenamientoPigeonholeSort = new OrdenamientoPigeonholeSort();
        this.ordenamientoBucketSort = new OrdenamientoBucketSort();
        this.ordenamientoQuickSort = new OrdenamientoQuickSort();
        this.ordenamientoHeapSort = new OrdenamientoHeapSort();
        this.ordenamientoBitonicSort = new OrdenamientoBitonicSort();
        this.ordenamientoGnomeSort = new OrdenamientoGnomeSort();
        this.ordenamientoBinaryInsertionSort = new OrdenamientoBinaryInsertionSort();
        this.ordenamientoRadixSort = new OrdenamientoRadixSort();
    }

    /**
     * Método controlador que llama a los métodos de ordenamiento de las diferentes clases
     * 1	TimSort
     * 2	CombSort
     * 3	SelecciónSort
     * 4	TreeSort
     * 5	PigeonholeSort
     * 6	BucketSort
     * 7	QuickSort
     * 8	HeapSort
     * 9	BitonicSort
     * 10	GnomeSort
     * 11	BinaryInsertionSort
     * 12	RadixSort
     */
    public void llamarMetodoOrdenamiento(int[] array) {

        ordenamientoTimSort.iniciarOrdenamientoTimSort(array);

        //ordenamientoCombSort.iniciarOrdenamientoCombSort(array);

        //ordenamientoSeleccionSort.ordenamientoSeleccionSort(array);

        //ordenamientoTreeSort.iniciarOrdenamientoTreeSort(array);

        //ordenamientoPigeonholeSort.iniciarOrdenamientoPigeonholeSort(array);

        //ordenamientoBucketSort.iniciarOrdenamientoBucketSort(array);

        //ordenamientoQuickSort.iniciarOrdenamientoQuickSort(array);

        //ordenamientoHeapSort.iniciarOrdenamientoHeapSort(array);

        //ordenamientoBitonicSort.iniciarOrdenamientoBitonicSort(array);

        //ordenamientoGnomeSort.iniciarOrdenamientoGnomeSort(array);

        //ordenamientoBinaryInsertionSort.iniciarOrdenamientoBinaryInsertionSort(array);

        //ordenamientoRadixSort.iniciarOrdenamientoRadixSort(array);

        //utilidades.imprimirArray(array);
    }
}

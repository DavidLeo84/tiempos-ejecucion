package co.edu.uniquindio.nodos;

public class NodoEntero {

    public NodoEntero(int a) {
        valor = a;
        siguiente = null;
    }

    public NodoEntero() {
        siguiente = null;
        valor = 0;
    }
    public int valor;
    public NodoEntero siguiente;
}

package co.edu.uniquindio.ordenamientos;

import co.edu.uniquindio.utilidades.Utilidades;

public class OrdenamientoTreeSort {

    private final Utilidades utilidades;

    public OrdenamientoTreeSort() {
        this.utilidades = new Utilidades();
    }

    public void iniciarOrdenamientoTreeSort(int[] arr) {
        long startTime = System.currentTimeMillis();
        treeSort(arr);
        utilidades.calcularTiempoEjecucion(startTime, System.currentTimeMillis(), "Ordenamiento TreeSort");
        //utilidades.imprimirArray(arr);
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Función para insertar un nuevo nodo en el árbol
    public static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    // Función para realizar la ordenación en orden y almacenar en el array
    public static void inOrderTraversal(Node node, int[] arr, int[] index) {
        if (node != null) {
            inOrderTraversal(node.left, arr, index);
            arr[index[0]++] = node.data;
            inOrderTraversal(node.right, arr, index);
        }
    }

    // Función principal de TreeSort
    public static void treeSort(int[] arr) {
        Node root = null;
        for (int value : arr) {
            root = insert(root, value);
        }

        // Realiza el recorrido en orden del árbol y almacena en el array
        int[] index = {0};  // Usamos un array para simular una referencia
        inOrderTraversal(root, arr, index);
    }

  }

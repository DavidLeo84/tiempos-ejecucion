package co.edu.uniquindio.principal;

import co.edu.uniquindio.ordenamientos.MetodosOrdenamiento;
import co.edu.uniquindio.persistencia.Persistencia;

;import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlgoritmosDeOrdenamientoApplication {


    /**
     * Función principal
     *
     * @param args argumentos
     */
    public static void main(String[] args) {

        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();
        int[] array = generarArray("src/resources/scopus.csv");
        metodosOrdenamiento.llamarMetodoOrdenamiento(array);

    }

    /**
     * Función que lee el archivo .csv y almacena todos los datos en un arreglo de tipo int
     * @param rutaArchivo
     * @return int[]
     */
    private static int[] generarArray(String rutaArchivo) {
        List<Integer> listaCadenas = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    listaCadenas.add(part.trim().length());
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaCadenas.stream().mapToInt(i -> i).toArray();
    }
}
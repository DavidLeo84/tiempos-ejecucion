package co.edu.uniquindio.persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Persistencia {

    /**
     * Permite guardar un arreglo automático en un archivo plano indicado en la ruta src/resources/array.txt
     *
     * @param array arreglo automático
     */

    /**
     * Permite guardar un arreglo automático en un archivo plano indicado en la ruta src/resources/array.txt
     *
     * @param array arreglo automático
     */
    public void guardarArchivo(int[] array) {
        String arrayAsString = Arrays.toString(array);

        try {
            PrintWriter writer = new PrintWriter("src/resources/array.txt");
            writer.print(arrayAsString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Obtiene el arreglo desde el archivo plano indicado en la ruta src/resources/array.txt
     *
     * @return arreglo obtenido desde el archivo plano
     */
    public int[] obtenerArray() {
        File archivo = new File("src/resources/array.txt");

        int[] newArray = new int[0];
        try {
            Scanner scanner = new Scanner(archivo);

            String[] array = scanner.nextLine().replace("[", "").replaceAll("\\s", "").split(",");
            newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = Integer.parseInt(array[i].replace("]", ""));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return newArray;
    }

    /*public static String[] generarArray() {
        List<String> lista = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/resources/scopus.csv"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    lista.add(part.trim());
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista.toArray(new String[0]);
    }*/
}

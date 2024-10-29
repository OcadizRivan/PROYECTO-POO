/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumatech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author ivanos
 */
public class GeneradorDeDatos {
    private static List<String> nombres = List.of("Carlos", "Ana", "Luis", "María", "Pedro", "Sofía");
    private static List<String> apellidos = List.of("Gómez", "Martínez", "López", "Hernández", "Pérez", "García");
    private static List<String> direcciones = new ArrayList<>();

    public static void cargarDireccionesDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                direcciones.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de direcciones: " + e.getMessage());
        }
    }

    public static String generarNombreCompleto() {
        Random random = new Random();
        String nombre = nombres.get(random.nextInt(nombres.size()));
        String apellido = apellidos.get(random.nextInt(apellidos.size()));
        return nombre + " " + apellido;
    }

    public static String generarDireccion() {
        if (direcciones.isEmpty()) {
            throw new IllegalStateException("La lista de direcciones está vacía. Asegúrate de cargar las direcciones desde el archivo antes de generar.");
        }
        Random random = new Random();
        return direcciones.get(random.nextInt(direcciones.size()));
    }
}

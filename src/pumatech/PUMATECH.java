/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pumatech;
import java.util.Scanner;
/**
 *
 * @author ivanos
 */
public class PUMATECH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeAlumnos gestorDeAlumnos = new GestorDeAlumnos();

        System.out.println("Bienvenido al sistema de gestión escolar");

        // Cargar direcciones desde el archivo
        GeneradorDeDatos.cargarDireccionesDesdeArchivo("direcciones.txt");

        // Login
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        if (!Administrador.login(usuario, contrasena)) {
            System.out.println("Credenciales incorrectas.");
            return;
        }

        int opcion;
        do {
            // Menú principal
            System.out.println("\nAcceso concedido. Seleccione una opción:");
            System.out.println("1. Agregar Alumnos");
            System.out.println("2. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de alumnos a agregar (1-1000): ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    if (cantidad < 1 || cantidad > 1000) {
                        System.out.println("Cantidad no válida. Debe ser entre 1 y 1000.");
                    } else {
                        agregarAlumnos(gestorDeAlumnos, cantidad);
                    }
                    break;

                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 2);

        scanner.close();
    }

    private static void agregarAlumnos(GestorDeAlumnos gestorDeAlumnos, int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\nAgregando alumno " + i + ":");

            String nombreCompleto = GeneradorDeDatos.generarNombreCompleto();
            String matricula = ModuloInscripcion.generarMatricula(2024);
            String direccion = GeneradorDeDatos.generarDireccion();

            // Verificar que la dirección generada sea única
            if (GestorDeAlumnos.validarDireccionUnica(direccion)) {
                Alumno alumno = new Alumno(nombreCompleto, 0, direccion, matricula, null); // Edad y historial académico en 0 y null por simplificación
                gestorDeAlumnos.agregarAlumno(alumno);
                System.out.println("Alumno agregado con éxito.");
                System.out.println("Nombre: " + nombreCompleto);
                System.out.println("Matrícula: " + matricula);
                System.out.println("Dirección: " + direccion);
            } else {
                System.out.println("La dirección generada ya está en uso. No se agregó el alumno.");
            }
        }
    }
}


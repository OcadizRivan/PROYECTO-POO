/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumatech;

/**
 *
 * @author ivanos
 */

import java.util.ArrayList;
import java.util.List;

public class GestorDeAlumnos {
    private List<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {

        // Verificar que la dirección sea única antes de agregar
        if (!validarDireccionUnica(alumno.getDireccion())) {
            System.out.println("Error: La dirección ya está en uso. El alumno no fue agregado.");
            return;
        }

        // Si todas las validaciones pasan, agregar el alumno a la lista
        alumnos.add(alumno);
        System.out.println("Alumno agregado exitosamente.");
    }

    public List<Alumno> verListaDeAlumnos() {
        return alumnos;
    }

    // Método para validar que la dirección del alumno sea única
    public static boolean validarDireccionUnica(String direccion) {
        // Aquí asumimos que tenemos un conjunto de direcciones registradas en el sistema
        // En una implementación real, se debería actualizar al agregar y eliminar alumnos.
        List<String> direccionesRegistradas = new ArrayList<>();
        if (direccionesRegistradas.contains(direccion)) {
            return false;
        } else {
            direccionesRegistradas.add(direccion);  // Agregar la dirección como usada
            return true;
        }
    }
}

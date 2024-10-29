/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumatech;

/**
 *
 * @author ivanos
 */
import java.util.HashSet;
import java.util.Set;

public class ModuloInscripcion {
    private static final Set<String> matriculasGeneradas = new HashSet<>();

    public static String generarMatricula(int anioIngreso) {
        String matricula;
        do {
            matricula = anioIngreso + "-" + (int)(Math.random() * 10000);
        } while (matriculasGeneradas.contains(matricula));
        matriculasGeneradas.add(matricula);
        return matricula;
    }
}

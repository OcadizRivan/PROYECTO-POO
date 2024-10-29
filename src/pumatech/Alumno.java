/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumatech;
import java.util.List;
/**
 *
 * @author ivanos
 */
public class Alumno {
    private String nombre;
    private int edad;
    private String direccion;
    private String numeroDeInscripcion;
    private List<Asignatura> historialAcademico;

    public Alumno() {}

    public Alumno(String nombre, int edad, String direccion, String numeroDeInscripcion, List<Asignatura> historialAcademico) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroDeInscripcion = numeroDeInscripcion;
        this.historialAcademico = historialAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroDeInscripcion() {
        return numeroDeInscripcion;
    }

    public void setNumeroDeInscripcion(String numeroDeInscripcion) {
        this.numeroDeInscripcion = numeroDeInscripcion;
    }

    public List<Asignatura> getHistorialAcademico() {
        return historialAcademico;
    }

    public void setHistorialAcademico(List<Asignatura> historialAcademico) {
        this.historialAcademico = historialAcademico;
    }
}

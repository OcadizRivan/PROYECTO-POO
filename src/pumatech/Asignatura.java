/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumatech;

/**
 *
 * @author ivanos
 */
public class Asignatura {
    private String nombre;
    private double calificacion;
    private int semestre;

    public Asignatura() {}

    public Asignatura(String nombre, double calificacion, int semestre) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}

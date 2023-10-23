package Ejercicio.src;

import java.util.ArrayList;
public class Materia {
    private String nombre;
    private ArrayList<Double> notas;

    public Materia(String nombre, ArrayList<Double> notas){
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public double promedioMateria(){
        double promedio=0;
        for(double nota: notas){
            promedio=promedio + nota;
        }
        promedio= promedio/notas.size();
        return promedio;
    }
}

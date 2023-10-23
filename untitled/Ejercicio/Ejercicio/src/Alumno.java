package Ejercicio.src;

import java.util.ArrayList;
public class Alumno extends Persona {
    //private Fecha fechaNacimiento;
    private ArrayList<Materia> materias;
    private String division;

    public Alumno(String nombre, String apellido, ArrayList <Materia> materias){
        super(nombre, apellido);
        this.materias=materias;

    }
    public Alumno(String nombre, String apellido, String division){
        super(nombre, apellido);
        this.division=division;

    }
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    /*public String getNombre(){
            return nombre;
        }
        public String getApellido(){
            return apellido;
        }*/
    /*public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }*/
    /*public ArrayList<Double> getNotas() {
        return notas;
    } quedó de la versión 1 del ejercicio 5*/
    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }*/
    /*public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }*/
    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    /*public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }quedó de la versión 1 del ejercicio 5*/

    /*public void agregarNota(double nota){
        this.notas.add(nota);
    } quedó de la versión 1 del ejercicio 5*/
    /*public double menorNota(){
        double menor=10;
        for(double nota: notas){
            if(nota<menor){
                menor=nota;
            }
        }
        return menor;
    }quedó de la versión 1 del ejercicio 5*/
    /*public double mayorNota(){
        double mayor=1;
        for(double nota: notas){
            if(nota>mayor){
                mayor=nota;
            }
        }
        return mayor;
    }quedó de la versión 1 del ejercicio 5*/
    public void agregarMateria(Materia nuevaMateria){
        materias.add(nuevaMateria);
    }

    public double promedioTotal(){
        double promedio=0;
        for (Materia materia : materias) {
            promedio= materia.promedioMateria() + promedio;
        }
        promedio= promedio/materias.size();
        return promedio;
    }

}

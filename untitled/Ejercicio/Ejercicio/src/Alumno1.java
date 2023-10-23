package Ejercicio.src;

import java.util.HashMap;
import java.util.HashSet;

public class Alumno1 extends Persona{
    private HashSet<Examen> ExamenesRendidos;

    public Alumno1(String nombre, int dni, String apellido, HashSet<Examen>ExamenesRendidos) {
        super(nombre, dni, apellido);
        this.ExamenesRendidos=ExamenesRendidos;
    }

    public HashSet<Examen> getExamenesRendidos() {
        return ExamenesRendidos;
    }

    public void setExamenesRendidos(HashSet<Examen> examenesRendidos) {
        ExamenesRendidos = examenesRendidos;
    }
    public boolean aproboTodo(){
        boolean aprobo=true;
        for(Examen examen: getExamenesRendidos()){
            if(!examen.aprobar()){
                aprobo=false;
                break;
            }
        }
        return aprobo;
    }
}

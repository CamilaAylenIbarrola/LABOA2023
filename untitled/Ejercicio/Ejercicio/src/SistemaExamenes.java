package Ejercicio.src;

import java.util.HashSet;
import java.util.Map;

public class SistemaExamenes implements Aprobacion{
    private HashSet<Alumno1>listaAlumnos;

    @Override
    public void cantAprobados() {
        int aprobados=0;
        for(Alumno1 alumno1: listaAlumnos){
            if(alumno1.aproboTodo()){
                aprobados=aprobados + 1;
            }
        }
        System.out.println("Aprobaron " + aprobados + " personas");
    }
}

package Ejercicio.src;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona{
    private HashSet<DiasHabiles>diasDisp;
    private HashSet<LocalDateTime> asistencia;
    public Empleado(String nombre){
        super(nombre);
    }
    public Empleado(String nombre, String apellido, int dni, String pais, int nroTel, HashSet<DiasHabiles>diasDisp, HashSet<LocalDateTime>asistencia){
        super(nombre, apellido, dni, pais, nroTel);
        this.diasDisp=diasDisp;
        this.asistencia=asistencia;
    }

    public HashSet<DiasHabiles> getDiasDisp() {
        return diasDisp;
    }
    public void setDiasDisp(HashSet<DiasHabiles> diasDisp) {
        this.diasDisp = diasDisp;
    }
    public HashSet<LocalDateTime> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashSet<LocalDateTime> asistencia) {
        this.asistencia = asistencia;
    }

    public Empleado(){
    }

    public void registro(LocalDateTime asistenciaActual){
        this.asistencia.add(asistenciaActual);
    }
    public int comprobarAsistencia(int mes){
        int diasAsistidos=0;
        for(LocalDateTime fecha:asistencia){
            if(fecha.getMonth().equals(mes)) {
                diasAsistidos++;
            }
        }
        int porcentaje= diasAsistidos*100/(diasDisp.size()*4);
        return porcentaje;
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre();
    }
}

package Ejercicio.src;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajeria{
    private int cuil;
    private int sueldo;
    private String direccionResidencia;
    private LocalTime horaInicioJornada;
    private LocalTime horaFinJornada;
    public Trabajador(String nombre, String apellido, LocalDate fechaNac, int cuil, int sueldo, String direccionResidencia, LocalTime horaFinJornada, LocalTime horaInicioJornada){
        super(nombre, apellido, fechaNac);
        this.cuil=cuil;
        this.sueldo=sueldo;
        this.direccionResidencia=direccionResidencia;
        this.horaFinJornada=horaFinJornada;
        this.horaInicioJornada=horaInicioJornada;
    }
    public int getCuil() {
        return cuil;
    }
    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public String getDireccionResidencia() {
        return direccionResidencia;
    }
    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }
    public LocalTime getHoraInicioJornada() {
        return horaInicioJornada;
    }
    public void setHoraInicioJornada(LocalTime horaInicioJornada) {
        this.horaInicioJornada = horaInicioJornada;
    }
    public LocalTime getHoraFinJornada() {
        return horaFinJornada;
    }
    public void setHoraFinJornada(LocalTime horaFinJornada) {
        this.horaFinJornada = horaFinJornada;
    }
    @Override
    public void hacerCampania(String nombre) {
        LocalTime horaActual= LocalTime.now();
        if(horaActual.isAfter(horaInicioJornada) && horaActual.isBefore(horaFinJornada)) {
            System.out.println(" Yo, " + getNombre() + " Te invito a que votes" + nombre + " para un mejor futuro");
        }else{
            System.out.println("No estoy dentro de mi horario");
        }
    }
}

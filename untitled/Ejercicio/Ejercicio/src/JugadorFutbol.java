package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class JugadorFutbol extends Persona implements Contrato{
    private PosicionFutbol posicion;
    private Provincia provincia;
    private int nroCamiseta;
    private Equipos equipoActual;
    private HashSet<String>historialEquipos;
    public JugadorFutbol(String nombre, LocalDate nacimiento, PosicionFutbol posicion, Provincia provincia, int nroCamiseta, HashSet<String>historialEquipos, Equipos equipoActual){
        super(nacimiento, nombre);
        this.provincia=provincia;
        this.posicion=posicion;
        this.nroCamiseta=nroCamiseta;
        this.historialEquipos=historialEquipos;
        this.equipoActual=equipoActual;
    }
    public PosicionFutbol getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionFutbol posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public int getNroCamiseta() {
        return nroCamiseta;
    }
    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }
    public HashSet<String> getHistorialEquipos() {
        return historialEquipos;
    }
    public void setHistorialEquipos(HashSet<String> historialEquipos) {
        this.historialEquipos = historialEquipos;
    }

    public Equipos getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(Equipos equipoActual) {
        this.equipoActual = equipoActual;
    }

    abstract void verificarConHistorial(Equipos equipo) throws YaJugoException;
    abstract void verificarEquipoRenovacion(Equipos equipo) throws NoEsElMismoEquipoException;
    abstract void verificarEdad()throws MayorException;
}

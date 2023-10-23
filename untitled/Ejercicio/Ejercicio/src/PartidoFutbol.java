package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class PartidoFutbol {
    private LocalDate fecha;
    private Equipos local;
    private Equipos visitante;
    private HashMap<JugadorCampo, Integer>golesLocal;
    private HashMap<JugadorCampo, Integer>golesVisitante;
    private HashMap<JugadorCampo, Integer>asistencias;
    private HashMap<JugadorCampo, Integer>tirosLocal;
    private HashMap<JugadorCampo, Integer>tirosVisitante;
    private int atajadasLocal;
    private int atajadasVisitante;

    public PartidoFutbol(LocalDate fecha, Equipos local, Equipos visitante, HashMap<JugadorCampo, Integer>golesLocal,HashMap<JugadorCampo, Integer>golesVisitante, HashMap<JugadorCampo, Integer>asistencias, int atajadasLocal, int atajadasVisitante, HashMap<JugadorCampo, Integer>tirosLocal, HashMap<JugadorCampo, Integer>tirosVisitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante= golesVisitante;
        this.asistencias = asistencias;
        this.atajadasLocal = atajadasLocal;
        this.atajadasVisitante = atajadasVisitante;
        this.tirosLocal=tirosLocal;
        this.tirosVisitante=tirosVisitante;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Equipos getLocal() {
        return local;
    }
    public void setLocal(Equipos local) {
        this.local = local;
    }
    public Equipos getVisitante() {
        return visitante;
    }
    public void setVisitante(Equipos visitante) {
        this.visitante = visitante;
    }
    public HashMap<JugadorCampo, Integer> getGolesLocal() {
        return golesLocal;
    }
    public void setGolesLocal(HashMap<JugadorCampo, Integer> golesLocal) {
        this.golesLocal = golesLocal;
    }
    public HashMap<JugadorCampo, Integer> getGolesVisitante() {
        return golesVisitante;
    }
    public void setGolesVisitante(HashMap<JugadorCampo, Integer> golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    public HashMap<JugadorCampo, Integer> getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(HashMap<JugadorCampo, Integer> asistencias) {
        this.asistencias = asistencias;
    }
    public int getAtajadasLocal() {
        return atajadasLocal;
    }
    public void setAtajadasLocal(int atajadasLocal) {
        this.atajadasLocal = atajadasLocal;
    }
    public int getAtajadasVisitante() {
        return atajadasVisitante;
    }
    public void setAtajadasVisitante(int atajadasVisitante) {
        this.atajadasVisitante = atajadasVisitante;
    }
    public HashMap<JugadorCampo, Integer> getTirosLocal() {
        return tirosLocal;
    }
    public void setTirosLocal(HashMap<JugadorCampo, Integer> tirosLocal) {
        this.tirosLocal = tirosLocal;
    }
    public HashMap<JugadorCampo, Integer> getTirosVisitante() {
        return tirosVisitante;
    }
    public void setTirosVisitante(HashMap<JugadorCampo, Integer> tirosVisitante) {
        this.tirosVisitante = tirosVisitante;
    }
}

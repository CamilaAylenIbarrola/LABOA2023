package Ejercicio.src;

import java.util.ArrayList;
import java.util.HashSet;

public class Equipos {
    private ArrayList<Jugador> jugadores;
    private HashSet<JugadorCampo> listaJugadores;
    private Arquero arquero;
    private String nombreEquipo;
    private String barrio;
    private Turno turno;
    private ArrayList<Dia>dispoDias;
    private static int cantJugadores =10;
    public Equipos(ArrayList<Jugador>jugadores, String nombreEquipo, Turno turno, ArrayList<Dia>dispoDias){
        this.jugadores=jugadores;
        this.nombreEquipo=nombreEquipo;
        this.turno=turno;
        this.dispoDias=dispoDias;
    }
    public Equipos(HashSet<JugadorCampo>jugadores, String nombreEquipo, Arquero arquero){
        this.listaJugadores=jugadores;
        this.nombreEquipo=nombreEquipo;
        this.arquero=arquero;
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getBarrio() {
        return barrio;
    }
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public String getTurno() {
        return this.turno.name();
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public ArrayList<Dia> getDispoDias() {
        return dispoDias;
    }
    public void setDispoDias(ArrayList<Dia>dispoDias) {
        this.dispoDias = dispoDias;
    }

    public HashSet<JugadorCampo> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(HashSet<JugadorCampo> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Arquero getArquero() {
        return arquero;
    }

    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }

    public static int getCantJugadores() {
        return cantJugadores;
    }

    public static void setCantJugadores(int cantJugadores) {
        Equipos.cantJugadores = cantJugadores;
    }

    public void agregarJugador(Jugador j1){
        if(this.jugadores.size()<10){
            boolean capitanDuplicado=false;
            boolean nroCamisetaDuplicado=false;
            for(Jugador jugador: jugadores){
                if(j1.getNroCamiseta() == jugador.getNroCamiseta()){
                    nroCamisetaDuplicado=true;
                }
                if(j1.getEsCapitan() == jugador.getEsCapitan()){
                    capitanDuplicado= true;
                }
            }
            if(capitanDuplicado == true){
                System.out.println("No se pudo agregar porque ya hay un capitán");
            }else if(nroCamisetaDuplicado== true){
                System.out.println("No se puedo agregar porque ya hay un jugador con ese numero de camiseta");
            }else{
                jugadores.add(j1);
                System.out.println("Se agregó correctamente");
            }
        }
    }
}
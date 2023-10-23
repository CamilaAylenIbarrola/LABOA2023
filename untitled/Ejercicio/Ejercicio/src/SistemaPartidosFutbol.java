package Ejercicio.src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaPartidosFutbol {
    private HashSet<PartidoFutbol> partidos;

    public SistemaPartidosFutbol(HashSet<PartidoFutbol> partidos) {
        this.partidos = partidos;
    }
    public HashSet<PartidoFutbol> getPartidos() {
        return partidos;
    }
    public void setPartidos(HashSet<PartidoFutbol> partidos) {
        this.partidos = partidos;
    }
    public void actualizarAsistencias(PartidoFutbol partido){
        HashMap<JugadorCampo, Integer> asistencias= partido.getAsistencias();
        for(Map.Entry<JugadorCampo, Integer>entrada:asistencias.entrySet()){
            entrada.getKey().setCantAsistencias(entrada.getKey().getCantAsistencias() + entrada.getValue());
        }
        System.out.println("Se actualizaron las asistencias");
    }
    public void actualizarGolesArquero(PartidoFutbol partido){
        Arquero arqueroLocal= partido.getLocal().getArquero();
        Arquero arqueroVisitante= partido.getVisitante().getArquero();

        int cantGolesLocal=0;
        HashMap<JugadorCampo, Integer>golesLocal= partido.getGolesLocal();
        for(Map.Entry<JugadorCampo, Integer>entrada:golesLocal.entrySet()){
            cantGolesLocal= cantGolesLocal + entrada.getValue();
        }

        int cantGolesVisitante=0;
        HashMap<JugadorCampo, Integer>golesVisitante= partido.getGolesVisitante();
        for(Map.Entry<JugadorCampo, Integer>entrada:golesVisitante.entrySet()){
            cantGolesVisitante= cantGolesVisitante + entrada.getValue();
        }
        arqueroLocal.setGolesRecibidos(arqueroLocal.getGolesRecibidos() + cantGolesVisitante);
        arqueroVisitante.setGolesRecibidos(arqueroVisitante.getGolesRecibidos() + cantGolesLocal);
        System.out.println("Se actualizaron los goles");
    }

    public void actualizarPorcentajeAtajadas(PartidoFutbol partido){
        Arquero local= partido.getLocal().getArquero();
        local.setAtajadas(local.getAtajadas() + partido.getAtajadasLocal());
        local.calcularPorcentajeAtajadas();

        Arquero visitante= partido.getVisitante().getArquero();
        visitante.setAtajadas(visitante.getAtajadas() + partido.getAtajadasVisitante());
        visitante.calcularPorcentajeAtajadas();
        System.out.println("Se actualizaron los porcentajes de atajadas");
    }
    public void actualizarPorcentajeGoles(PartidoFutbol partido){
        HashMap<JugadorCampo, Integer>golesLocal= partido.getGolesLocal();
        HashMap<JugadorCampo, Integer>golesVisitante= partido.getGolesVisitante();

        for(Map.Entry<JugadorCampo, Integer>entrada: golesLocal.entrySet()){
            entrada.getKey().setGoles(entrada.getKey().getGoles() + entrada.getValue());
        }
        for(Map.Entry<JugadorCampo, Integer>entrada: golesVisitante.entrySet()){
            entrada.getKey().setGoles(entrada.getKey().getGoles() + entrada.getValue());
        }
        HashMap<JugadorCampo, Integer>tirosLocal= partido.getTirosLocal();
        HashMap<JugadorCampo, Integer>tirosVisitante= partido.getTirosVisitante();
        for(Map.Entry<JugadorCampo, Integer>entrada: tirosLocal.entrySet()){
            entrada.getKey().setTirosAlArco(entrada.getKey().getTirosAlArco() + entrada.getValue());
        }
        for(Map.Entry<JugadorCampo, Integer>entrada: tirosVisitante.entrySet()){
            entrada.getKey().setTirosAlArco(entrada.getKey().getGoles() + entrada.getValue());
        }
        System.out.println("Se actualizaron los porcentajes de goles");
    }

    public void agregarPartido(PartidoFutbol partido){
        partidos.add(partido);
        actualizarAsistencias(partido);
        actualizarGolesArquero(partido);
        actualizarPorcentajeAtajadas(partido);
        actualizarPorcentajeGoles(partido);
    }
}

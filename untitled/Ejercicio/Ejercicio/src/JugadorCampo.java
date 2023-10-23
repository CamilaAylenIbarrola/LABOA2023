package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashSet;

public class JugadorCampo extends JugadorFutbol{
    private double porcentajeGoles;
    private int goles;
    private int cantAsistencias;
    private int tirosAlArco;
    public JugadorCampo(String nombre, LocalDate nacimiento, PosicionFutbol posicion, Provincia provincia, int nroCamiseta, HashSet<String> historialEquipos, double procentajeGoles, int cantAsistencias, Equipos equipoActual, int goles, int tirosAlArco) {
        super(nombre, nacimiento, posicion, provincia, nroCamiseta, historialEquipos, equipoActual);
        this.porcentajeGoles=procentajeGoles;
        this.cantAsistencias=cantAsistencias;
        this.goles=goles;
        this.tirosAlArco=tirosAlArco;
    }

    public double getPorcentajeGoles() {
        return porcentajeGoles;
    }

    public void setPorcentajeGoles(double porcentajeGoles) {
        this.porcentajeGoles = porcentajeGoles;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTirosAlArco() {
        return tirosAlArco;
    }

    public void setTirosAlArco(int tirosAlArco) {
        this.tirosAlArco = tirosAlArco;
    }

    public void actualizarPorcentajeGoles(){
        double porcentaje= (goles * 100)/tirosAlArco;
        setPorcentajeGoles(porcentaje);
    }

    @Override
    public void contratar(Equipos equipo){
        try {
            verificarConHistorial(equipo);
            verificarGoles();
            verificarAsistencias();
        }catch (YaJugoException e){
            System.out.println(e.getMessage());
        }catch (GolesException e){
            System.out.println(e.getMessage());
        }catch (AsistenciasException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void renovar(Equipos equipo) {
        try {
            verificarEquipoRenovacion(equipo);
            verificarEdad();
        }catch (NoEsElMismoEquipoException e){
            System.out.println(e.getMessage());
        }catch (MayorException e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void verificarConHistorial(Equipos equipo) throws YaJugoException{
        if(getHistorialEquipos().contains(equipo.getNombreEquipo())){
            throw new YaJugoException("Ya jugó en este equipo y no puede hacerlo otra vez");
        }
    }

    @Override
    void verificarEquipoRenovacion(Equipos equipo)throws NoEsElMismoEquipoException {
        if(getEquipoActual() != equipo){
            throw new NoEsElMismoEquipoException("No se puede renovar ya que el jugador no pertenece al equipo");
        }
    }

    @Override
    void verificarEdad() throws MayorException {
        LocalDate ahora= LocalDate.now();
        int anioMaximo= getFechaNac().getYear() + 35;
        if(ahora.getYear() > anioMaximo){
            throw new MayorException("No se puede renovar por ser mayor de 35");
        }
    }

    public void verificarGoles() throws GolesException{
        if(getPorcentajeGoles() < 30){
            throw new GolesException("No cumple con el 30% de goles hechos");
        }
    }
    public void verificarAsistencias()throws AsistenciasException{
        if(getCantAsistencias()<10){
            throw new AsistenciasException("No llega a más de 10 asistencias y por eso no puede contratarse");
        }
    }
}

package Ejercicio.src;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Arquero extends JugadorFutbol{
    private double porcentajeAtajadas;
    private int atajadas;
    private int golesRecibidos;
    public Arquero(String nombre, LocalDate nacimiento, Provincia provincia, int nroCamiseta, HashSet<String> historialEquipos, double porcentajeAtajadas, int golesRecibidos, Equipos equipoActual, int atajadas) {
        super(nombre, nacimiento, PosicionFutbol.ARQUERO, provincia, nroCamiseta, historialEquipos, equipoActual);
        this.porcentajeAtajadas=porcentajeAtajadas;
        this.golesRecibidos=golesRecibidos;
        this.atajadas=atajadas;
    }
    public double getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }
    public void setPorcentajeAtajadas(double porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }
    public int getGolesRecibidos() {
        return golesRecibidos;
    }
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
    public int getAtajadas() {
        return atajadas;
    }
    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }
    public void calcularPorcentajeAtajadas(){
        double porcentaje=(atajadas*100)/(atajadas+golesRecibidos);
        setPorcentajeAtajadas(porcentaje);
    }
    @Override
    public void contratar(Equipos equipo) {
        try {
            verificarConHistorial(equipo);
            verificarAtajadas();
            verificarGoles();
        }catch (YaJugoException e){
            System.out.println(e.getMessage());
        }catch (PorcentajeAtajadasException e){
            System.out.println(e.getMessage());
        }catch (GolesException e){
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
    public void verificarConHistorial(Equipos equipo) throws YaJugoException {
        if(getHistorialEquipos().contains(equipo.getNombreEquipo())){
            throw new YaJugoException("Ya jugó en este equipo y no puede hacerlo otra vez");
        }
    }

    @Override
    void verificarEquipoRenovacion(Equipos equipo) throws NoEsElMismoEquipoException {
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

    public void verificarAtajadas() throws PorcentajeAtajadasException{
        if(getPorcentajeAtajadas() < 60){
            throw new PorcentajeAtajadasException("No puede ser contratado porque el porcentaje de atajadas en menor a 60");
        }
    }
    public void verificarGoles() throws GolesException{
        if(getGolesRecibidos()>10){
            throw new GolesException("No puede contratarse porque los goles recibidos son mayores a 10");
        }
    }
}

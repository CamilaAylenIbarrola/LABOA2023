package Ejercicio.src;

import java.time.LocalDateTime;

public class FuncionCine {
    private Pelicula pelicula;
    private LocalDateTime fechaHora;
    private SalaCine sala;
    private int entradasVendidas;

    public FuncionCine(Pelicula pelicula, LocalDateTime fechaHora, SalaCine sala, int entradasVendidas) {
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.entradasVendidas = entradasVendidas;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    public SalaCine getSala() {
        return sala;
    }
    public void setSala(SalaCine sala) {
        this.sala = sala;
    }
    public int getEntradasVendidas() {
        return entradasVendidas;
    }
    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }
}

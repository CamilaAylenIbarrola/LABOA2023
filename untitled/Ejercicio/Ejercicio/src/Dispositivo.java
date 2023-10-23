package Ejercicio.src;

public abstract class Dispositivo {
    private int nroSerie;
    private String fabricante;
    private String modelo;
    public Dispositivo(int nroSerie, String fabricante, String modelo){
        this.nroSerie=nroSerie;
        this.fabricante=fabricante;
        this.modelo=modelo;
    }
    public int getNroSerie() {
        return nroSerie;
    }
    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

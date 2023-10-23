package Ejercicio.src;
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int cantRuedas;
    private int año;
    public Vehiculo(){
        this.marca="Volkswagen";
        this.modelo="Suran";
        this.color=Color.GRIS;
        this.cantRuedas=4;
        this.año=2015;
    }
    public Vehiculo(String marca, String modelo, Color color, int cantRuedas, int año){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.cantRuedas=cantRuedas;
        this.año=año;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getCantRuedas() {
        return cantRuedas;
    }
    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
}

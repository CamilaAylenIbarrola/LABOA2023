package Ejercicio.src;

public abstract class Bebida {
    private String nombre;
    private double coefPositividad;
    private double coefNegatividad;
    private int stock;

    public Bebida(String nombre, double coefPositividad, double coefNegatividad, int stock) {
        this.nombre = nombre;
        this.coefPositividad = coefPositividad;
        this.coefNegatividad = coefNegatividad;
        this.stock=stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCoefPositividad() {
        return coefPositividad;
    }
    public void setCoefPositividad(double coefPositividad) {
        this.coefPositividad = coefPositividad;
    }
    public double getCoefNegatividad() {
        return coefNegatividad;
    }
    public void setCoefNegatividad(double coefNegatividad) {
        this.coefNegatividad = coefNegatividad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

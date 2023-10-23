package Ejercicio.src;

public abstract class Componente {
    private String nombreFabricante;
    private String modelo;
    private double precio;
    private int stock;
    private String nombre;
    public Componente(String nombre, String nombreFabricante, String modelo,double precio, int stock){
        this.nombre= nombre;
        this.nombreFabricante=nombreFabricante;
        this.modelo=modelo;
        this.precio=precio;
        this.stock=stock;
    }
    public String getNombreFabricante() {
        return nombreFabricante;
    }
    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

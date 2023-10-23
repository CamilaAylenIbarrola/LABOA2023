package Ejercicio.src;

public abstract class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public Producto(){
        this.nombre="Auriculares inalambricos Haylou";
        this.precio=5000;
        this.stock=100;
    }
    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
}

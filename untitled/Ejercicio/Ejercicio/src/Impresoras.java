package Ejercicio.src;

public class Impresoras extends DispSalida{
    private boolean laser;
    private boolean inyeccion;
    public Impresoras(String nombre, String puertosValidos, String nombreFabricante, String modelo, double precio, boolean laser, boolean inyeccion, int stock) {
        super(nombre, puertosValidos, nombreFabricante, modelo, precio, stock);
        this.laser= laser;
        this.inyeccion= inyeccion;
    }
    public boolean isLaser() {
        return laser;
    }
    public void setLaser(boolean laser) {
        this.laser = laser;
    }
    public boolean isInyeccion() {
        return inyeccion;
    }
    public void setInyeccion(boolean inyeccion) {
        this.inyeccion = inyeccion;
    }
}

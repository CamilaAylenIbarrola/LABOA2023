package Ejercicio.src;

public abstract class Periferico extends Componente{
    private String puertosValidos;
    public Periferico(String nombre, String puertosValidos, String nombreFabricante, String modelo, double precio, int stock) {
        super(nombre, nombreFabricante, modelo, precio, stock);
        this.puertosValidos= puertosValidos;
    }
    public String getPuertosValidos() {
        return puertosValidos;
    }
    public void setPuertosValidos(String puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}

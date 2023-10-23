package Ejercicio.src;

public class DispEntrada extends Periferico{
    private String tipoConector;
    public DispEntrada(String nombre, String nombreFabricante, String modelo, double precio, String tipoConector, String puertosValidos, int stock) {
        super(nombre, puertosValidos, nombreFabricante, modelo, precio, stock);
        this.tipoConector= tipoConector;
    }
    public String getTipoConector() {
        return tipoConector;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

}

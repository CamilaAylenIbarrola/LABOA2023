public class DispositivoEntrada extends Periferico{
    private String tipoConector;
    public DispositivoEntrada(String nombre, String nombreFabricante, String modelo, double precio, String tipoConector, String puertosValidos, int stock) {
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

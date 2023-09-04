public class EquipoSonido extends Multimedia{
    private boolean bluetooth;
    public EquipoSonido(String nombre, double precio, int stock, boolean bluetooth){
        super(nombre, precio, stock);
        this.bluetooth=bluetooth;
    }
    public boolean isBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}

package Ejercicio.src;

public class CargadorPortatil extends Cargador{
    private int cantCargas;
    public CargadorPortatil(String nombre, double precio, int stock, int cantCargas){
        super(nombre, precio, stock);
        this.cantCargas=cantCargas;
    }
    public int getCantCargas() {
        return cantCargas;
    }
    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}

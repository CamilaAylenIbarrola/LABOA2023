package Ejercicio.src;

public class BebidaAlcoholica extends Bebida{
    private int cantAlcohol;
    public BebidaAlcoholica(String nombre, int cantAlcohol, int stock) {
        super(nombre, 0, (cantAlcohol*20), stock);
        this.cantAlcohol= cantAlcohol;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }
}

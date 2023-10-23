package Ejercicio.src;

public class BebidaAzucarada extends Bebida{
    private int cantAzucar;

    public BebidaAzucarada(String nombre, int cantAzucar, int stock) {
        super(nombre, 1, (cantAzucar*10), stock);
        this.cantAzucar = cantAzucar;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

}

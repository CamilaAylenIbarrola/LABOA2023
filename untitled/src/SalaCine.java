
public class SalaCine{
    private int numeroSala;
    private static int cantButacas=45;
    private int butacasActuales;

    public SalaCine(int numeroSala, int butacasActuales) {
        this.numeroSala = numeroSala;
        this.butacasActuales = butacasActuales;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public static int getCantButacas() {
        return cantButacas;
    }

    public static void setCantButacas(int cantButacas) {
        SalaCine.cantButacas = cantButacas;
    }

    public int getButacasActuales() {
        return butacasActuales;
    }

    public void setButacasActuales(int butacasActuales) {
        this.butacasActuales = butacasActuales;
    }
}

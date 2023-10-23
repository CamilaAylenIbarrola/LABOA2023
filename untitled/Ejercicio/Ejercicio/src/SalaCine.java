package Ejercicio.src;

public class SalaCine {
    private static int butacas=45;
    private static int contador=0;
    private int identificador=0;

    public SalaCine(int identificador) {
        this.identificador = SalaCine.contador+1;
        SalaCine.setContador(contador+1);
    }
    public static int getButacas() {
        return butacas;
    }
    public static void setButacas(int butacas) {
        SalaCine.butacas = butacas;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        SalaCine.contador = contador;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}

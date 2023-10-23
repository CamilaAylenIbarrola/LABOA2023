package Ejercicio.src;

public class Pez extends Animal{
    private static int vidasIniciales=10;
    private int vidasActuales;
    public Pez(String nombre, Dueno dueno) {
        super(nombre, dueno);
        setAlegria(0);
        this.vidasActuales=this. vidasIniciales;
    }
    public static int getVidasIniciales() {
        return vidasIniciales;
    }
    public static void setVidasIniciales(int vidas) {
        Pez.vidasIniciales = vidas;
    }
    public int getVidasActuales() {
        return vidasActuales;
    }
    public void setVidasActuales(int vidasActuales) {
        this.vidasActuales = vidasActuales;
    }

    @Override
    void saludar(boolean esDueno) {
    }
    @Override
    void alimentar() {
        if(getAlegria()<3) {
            setAlegria(getAlegriaInicial() + 1);
        }
    }

    @Override
    void tipoMascota() {
        System.out.printf("Soy un pez");
    }

    public int restarVidas(){
        this.vidasActuales=vidasActuales--;
        return vidasActuales;
    }


}

public class Pez extends Mascota{
    private static int cantVidas=10;
    private int vidasActuales;

    public Pez(String nombre, Dueno dueno) {
        super(nombre, dueno);
        this.vidasActuales=cantVidas;
    }

    public static int getCantVidas() {
        return cantVidas;
    }

    public static void setCantVidas(int cantVidas) {
        Pez.cantVidas = cantVidas;
    }

    public int getVidasActuales() {
        return vidasActuales;
    }

    public void setVidasActuales(int vidasActuales) {
        this.vidasActuales = vidasActuales;
    }

    @Override
    void saludar(boolean esDueno) {
        if(esDueno==true){
            vidasActuales=vidasActuales-1;
        }else{
            vidasActuales=0;
        }

    }

    @Override
    void alimentar() {
        vidasActuales=vidasActuales+1;
    }
    public void restarVidas(){
        this.vidasActuales=vidasActuales-1;
    }
    @Override
    void tipoMascota() {
        System.out.println("pez");
    }
}

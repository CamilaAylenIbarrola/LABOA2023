package Ejercicio.src;
public class Profesores extends Persona{
    private int porcDesc;
    public Profesores(String nombre, String apellido, int porcDesc){
        super(nombre, apellido);
        this.porcDesc=porcDesc;
    }
    public int getPorcDesc() {
        return porcDesc;
    }
    public void setPorcDesc(int porcDesc) {
        this.porcDesc = porcDesc;
    }
}

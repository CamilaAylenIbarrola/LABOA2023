public class Profesor extends Persona{
    private int porcDesc;
    public Profesor(String nombre, String apellido, int porcDesc){
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

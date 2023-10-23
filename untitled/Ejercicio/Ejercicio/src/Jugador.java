package Ejercicio.src;
public class Jugador extends Persona {
    private Fecha fNacimiento;
    private int nroCamiseta;
    private boolean esCapitan;
    public Jugador(String nombre, String apellido, int nroCamiseta, boolean esCapitan){
        super(nombre, apellido);
        this.nroCamiseta=nroCamiseta;
        this.esCapitan=esCapitan;
    }
    /*public String getNombre() {
        return nombre;
    }*/
    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    public int getNroCamiseta() {
        return nroCamiseta;
    }
    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }
    public boolean getEsCapitan() {
        return esCapitan;
    }
    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }
}

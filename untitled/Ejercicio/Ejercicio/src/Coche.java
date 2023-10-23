package Ejercicio.src;

public class Coche extends Vehiculo {
    private String patente;
    private boolean descapotable;
    private int velocidad;

    public Coche(String marca, String modelo, Color color, int cantRuedas, int año, String patente, boolean descapotable){
        super(marca, modelo, color, cantRuedas, año);
        this.patente=patente;
        this.descapotable=descapotable;
    }
    public void setVelocidad(int v){
        velocidad=v;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public boolean getDescapotable() {
        return descapotable;
    }
    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
    public void frenar(){
        int v=this.velocidad;
        v--;
        setVelocidad(v);
    }
    public void acelerar() {
        int v = this.velocidad;
        v++;
        setVelocidad(v);
    }
}

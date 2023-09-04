public class Camioneta extends Vehiculo {
    private String patente;
    private int capacidad;
    private int cargaActual;
    public Camioneta(String marca, String modelo, Color color, int cantRuedas, int año, String patente, int capacidad, int cargaActual){
        super(marca, modelo, color, cantRuedas, año);
        this.patente=patente;
        this.capacidad=capacidad;
        this.cargaActual=cargaActual;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public int getCargaActual() {
        return cargaActual;
    }
    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }
    public void agregarCarga(int cantidad){
        if(cantidad + cargaActual < capacidad){
            cargaActual=cantidad + cargaActual;
        }else{
            System.out.println("No se puede agregar esa carga. Supera la capacidad máxima de la camioneta");
        }
    }

}

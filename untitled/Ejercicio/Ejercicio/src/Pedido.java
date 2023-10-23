package Ejercicio.src;

public class Pedido {
    private Fecha fecha;
    private Plato plato1;
    private Persona persona1;
    private boolean entregado;
    private Tiempo horaEntrega;
    public Pedido( Fecha fecha, Plato plato1, Persona persona1, boolean entregado, Tiempo horaEntrega){
        this.fecha=fecha;
        this.plato1=plato1;
        this.persona1=persona1;
        this.entregado=entregado;
        this.horaEntrega=horaEntrega;
    }
    public Pedido(){

    }
    public Fecha getFecha() {
        return fecha;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public Plato getPlato1() {
        return plato1;
    }
    public void setPlato1(Plato plato1) {
        this.plato1 = plato1;
    }
    public Persona getPersona1() {
        return persona1;
    }
    public void setPersona1(Persona persona1) {
        this.persona1 = persona1;
    }
    public boolean getEntregado() {
        return entregado;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Tiempo getHoraEntrega() {
        return horaEntrega;
    }
    public void setHoraEntrega(Tiempo horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    public double calcularPrecio(){
        int porcentaje=((Profesores) persona1).getPorcDesc();
        double precio= plato1.getPrecio();
        double precioFinal;
        precioFinal= precio-((precio*porcentaje)/100);
        return precioFinal;

    }

}

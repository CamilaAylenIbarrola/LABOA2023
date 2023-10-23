package Ejercicio.src;

public class Televisor extends Multimedia{
    private TecnologiaTV tecnologia;
    private String resolucion;
    private Televisor(String nombre, double precio, int stock, TecnologiaTV tecnologia, String resolucion){
        super(nombre,precio,stock);
        this.tecnologia=tecnologia;
        this.resolucion=resolucion;
    }
    public String getTecnologia() {
        return tecnologia.getNombreTecnologia();
    }
    public void setTecnologia(TecnologiaTV tecnologia) {
        this.tecnologia = tecnologia;
    }
    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}

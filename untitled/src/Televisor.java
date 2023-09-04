public class Televisor extends Multimedia{
    private TecnoTV tecnologia;
    private String resolucion;
    private Televisor(String nombre, double precio, int stock, TecnoTV tecnologia, String resolucion){
        super(nombre,precio,stock);
        this.tecnologia=tecnologia;
        this.resolucion=resolucion;
    }
    public String getTecnologia() {
        return tecnologia.getNombreTecnologia();
    }
    public void setTecnologia(TecnoTV tecnologia) {
        this.tecnologia = tecnologia;
    }
    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}

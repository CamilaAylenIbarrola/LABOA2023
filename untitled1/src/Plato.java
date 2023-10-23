public class Plato {
    private String nombre;
    private String descripcion;
    private TipoPlato tipo;
    private double precio;
    private Chef chefAcargo;

    public Plato(String nombre, String descripcion, TipoPlato tipo, double precio, Chef chefAcargo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.chefAcargo = chefAcargo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public TipoPlato getTipo() {
        return tipo;
    }
    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }
    public Chef getChefAcargo() {
        return chefAcargo;
    }
    public void setChefAcargo(Chef chefAcargo) {
        this.chefAcargo = chefAcargo;
    }
}

package Ejercicio.src;
public class Plato {
    private String nombre;
    private String descripcion;
    private TipoPlato tipo;
    private double precio;
    private float calorias;
    private Chef chefACargo;
    public Plato(String nombre, double precio, float calorias){
        this.nombre=nombre;
        this.precio=precio;
        this.calorias=calorias;
    }
    public Plato(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public Plato(String nombre, float calorias){
        this.nombre=nombre;
        this.calorias=calorias;
    }
    public Plato(){
    }

    public Plato(String nombre, String descripcion, TipoPlato tipo, double precio, Chef chefACargo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.chefACargo= chefACargo;
    }

    public Chef getChefACargo() {
        return chefACargo;
    }

    public void setChefACargo(Chef chefACargo) {
        this.chefACargo = chefACargo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public TipoPlato getTipo() {
        return tipo;
    }
    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }
    public float getCalorias() {
        return calorias;
    }
    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

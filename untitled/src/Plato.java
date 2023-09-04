public class Plato {
    private String nombre;
    private double precio;
    private float calorias;
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
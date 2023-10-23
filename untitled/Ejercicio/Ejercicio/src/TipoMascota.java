package Ejercicio.src;

public enum TipoMascota {
    PERRO("Perro"), GATO("Gato"), PAJARITO("Pajarito"), PEZ("Pez");
    private String nombre;
    private TipoMascota(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

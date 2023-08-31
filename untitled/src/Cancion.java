

public class Cancion {
    private String nombre;
    private Persona Autor;

    public Cancion() {
        nombre="lola";
        Autor=new Persona();
    }

    public Cancion(String nombre, Persona autor) {
        this.nombre = nombre;
        Autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getAutor() {
        return Autor;
    }

    public void setAutor(Persona autor) {
        Autor = autor;
    }
}

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(String titulo, Persona autor){
        this.titulo= titulo;
        this.autor= autor;
    }
    public Cancion(){
        this.titulo="";
        this.autor=null;

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Persona getAutor() {
        return autor;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public String mostrarInfo(){
        String info= titulo + " " + autor;
        return info;
    }
}

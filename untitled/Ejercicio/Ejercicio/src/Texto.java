package Ejercicio.src;

public abstract class Texto implements Prestable{
    private int codigo;
    private int anioPublicacion;
    private String titulo;


    public Texto(int codigo, int anioPublicacion, String titulo) {
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public abstract String toString();
}

import java.sql.Time;

public class Pelicula {
    private String titulo;
    private int duracion;
    private Genero generopeli;
    private static int contadorId;
    private int identificador;

    public Pelicula(String titulo, int duracion, Genero generopeli, int identificador) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.generopeli = generopeli;
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGeneropeli() {
        return generopeli;
    }

    public void setGeneropeli(Genero generopeli) {
        this.generopeli = generopeli;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Pelicula.contadorId = contadorId;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

}

package Ejercicio.src;

public class Pelicula {
    private String titulo;
    private int tiempoMinutos;
    private GeneroPelicula genero;
    private static int contador =0;
    private int identificador;
    public Pelicula(String titulo, int tiempoMinutos, GeneroPelicula genero){
        this.titulo=titulo;
        this.tiempoMinutos=tiempoMinutos;
        this.genero=genero;
        this.identificador=Pelicula.getContador()+1;
        Pelicula.setContador(getContador()+1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(int tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pelicula.contador = contador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}

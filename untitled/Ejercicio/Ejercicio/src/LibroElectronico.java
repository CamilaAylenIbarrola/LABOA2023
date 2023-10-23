package Ejercicio.src;

public class LibroElectronico {
    private String titulo;
    private Autor autor;
    private String nombrePDF;
    private GeneroLiterario genero;
    private static int cantDescargas=80;
    private int cantDescargasActual;

    public LibroElectronico(String titulo, Autor autor, String nombrePDF, GeneroLiterario genero, int cantDescargasActual) {
        this.titulo = titulo;
        this.autor = autor;
        this.nombrePDF = nombrePDF;
        this.genero= genero;
        this.cantDescargasActual=cantDescargasActual;
    }

    public int getCantDescargasActual() {
        return cantDescargasActual;
    }
    public void setCantDescargasActual(int cantDescargasActual) {
        this.cantDescargasActual = cantDescargasActual;
    }
    public GeneroLiterario getGenero() {
        return genero;
    }
    public void setGenero(GeneroLiterario genero) {
        this.genero = genero;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public String getNombrePDF() {
        return nombrePDF;
    }
    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }
    public static int getCantDescargas() {
        return cantDescargas;
    }
    public static void setCantDescargas(int cantDescargas) {
        LibroElectronico.cantDescargas = cantDescargas;
    }

}

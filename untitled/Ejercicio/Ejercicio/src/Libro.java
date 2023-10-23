package Ejercicio.src;
public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int cantpags;
    private Editorial editorial;
    private Fecha fPublicacion;

    /*public Libro(){
        this.titulo="Harry Potter y el prisionero de Ázkaban";
        this.autor= new Persona("JK", "Rowling", 57, "Diagon 123");
        this.isbn=12345678;
        this.cantpags=200;
        this.editorial= Editorial.ELATENEO;
        this.fPublicacion= new Fecha(Dia.LUNES, 8, 7,2000);
    }*/

    public Libro(String titulo, Persona autor, int isbn, int cantpags, Editorial editorial, Fecha fPublicacion){
        this.titulo= titulo;
        this.autor= autor;
        this.isbn= isbn;
        this.cantpags= cantpags;
        this.editorial= editorial;
        this.fPublicacion= fPublicacion;
    }
    public Libro(String titulo, Persona autor, Editorial editorial){
        this.titulo= titulo;
        this.autor= autor;
        this.editorial= editorial;
    }

    public String getTitulo() {
        return titulo;
    }
    public Persona getAutor() {
        return autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public int getCantpags() {
        return cantpags;
    }
    public String getEditorial() {
        return this.editorial.name();
    }
    public Fecha getFPublicacion() {
        return fPublicacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void setCantpags(int cantpags) {
        this.cantpags = cantpags;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public void setFpublicacion(Fecha fpublicacion) {
        this.fPublicacion = fpublicacion;
    }
    public String mostrarInfo(){
        String elautor= autor.impresionDatos();
        String publicacion= fPublicacion.corta();
        String info="Titulo: " + titulo + " Autor: " + elautor + " Cantidad de páginas: " + cantpags + " Editorial: " + editorial + " Fecha de publicación: " + publicacion;
        return info;
    }
    public boolean anteriorOtro(Libro libro1){
        boolean esAnterior;
        Fecha fecha= libro1.getFPublicacion();
        esAnterior=fPublicacion.menorQue(fecha);
        if(esAnterior){
        System.out.println("El primer libro es anterior al segundo");
        }else{
        System.out.println("El segundo libro es anterior al primero");
        }
        return esAnterior;
    }
}

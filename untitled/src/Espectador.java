import java.util.HashSet;

public class Espectador extends Persona {
    private static int contadorUsuarios;
    private int identificador;
    private String mailRegistro;
    private HashSet<Pelicula>PelisVistas;

    public Espectador(String nombre, String apellido, Fecha nacimiento, int identificador, String mailRegistro, HashSet<Pelicula> pelisVistas) {
        super(nombre, apellido, nacimiento);
        this.identificador = identificador;
        this.mailRegistro = mailRegistro;
        PelisVistas = pelisVistas;
    }

    public Espectador() {

    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public static void setContadorUsuarios(int contadorUsuarios) {
        Espectador.contadorUsuarios = contadorUsuarios;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getMailRegistro() {
        return mailRegistro;
    }

    public void setMailRegistro(String mailRegistro) {
        this.mailRegistro = mailRegistro;
    }

    public HashSet<Pelicula> getPelisVistas() {
        return PelisVistas;
    }

    public void setPelisVistas(HashSet<Pelicula> pelisVistas) {
        PelisVistas = pelisVistas;
    }
}
package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashSet;

public class Espectador extends Persona {
    private static int contador=0;
    private int identificador;
    private String mail;
    private HashSet<Pelicula> pelisVistas;
    public Espectador(String nombre, String apellido, LocalDate fechaNacimiento, String mail, HashSet<Pelicula> pelisVistas){
        super(nombre, apellido, fechaNacimiento);
        this.identificador= Espectador.contador + 1;
        Espectador.setContador(contador+1);
        this.mail= mail;
        this.pelisVistas=pelisVistas;
    }
    public Espectador(){

    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Espectador.contador = contador;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public HashSet<Pelicula> getPelisVistas() {
        return pelisVistas;
    }
    public void setPelisVistas(HashSet<Pelicula> pelisVistas) {
        this.pelisVistas = pelisVistas;
    }
}

package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona{
    private String mail;
    private HashSet<LibroElectronico>listaPrestados;
    private Membresia membresia;

    public Usuario(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String mail, HashSet<LibroElectronico>listaPrestados, Membresia membresia){
        super(nombre, apellido ,dni, fechaNacimiento);
        this.mail=mail;
        this.listaPrestados=listaPrestados;
        this.membresia=membresia;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public HashSet<LibroElectronico> getListaPrestados() {
        return listaPrestados;
    }
    public void setListaPrestados(HashSet<LibroElectronico> listaPrestados) {
        this.listaPrestados = listaPrestados;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}

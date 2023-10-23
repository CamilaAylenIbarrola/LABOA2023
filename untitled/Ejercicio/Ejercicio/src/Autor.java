package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona{
    private HashSet<LibroElectronico>bibliografia;

    public HashSet<LibroElectronico> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<LibroElectronico> bibliografia) {
        this.bibliografia = bibliografia;
    }

    public Autor(String nombre, String apellido, int dni, String direccion, LocalDate fechaNacimiento, HashSet<LibroElectronico>bibliografia){
        super(nombre, apellido, dni, fechaNacimiento, direccion);
        this.bibliografia=bibliografia;

    }
}

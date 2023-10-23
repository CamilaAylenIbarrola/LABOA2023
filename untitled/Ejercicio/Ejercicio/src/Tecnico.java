package Ejercicio.src;
public class Tecnico extends Empleado {
    public Tecnico(String nombre){
        super(nombre);
    }
    @Override
    public String toString() {
        return "Empleado" + " " + getNombre() + " -> " + "Operario" + "-> " + getClass().getCanonicalName();
    }
}

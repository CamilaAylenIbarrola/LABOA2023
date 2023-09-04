public class Operario extends Empleado{
    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado" + " " + getNombre() + " -> " + getClass().getCanonicalName();
    }
}

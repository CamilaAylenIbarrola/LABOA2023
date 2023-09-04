public class Oficial extends Empleado{
    public Oficial(String nombre){
        super(nombre);
    }
    @Override
    public String toString() {
        return "Empleado" + " " + getNombre() + " -> "+ "Operario" + " -> "+ getClass().getCanonicalName();
    }
}

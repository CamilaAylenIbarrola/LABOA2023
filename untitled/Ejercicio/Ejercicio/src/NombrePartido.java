package Ejercicio.src;

public enum NombrePartido {
    ELPOLIAVANZA("El poli avanza"), JUNTOSPORELPOLI("Juntos por el poli"), UNIONPORLADOCENCIA("Union por la docencia"), FRENTEDECONSTITUYENTES("Frente de constituyentes");
    private String nombre;
    private NombrePartido(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}

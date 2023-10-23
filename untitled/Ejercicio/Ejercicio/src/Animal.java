package Ejercicio.src;

public abstract class Animal {
    private String nombre;
    private Dueno dueno;
    private int alegria;
    private static int alegriaInicial=1;
    public Animal(String nombre, Dueno dueno) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.alegria=alegriaInicial;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona getDueno() {
        return dueno;
    }
    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public int getAlegria() {
        return alegria;
    }
    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }
    public static int getAlegriaInicial() {
        return alegriaInicial;
    }

    public static void setAlegriaInicial(int alegriaInicial) {
        Animal.alegriaInicial = alegriaInicial;
    }

    abstract void saludar(boolean esDueno);
    abstract void alimentar();
    abstract void tipoMascota();

}

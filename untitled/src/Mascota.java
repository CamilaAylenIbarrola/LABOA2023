public abstract class Mascota {
    private String nombre;
    private Dueno dueno;
    private static int alegria=1;
    private int alegriaActual;

    public Mascota(String nombre, Dueno dueno, int alegria) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.alegriaActual=alegria;
    }
    public Mascota(String nombre, Dueno dueno) {
        this.nombre = nombre;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueno getDueno() {
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

    public int getAlegriaActual() {
        return alegriaActual;
    }

    public void setAlegriaActual(int alegriaActual) {
        this.alegriaActual = alegriaActual;
    }

    abstract void saludar(boolean esDueno);
    abstract void alimentar();
    abstract void tipoMascota();

}

public enum TipoMascota {
    PERRO("perro"), GATO("gato"), PAJARITO("pajarito");

    private String nombre;

    TipoMascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

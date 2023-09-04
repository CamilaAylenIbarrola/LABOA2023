public enum EditorialLibro {
    KAPELUSZ("Kapelusz"), SUDAMERICANA("Sudamericana"), ATLANTIDA("Atlantida"), ELATENEO("El ateneo"), INTERZONA("Interzona"), SUR("Sur"), ALIANZA("Alianza");

    private String nombreEditorial;
    private EditorialLibro(String nombreEditorial){
        this.nombreEditorial=nombreEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }
}

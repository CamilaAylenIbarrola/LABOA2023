public enum Turno {
    MAÑANA("Mañana"), TARDE("Tarde"), NOCHE("Noche");
    private String nombreTurno;
    private Turno(String nombreTurno){
        this.nombreTurno=nombreTurno;
    }
    public String getNombreTurno() {
        return nombreTurno;
    }
}

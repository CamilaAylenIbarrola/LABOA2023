public class Partido {
    private Candidato candidato;
    private PartidosPoliticos nombre;

    public Partido(Candidato candidato, PartidosPoliticos nombre) {
        this.candidato = candidato;
        this.nombre = nombre;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public PartidosPoliticos getNombre() {
        return nombre;
    }

    public void setNombre(PartidosPoliticos nombre) {
        this.nombre = nombre;
    }
}

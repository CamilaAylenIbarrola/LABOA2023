package Ejercicio.src;

public class PartidoPolitico {
    private NombrePartido partido;
    private Candidato candidato;
    public PartidoPolitico(NombrePartido partido, Candidato candidato){
        this.partido=partido;
        this.candidato= candidato;
    }
    public NombrePartido getPartido() {
        return partido;
    }
    public void setPartido(NombrePartido partido) {
        this.partido = partido;
    }
    public Candidato getCandidato() {
        return candidato;
    }
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}

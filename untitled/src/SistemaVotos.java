import java.util.HashSet;
import java.util.Map;

public class SistemaVotos {
    private HashSet<Votante>habilitados;
    private HashSet<Partido>partidos;

    public float calcularPorcentaje(int cantidadVotos){
        float porcentaje= (cantidadVotos*100)/habilitados.size();
        return porcentaje;
    }

    public void ganador(){
        int mayorVotos=0;
        Candidato ganador=null;
        for(Partido partido : partidos){
            if(partido.getCandidato().contarVotos()>mayorVotos){
                mayorVotos=partido.getCandidato().contarVotos();
                ganador=partido.getCandidato();
            }
        }
        System.out.println(ganador.getNombre());
    }
    public void noVotaron(){
        int totalVotos=0;
        int personasnovotaron=0;
        float porcentajeNoVotos=0;
        for(Partido partido : partidos){
            partido.getCandidato().contarVotos();
            totalVotos=totalVotos + partido.getCandidato().contarVotos();
        }
        personasnovotaron=habilitados.size()-totalVotos;
        porcentajeNoVotos=(personasnovotaron*100)/ habilitados.size();
    }
}
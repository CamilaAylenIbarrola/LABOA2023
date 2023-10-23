package Ejercicio.src;

import java.util.HashSet;
import java.util.Map;

public class Elecciones {
    private HashSet<Votante> listaVotantes;
    private HashSet<PartidoPolitico> listaPartidos;
    public Elecciones(HashSet<Votante> listaVotantes, HashSet<PartidoPolitico> listaPartidos){
        this.listaVotantes=listaVotantes;
        this.listaPartidos=listaPartidos;

    }

    public HashSet<Votante> getListaVotantes() {
        return listaVotantes;
    }

    public void setListaVotantes(HashSet<Votante> listaVotantes) {
        this.listaVotantes = listaVotantes;
    }

    public HashSet<PartidoPolitico> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(HashSet<PartidoPolitico> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
    public void ganador() {
        int masVotado = 0;
        Candidato elGanador= null;
        for (PartidoPolitico partido : listaPartidos) {
            int cantVotos = 0;
            for (Map.Entry<NombreProvincia, Integer> entrada : partido.getCandidato().getCantVotos().entrySet()) {
                cantVotos = cantVotos + entrada.getValue();
            }
            if (cantVotos>masVotado){
                elGanador=partido.getCandidato();
            }
        }
        System.out.println(elGanador.getNombre() + elGanador.getApellido());
    }
    public float calcularPorcentaje(int votos){
        float porcentaje=(votos*100)/ listaVotantes.size();
        return porcentaje;
    }
    public void mostarVotos(){
        for(PartidoPolitico partido:listaPartidos){
            System.out.println(partido.getCandidato().getNombre() + partido.getCandidato().getApellido());
            System.out.println(partido.getCandidato().contarVotos());
            System.out.println(calcularPorcentaje(partido.getCandidato().contarVotos()));
        }
    }
    public void mostrarGanador(){
        int mayorVotos=0;
        Candidato ganador= null;
        for(PartidoPolitico partido:listaPartidos){
            if(partido.getCandidato().contarVotos()>mayorVotos){
                mayorVotos=partido.getCandidato().contarVotos();
                ganador=partido.getCandidato();
            }
        }
        System.out.println(ganador.getNombre() + ganador.getApellido());
    }
    public void porcentajeNoVoto(){
        int votosTotales=0;
        for(PartidoPolitico partido: listaPartidos){
            votosTotales=partido.getCandidato().contarVotos() + votosTotales;
        }
        System.out.println(votosTotales);
        float porcentaje=(votosTotales*100)/ listaVotantes.size();
        porcentaje= 100 - porcentaje;
        System.out.println(porcentaje);
    }
}

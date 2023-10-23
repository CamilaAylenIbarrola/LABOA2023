package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainPaso {
    public static void main(String[] args) {
        HashMap<TemaPropuesta, HashSet<String>>listaPropuestasc1=new HashMap<>();
        HashSet<String>propuestasAmbientec1=new HashSet<>();
        propuestasAmbientec1.add("Uso de energias renovables");
        HashSet<String>propuestasEconomicas1=new HashSet<>();
        propuestasEconomicas1.add("Bajar inflacion");
        HashMap<NombreProvincia, Integer>listaVotos= new HashMap<>();
        HashMap<NombreProvincia, Integer>listaVotos2= new HashMap<>();
        listaPropuestasc1.put(TemaPropuesta.AMBIENTE, propuestasAmbientec1);
        Candidato candidato1= new Candidato("Diego", "Castillo", 26598698, LocalDate.of(1989, 6, 12), NombrePartido.JUNTOSPORELPOLI, listaPropuestasc1, listaVotos);

        PartidoPolitico partido1= new PartidoPolitico(NombrePartido.JUNTOSPORELPOLI, candidato1);

        HashMap<TemaPropuesta, HashSet<String>>listaPropuestasc2=new HashMap<>();
        HashSet<String>propuestasAmbientec2=new HashSet<>();
        propuestasAmbientec2.add("Reciclar");
        HashSet<String>propuestasEconomicas2=new HashSet<>();
        propuestasAmbientec2.add("Reducir impuestos");
        listaPropuestasc2.put(TemaPropuesta.AMBIENTE, propuestasAmbientec1);
        Candidato candidato2= new Candidato("Delfina", "Rojas", 27986305, LocalDate.of(1990, 11, 27), NombrePartido.ELPOLIAVANZA, listaPropuestasc2,listaVotos2);
        PartidoPolitico partido2=new PartidoPolitico(NombrePartido.ELPOLIAVANZA, candidato2);

        Votante votante1=new Votante("Tadeo", "Perez", 29658321, LocalDate.of(1995, 6, 18), false, NombreProvincia.BUENOSAIRES);
        Votante votante2=new Votante("Catalina", "Rodriguez", 29658322, LocalDate.of(1995, 6, 19), false, NombreProvincia.CORDOBA);
        Votante votante3=new Votante("Jorge", "Rojas", 29658324, LocalDate.of(1995, 6, 22), false, NombreProvincia.CATAMARCA);

        HashSet<Votante>listaVotantes= new HashSet<>();
        listaVotantes.add(votante1);
        listaVotantes.add(votante2);
        listaVotantes.add(votante3);

        HashSet<PartidoPolitico>listaPartidos=new HashSet<>();
        listaPartidos.add(partido1);
        listaPartidos.add(partido2);
        Elecciones paso= new Elecciones(listaVotantes, listaPartidos);

        votante1.emitirVoto(candidato1);
        votante2.emitirVoto(candidato1);
        votante2.emitirVoto(candidato2);
        int votosc1=candidato1.contarVotos();
        int votosc2=candidato2.contarVotos();
        System.out.println("Candidato1 " + votosc1);
        System.out.println("Porcentaje " + paso.calcularPorcentaje(votosc1));
        System.out.println("Candidato2 " + votosc2);
        System.out.println("Porcentaje " + paso.calcularPorcentaje(votosc2));

        System.out.println("Ganó ");
        paso.mostrarGanador();

        System.out.println("% No votaron");
        paso.porcentajeNoVoto();
    }
}

package Ejercicio.src;
import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipos> listaEquipos;
    private ArrayList<Partidos>listaPartidos;

    public Campeonato(ArrayList<Equipos> listaEquipos, ArrayList<Partidos>listaPartidos){
        this.listaEquipos=listaEquipos;
        this.listaPartidos=listaPartidos;
    }
    public ArrayList<Equipos> getListaEquipos() {
        return listaEquipos;
    }
    public void setListaEquipos(ArrayList<Equipos> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }
    public ArrayList<Partidos> getListaPartidos() {
        return listaPartidos;
    }
    public void setListaPartidos(ArrayList<Partidos> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
    public void agregarEquipo(Equipos equipoNuevo){
        boolean tieneCap=false;
        boolean repetido=false;
        for(Jugador jugador: equipoNuevo.getJugadores()){
            if(jugador.getEsCapitan()==true){
                tieneCap=true;
            }
        }
        for(int i=0; i <=listaEquipos.size();i++){
            for(int j=i++; j<=listaEquipos.size()-1; j++){
                if(listaEquipos.get(i)==listaEquipos.get(j)){
                    repetido=true;
                }
            }
        }
        if(tieneCap==true){
            System.out.println("No se puede agregar el equipo debido a que no tiene capitán");
        }else if(repetido==true){
            System.out.println("El equipo ya está agregado");
        }else{
            listaEquipos.add(equipoNuevo);
        }
    }

    public void agregarPartido(){
        for(int i=0; i<=listaEquipos.size(); i++) {
            for (int j = i++; j <= listaEquipos.size()-1; j++) {
                Partidos p1 = new Partidos(listaEquipos.get(i), listaEquipos.get(j));
                boolean posible = p1.validarPartido(listaEquipos.get(i), listaEquipos.get(j));
                if (posible == true) {
                    listaPartidos.add(p1);
                }
            }
        }
    }

    public void imprimirFixture(){
        for(Partidos partido: listaPartidos){
            System.out.println(partido.getEquipo1() + " vs " + partido.getEquipo2() + " día " + partido.getDia() + " horario" + partido.getHorario());
        }
    }
}

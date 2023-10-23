package Ejercicio.src;
public class Partidos {
    private String dia;
    private String horario;
    private Equipos equipo1;
    private Equipos equipo2;

    public Partidos(Equipos equipo1, Equipos equipo2){
        this.equipo1=equipo1;
        this.equipo2=equipo2;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Equipos getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipos equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipos getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(Equipos equipo2) {
        this.equipo2 = equipo2;
    }

    public boolean validarPartido(Equipos e1, Equipos e2){
        boolean sePuede=false;
        boolean igualTurno=false;
        boolean coincidenDia=false;
        int nDia=0;
        if(e1.getTurno().equals(e2.getTurno())){
            igualTurno=true;
            for(int i=0; i<=e1.getDispoDias().size();i++){
                if(e1.getDispoDias().get(i).equals(e2.getDispoDias().get(i))){
                    coincidenDia=true;
                    if(coincidenDia==true){
                        nDia=i;
                    }
                }
            }
        }
        if(igualTurno==true && coincidenDia==true){
            sePuede=true;
            this.horario=e1.getTurno();
            switch (nDia){
                case 0:
                    this.dia="lunes";
                    break;
                case 1:
                    this.dia="martes";
                    break;
                case 2:
                    this.dia="miercoles";
                    break;
                case 3:
                    this.dia="jueves";
                    break;
                case 4:
                    this.dia="viernes";
                default:
                    this.dia="sabado";
            }

        }
        return sePuede;
    }
}


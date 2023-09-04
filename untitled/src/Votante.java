public class Votante extends Persona{
    private boolean yaVoto;
    private static String nacionalidad="argentina";
    private Provincia nombreProvincia;

    public Votante(String nombre, String apellido, Fecha nacimiento, int dni, Provincia nombreProvincia, boolean yaVoto) {
        super(nombre, apellido, nacimiento, dni);
        this.yaVoto=yaVoto;
        this.nombreProvincia=nombreProvincia;
    }

    public boolean isYaVoto() {
        return yaVoto;
    }

    public void setYaVoto(boolean yaVoto) {
        this.yaVoto = yaVoto;
    }

    public Provincia getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(Provincia nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public void emitirVoto(Candidato cantidatoAVotar){
        if(!yaVoto){
            cantidatoAVotar.sumarVoto(nombreProvincia);
            setYaVoto(true);
        }
    }

}

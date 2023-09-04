import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Candidato extends Persona{
    private HashMap<Provincia,Integer>votosProvincia;
    private PartidosPoliticos nombrepartido;
    private HashMap<ListaPropuestas, HashSet<String>>propuestas;

    public HashMap<Provincia, Integer> getVotosProvincia() {
        return votosProvincia;
    }

    public void setVotosProvincia(HashMap<Provincia, Integer> votosProvincia) {
        this.votosProvincia = votosProvincia;
    }

    public PartidosPoliticos getNombrepartido() {
        return nombrepartido;
    }

    public void setNombrepartido(PartidosPoliticos nombrepartido) {
        this.nombrepartido = nombrepartido;
    }

    public HashMap<ListaPropuestas, HashSet<String>> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(HashMap<ListaPropuestas, HashSet<String>> propuestas) {
        this.propuestas = propuestas;
    }

    public Candidato(String nombre, String apellido, Fecha nacimiento, int dni) {
        super(nombre, apellido, nacimiento, dni);
    }
    public int contarVotos(){
        int cantidadVotos=0;
        for(Map.Entry<Provincia,Integer>entrada : votosProvincia.entrySet()){
            cantidadVotos=cantidadVotos + entrada.getValue();
        }
        return cantidadVotos;
    }
    public void sumarVoto(Provincia nombreProvincia){
        for(Map.Entry<Provincia,Integer>entrada: votosProvincia.entrySet()){
            if(entrada.getKey().equals(nombreProvincia)){
                entrada.setValue(entrada.getValue()+1);
            }
        }
    }
}

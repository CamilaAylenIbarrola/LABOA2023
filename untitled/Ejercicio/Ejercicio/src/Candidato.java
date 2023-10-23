package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Candidato extends Persona{
    private NombrePartido partido;
    private HashMap<TemaPropuesta, HashSet<String>>listaPropuestas;
    private HashMap<NombreProvincia, Integer> cantVotos;
    public Candidato(String nombre, String apellido, int dni, LocalDate fechaNac, NombrePartido partido, HashMap<TemaPropuesta, HashSet<String>>listaPropuestas, HashMap<NombreProvincia, Integer>cantVotos){
        super(nombre, apellido, dni, fechaNac);
        this.partido=partido;
        this.listaPropuestas=listaPropuestas;
        this.cantVotos=cantVotos;
    }
    public NombrePartido getPartido() {
        return partido;
    }
    public void setPartido(NombrePartido partido) {
        this.partido = partido;
    }

    public HashMap<TemaPropuesta, HashSet<String>> getListaPropuestas() {
        return listaPropuestas;
    }

    public void setListaPropuestas(HashMap<TemaPropuesta, HashSet<String>> listaPropuestas) {
        this.listaPropuestas = listaPropuestas;
    }
    public HashMap<NombreProvincia, Integer> getCantVotos() {
        return cantVotos;
    }
    public void setCantVotos(HashMap<NombreProvincia, Integer> cantVotos) {
        this.cantVotos = cantVotos;
    }
    public void sumarVoto(NombreProvincia provincia){
        if(this.cantVotos.containsKey(provincia)){
            for(Map.Entry<NombreProvincia, Integer>entrada: this.cantVotos.entrySet()) {
                if (entrada.getKey().equals(provincia)) {
                    entrada.setValue(entrada.getValue() + 1);
                }
            }
        }else{
                this.cantVotos.put(provincia, 1);
            }
    }
    public int contarVotos(){
        int cantVotos=0;
        for(Map.Entry<NombreProvincia, Integer>entrada: this.cantVotos.entrySet()){
            cantVotos=cantVotos + entrada.getValue();
        }
        return cantVotos;
    }
}

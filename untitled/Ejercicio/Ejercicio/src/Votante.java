package Ejercicio.src;

import java.time.LocalDate;

public class Votante extends Persona{
    private static String nacionalidad= "Argentina";
    private boolean yaVoto;
    private NombreProvincia provincia;
    public Votante(String nombre, String apellido, int dni, LocalDate nacimiento, boolean yaVoto, NombreProvincia prov){
        super(nombre, apellido, dni, nacimiento);
        this.yaVoto=yaVoto;
        this.provincia=prov;
    }
    public static String getNacionalidad() {
        return nacionalidad;
    }
    public static void setNacionalidad(String nacionalidad) {
        Votante.nacionalidad = nacionalidad;
    }
    public boolean isYaVoto() {
        return yaVoto;
    }
    public void setYaVoto(boolean yaVoto) {
        this.yaVoto = yaVoto;
    }
    public void emitirVoto(Candidato candidato){
        if(!(isYaVoto())){
            candidato.sumarVoto(provincia);
            setYaVoto(true);
            System.out.println("Se registro el voto");
        }else{
            System.out.println("No podes votar mas de una vez");
        }
    }

}

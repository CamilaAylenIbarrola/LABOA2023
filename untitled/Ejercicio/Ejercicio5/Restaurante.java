package Ejercicio5;

import java.util.HashSet;

public class Restaurante implements MetodosMenu{
    private String nombreres;
    private HashSet<Plato>platos;
    private HashSet<Chef>chefs;

    public Restaurante(String nombreres, HashSet<Plato> platos, HashSet<Chef> chefs) {
        this.nombreres = nombreres;
        this.platos = platos;
        this.chefs = chefs;
    }

    public HashSet<Plato> getPlatos() {
        return platos;
    }
    public void setPlatos(HashSet<Plato> platos) {
        this.platos = platos;
    }
    public HashSet<Chef> getChefs() {
        return chefs;
    }
    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }
    public String getNombreres() {
        return nombreres;
    }
    public void setNombreres(String nombreres) {
        this.nombreres = nombreres;
    }

    public void verificacionPlato(Plato plato) throws PlatoExistente, ChefExistenteEnPlato {
        if(platos.contains(plato)){
            throw new PlatoExistente("el plato ya existe en el menu");
        }else if(!chefs.contains(plato.getChefAcargo())){
            throw new ChefExistenteEnPlato("el chef del plato no existe en el restaurante");
        }
    }

    @Override
    public void contratarChef(Chef chef){
        try{
            chef.verificacion();
            chefs.add(chef);
            System.out.println("El chef " + chef.getNombre() + "se unio al equipo de " + nombreres);
        } catch (ExperienciaPreviaException | MenorDeEdadException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void agregarPlato(Plato plato){
        try{
            verificacionPlato(plato);
            platos.add(plato);
            System.out.println("El plato " + plato.getNombre() + "se agrego al menu de " + nombreres);
        } catch (PlatoExistente | ChefExistenteEnPlato e) {
            System.out.println(e.getMessage());
        }
    }
}

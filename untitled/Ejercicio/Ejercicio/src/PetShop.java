package Ejercicio.src;

import java.util.HashSet;

public class PetShop {
    private HashSet<Animal>listaAnimales;

    public PetShop(HashSet<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    public void agregarAnimal(String nombre, Dueno dueno, TipoMascota tipo){

        if(tipo.getNombre().equals("Perro")){
            Perro nuevo= new Perro(nombre, dueno);
            listaAnimales.add((Animal) nuevo);
        }else if(tipo.getNombre().equals("Pajarito")){
            Pajarito nuevo= new Pajarito(nombre, dueno);
            listaAnimales.add((Animal) nuevo);
        }else if(tipo.getNombre().equals("Gato")){
            Gato nuevo= new Gato(nombre, dueno);
            listaAnimales.add((Animal) nuevo);
        }else if(tipo.getNombre().equals("Pez")){
            Pez nuevo= new Pez(nombre, dueno);
            listaAnimales.add((Animal) nuevo);
        }

    }
    public void modificarAnimal(Animal viejo, Animal nuevo){
        listaAnimales.remove(viejo);
        listaAnimales.add(nuevo);
    }
    public void eliminarAnimal(Animal eliminar){
        listaAnimales.remove(eliminar);
    }
    public void saludar(String nombre, Dueno dueno){
        for(Animal mascota : listaAnimales){
            if(mascota.getNombre().equals(nombre)){
                if(mascota.getDueno().equals(dueno)){
                    if(mascota instanceof Pez){
                        ((Pez)mascota).restarVidas();
                            int cantidadVidas=((Pez)mascota).getVidasActuales();
                        if(cantidadVidas==0){
                            listaAnimales.remove(mascota);
                        }
                    } 
                    if(!(mascota instanceof Pez)){
                            mascota.saludar(true); 
                    }
                }else{
                    if(mascota instanceof Pez){
                        listaAnimales.remove(mascota);
                    }else{
                        mascota.saludar(false); 
                    }
                }
            }
        }
    }

}

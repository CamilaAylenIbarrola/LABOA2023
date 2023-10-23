package Ejercicio.src;

import java.util.HashSet;

public class Familia {
    private HashSet<IntegranteFamilia>listaIntegrantes;
    public Familia(HashSet<IntegranteFamilia>listaIntegrantes){
        this.listaIntegrantes=listaIntegrantes;
    }
    public HashSet<IntegranteFamilia> getListaIntegrantes() {
        return listaIntegrantes;
    }
    public void setListaIntegrantes(HashSet<IntegranteFamilia> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }
    public void agregarIntegrante(IntegranteFamilia familiarNuevo){
        listaIntegrantes.add(familiarNuevo);
    }
    public void promedioCaloriasFamilia(){
        double suma=0;
        for(IntegranteFamilia familiar: listaIntegrantes){
            suma=suma + familiar.caloriasConsumidas();
        }
        double promedio= suma/listaIntegrantes.size();
        System.out.println("Promedio de calorias por familia: " + promedio);
    }
    public void masConsumoCalorias(){
        double mayorCalorias=0;
        IntegranteFamilia familiarMasConsumo=new IntegranteFamilia();
        for(IntegranteFamilia familiar:listaIntegrantes){
            if(familiar.caloriasConsumidas()>mayorCalorias){
                mayorCalorias=familiar.caloriasConsumidas();
                familiarMasConsumo=familiar;
            }
        }
        System.out.println("La persona que más calorias consumió fue: " + familiarMasConsumo.getNombre());
    }

    public void menorConsumoCalorias(){
        double menorCalorias=-1;
        IntegranteFamilia familiarMasConsumo= new IntegranteFamilia();
        for(IntegranteFamilia familiar:listaIntegrantes){
            if(menorCalorias==-1){
                menorCalorias= familiar.caloriasConsumidas();
                familiarMasConsumo=familiar;
            } else if(familiar.caloriasConsumidas()<menorCalorias){
                menorCalorias=familiar.caloriasConsumidas();
                familiarMasConsumo=familiar;
            }
        }
        System.out.println("La persona que menos calorias consumió fue: " + familiarMasConsumo.getNombre());
    }
}

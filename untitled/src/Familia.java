import java.util.HashSet;
public class Familia {
    private HashSet<IntegranteFlia>listaIntegrantes;
    public Familia(HashSet<IntegranteFlia>listaIntegrantes){
        this.listaIntegrantes=listaIntegrantes;
    }
    public HashSet<IntegranteFlia> getListaIntegrantes() {
        return listaIntegrantes;
    }
    public void setListaIntegrantes(HashSet<IntegranteFlia> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }
    public void agregarIntegrante(IntegranteFlia familiarNuevo){
        listaIntegrantes.add(familiarNuevo);
    }
    public void promedioCaloriasFamilia(){
        double suma=0;
        for(IntegranteFlia familiar: listaIntegrantes){
            suma=suma + familiar.caloriasConsumidas();
        }
        double promedio= suma/listaIntegrantes.size();
        System.out.println("Promedio de calorias por familia: " + promedio);
    }
    public void masConsumoCalorias(){
        double mayorCalorias=0;
        IntegranteFlia familiarMasConsumo=new IntegranteFlia();
        for(IntegranteFlia familiar:listaIntegrantes){
            if(familiar.caloriasConsumidas()>mayorCalorias){
                mayorCalorias=familiar.caloriasConsumidas();
                familiarMasConsumo=familiar;
            }
        }
        System.out.println("La persona que más calorias consumió fue: " + familiarMasConsumo.getNombre());
    }

    public void menorConsumoCalorias(){
        double menorCalorias=-1;
        IntegranteFlia familiarMasConsumo= new IntegranteFlia();
        for(IntegranteFlia familiar:listaIntegrantes){
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

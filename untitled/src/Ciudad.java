import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio> listaBarrios;
    public Ciudad(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas,HashSet<Barrio>listaBarrios) {
        super(nombre, codigo, listaCoordenadas);
        this.listaBarrios=listaBarrios;
    }
    public HashSet<Barrio> getListaBarrios() {
        return listaBarrios;
    }

    public void setListaBarrios(HashSet<Barrio> listaBarrios) {
        this.listaBarrios = listaBarrios;
    }
    @Override
    public int calcularPoblacion(){
        int sumaPoblacion=0;
        for(Barrio barrio:listaBarrios){
            sumaPoblacion=sumaPoblacion + barrio.getPoblacion();
        }
        return sumaPoblacion;
    }
}

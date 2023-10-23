package Ejercicio.src;

import java.util.HashSet;

public class Provincia extends Lugar{
    private HashSet<Ciudad>listaCiudades;

    public Provincia(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas, HashSet<Ciudad>listaCiudades) {
        super(nombre, codigo, listaCoordenadas);
        this.listaCiudades=listaCiudades;
    }
    public HashSet<Ciudad> getListaCiudades() {
        return listaCiudades;
    }
    public void setListaCiudades(HashSet<Ciudad> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }
    @Override
    public int calcularPoblacion(){
        int sumaPoblacion=0;
        for(Ciudad ciudad:listaCiudades){
            sumaPoblacion=sumaPoblacion + ciudad.calcularPoblacion();
        }
        return sumaPoblacion;
    }
}

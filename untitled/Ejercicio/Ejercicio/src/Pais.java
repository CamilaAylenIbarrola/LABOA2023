package Ejercicio.src;

import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<Provincia>listaProvincias;
    public Pais(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas, HashSet<Provincia>listaProvincias) {
        super(nombre, codigo, listaCoordenadas);
        this.listaProvincias=listaProvincias;
    }
    public HashSet<Provincia> getListaProvincias() {
        return listaProvincias;
    }
    public void setListaProvincias(HashSet<Provincia> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }
    @Override
    public int calcularPoblacion(){
        int sumaPoblacion= 0;
        for(Provincia provincia: listaProvincias){
            sumaPoblacion= sumaPoblacion + provincia.calcularPoblacion();

        }
        return sumaPoblacion;
    }
}

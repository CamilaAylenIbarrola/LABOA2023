package Ejercicio.src;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais>listaPaises;

    public Continente(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas, HashSet<Pais>listaPaises) {
        super(nombre, codigo, listaCoordenadas);
        this.listaPaises=listaPaises;
    }
    public HashSet<Pais> getListaPaises() {
        return listaPaises;
    }
    public void setListaPaises(HashSet<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }
    @Override
    public int calcularPoblacion(){
        int sumaPoblacion=0;
        for(Pais pais:listaPaises){
            sumaPoblacion=sumaPoblacion + pais.calcularPoblacion();
        }
        return sumaPoblacion;
    }
}

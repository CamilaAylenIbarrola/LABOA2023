package Ejercicio.src;

import java.util.ArrayList;

public class sensorComplejo{
    private ArrayList<Elemento>listaElementos;
    private double valorUmbral;

    public sensorComplejo(ArrayList<Elemento>listaElementos){
        this.listaElementos=listaElementos;
    }

    public ArrayList<Elemento> getListaElementos() {
        return listaElementos;
    }
    public void setListaElementos(ArrayList<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }
    public void agregarElemento(Elemento elementoNuevo){
        listaElementos.add(elementoNuevo);
    }
    public void eliminarElemento(Elemento elementoEliminar){
        listaElementos.remove(elementoEliminar);
    }
    public double calcularValorMedio(ArrayList<Elemento>listaElementos){
        double valorMedio=0;
        for(Elemento elemento: listaElementos){
            valorMedio= valorMedio + elemento.getValorActual();
        }
        valorMedio= valorMedio/listaElementos.size();
        return valorMedio;
    }
    public void verificar(ArrayList<Elemento>listaElementos){
        if(calcularValorMedio(listaElementos)> valorUmbral){
            alarma();
        }
    }
    public void alarma(){
        System.out.println("Alarma de sensor complejo activada");
    }

}

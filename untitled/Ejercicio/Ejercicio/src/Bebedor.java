package Ejercicio.src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bebedor extends Persona{
    private HashMap<Bebida, Integer> bebidasConsumidas;
    public Bebedor(){
    }

    public Bebedor(String nombre, String apellido, int dni, HashMap<Bebida, Integer> bebidasConsumidas) {
        super(nombre, dni, apellido);
        this.bebidasConsumidas = bebidasConsumidas;
    }
    public HashMap<Bebida, Integer> getBebidasConsumidas() {
        return bebidasConsumidas;
    }
    public void setBebidasConsumidas(HashMap<Bebida, Integer> bebidasConsumidas) {
        this.bebidasConsumidas = bebidasConsumidas;
    }
    public void tomar(Bebida bebida, int cantidad){
        try {
            if (bebidasConsumidas.containsValue(bebida)) {
                for (Map.Entry<Bebida, Integer> entrada : bebidasConsumidas.entrySet()) {
                    if (entrada.equals(bebida)){
                        if(bebida.getStock()-cantidad>=0) {
                            entrada.setValue(entrada.getValue() + cantidad);
                            bebida.setStock(bebida.getStock()-cantidad);
                            System.out.println("tomaste");
                        }else{
                            throw new NullPointerException("Stock nulo");
                        }
                    }
                }
            } else {
                if(bebida.getStock()-cantidad>=0) {
                    bebidasConsumidas.put(bebida, cantidad);
                    bebida.setStock(bebida.getStock()-cantidad);
                    System.out.println("tomaste");
                }else{
                    throw new NullPointerException("Stock nulo");
                }
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public double coeficienteHidratacion(){
        double coeficiente=0;
        for(Map.Entry<Bebida, Integer>entrada:bebidasConsumidas.entrySet()){
            coeficiente= coeficiente + (entrada.getValue() * (entrada.getKey().getCoefPositividad() - entrada.getKey().getCoefNegatividad()));
        }
        return coeficiente;
    }
}

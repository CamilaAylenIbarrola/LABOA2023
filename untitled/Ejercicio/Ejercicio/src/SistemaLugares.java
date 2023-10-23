package Ejercicio.src;

import java.util.HashSet;

public class SistemaLugares {
    private HashSet<Lugar>listaLugares;
    public SistemaLugares(HashSet<Lugar>listaLugares){
        this.listaLugares=listaLugares;
    }
    public void agregarLugar(Lugar lugarNuevo) {
        listaLugares.add(lugarNuevo);
    }
    public void eliminarLugar(Lugar lugarEliminar){
        listaLugares.remove(lugarEliminar);
    }
    public void modificarLugar(Lugar modificar, Lugar modificado){
        listaLugares.remove(modificar);
        listaLugares.add(modificado);
    }
    public void pantallaInformativa(){
        int paisMasPoblacion=0;
        int paisMenorPoblacion=-1;
        String nombrePaisMayor="";
        String nombrePaisMenor="";
        int continenteMayorPoblacion=0;
        int continenteMenorPoblacion=0;
        String nombreContinenteMayor="";
        String nombreContinenteMenor="";
        for(Lugar lugar: listaLugares){
            if(lugar instanceof Pais && lugar.calcularPoblacion()>paisMasPoblacion){
                    nombrePaisMayor= lugar.getNombre();
                    paisMasPoblacion=lugar.calcularPoblacion();
                }else if(paisMenorPoblacion==-1){
                    nombrePaisMenor= lugar.getNombre();;
                    paisMenorPoblacion= lugar.calcularPoblacion();
                }else if(lugar.calcularPoblacion()<paisMenorPoblacion){
                    nombrePaisMenor= lugar.getNombre();;
                    paisMenorPoblacion= lugar.calcularPoblacion();
                }

            if(lugar instanceof Continente && lugar.calcularPoblacion()>continenteMayorPoblacion){
                    nombreContinenteMayor= lugar.getNombre();
                    continenteMayorPoblacion=lugar.calcularPoblacion();
                }else if(continenteMenorPoblacion==-1){
                    nombreContinenteMenor= lugar.getNombre();;
                    continenteMenorPoblacion= lugar.calcularPoblacion();
                }else if(lugar.calcularPoblacion()<continenteMenorPoblacion){
                    nombreContinenteMenor= lugar.getNombre();
                    paisMenorPoblacion= lugar.calcularPoblacion();
                }
            }
        System.out.println("El pais con mas poblacion es: " + nombrePaisMayor);
        System.out.println("El pais con menor poblacion es: " + nombrePaisMenor);
        System.out.println("El continente con mayor poblacion es: " + nombreContinenteMayor);
        System.out.println("El continente con menos poblacion es: " + nombreContinenteMenor);
    }
    public int consultarPoblacionCodigo(int codigo){
        int cant=0;
        for(Lugar lugar: listaLugares){
            if(lugar.getCodigo()==codigo){
                cant= lugar.calcularPoblacion();
            }
        }
        return cant;
    }
}


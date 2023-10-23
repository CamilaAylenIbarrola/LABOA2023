package Ejercicio.src;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaCine {
    private HashSet<Espectador>listaUsuarios;
    private HashSet<FuncionCine>listaFunciones;

    public SistemaCine(HashSet<Espectador> listaUsuarios, HashSet<FuncionCine> listaFunciones) {
        this.listaUsuarios = listaUsuarios;
        this.listaFunciones = listaFunciones;
    }

    public HashSet<Espectador> getListaUsuarios() {
        return listaUsuarios;
    }
    public void setListaUsuarios(HashSet<Espectador> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public HashSet<FuncionCine> getListaFunciones() {
        return listaFunciones;
    }
    public void setListaFunciones(HashSet<FuncionCine> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }
    public void cantUsuariosAlta(){
        System.out.println(Espectador.getContador());
    }
    public void peliculasCreadas(){
        System.out.println(Pelicula.getContador());
    }
    public void agregarFuncion(Pelicula peli, LocalDateTime fechaHora, SalaCine sala, int cantEntradas){
        FuncionCine funcionNueva= new FuncionCine(peli, fechaHora, sala, cantEntradas);
        listaFunciones.add(funcionNueva);
    }
    public void funcionesDispo(){
        for(FuncionCine funcion: listaFunciones){
            LocalDateTime ahora= LocalDateTime.now();
            if(funcion.getEntradasVendidas()< 45 && funcion.getFechaHora().isAfter(ahora)){
                System.out.println("Pelicula: " + funcion.getPelicula().getTitulo());
                System.out.println("Fecha y Hora " + funcion.getFechaHora().getDayOfMonth() +funcion.getFechaHora().getDayOfWeek() + funcion.getFechaHora().getMonth());
            }
        }
    }
    public void peliMasVista(){
        HashMap<String, Integer>listaPelis= new HashMap<String, Integer>();
        for(FuncionCine funcion: listaFunciones){
            if(listaPelis.containsKey(funcion.getPelicula().getTitulo())){
                for(Map.Entry<String, Integer>entrada:listaPelis.entrySet()){
                    if(entrada.getKey().equals(funcion.getPelicula().getTitulo())){
                        entrada.setValue(entrada.getValue()+funcion.getEntradasVendidas());
                    }
                }
            }else{
                listaPelis.put(funcion.getPelicula().getTitulo(), funcion.getEntradasVendidas());
            }
        }

        int mayorVistas=0;
        String peli="";
        for(Map.Entry<String, Integer>entrada: listaPelis.entrySet()){
            if(entrada.getValue()>mayorVistas){
                mayorVistas=entrada.getValue();
                peli=entrada.getKey();
            }
        }
        System.out.println(peli);
    }
    public void usuarioMenosCompro(){
        int menorEntradas=-1;
        Espectador espectador= null;
        for(Espectador espectadorActual: listaUsuarios){
            if(espectador == null || espectadorActual.getPelisVistas().size()<menorEntradas){
                menorEntradas=espectadorActual.getPelisVistas().size();
                espectador=espectadorActual;
            }
        }
        System.out.println("El usuario que menos compró es: " + espectador.getNombre() + espectador.getApellido() + "Id " + espectador.getIdentificador());
    }
}

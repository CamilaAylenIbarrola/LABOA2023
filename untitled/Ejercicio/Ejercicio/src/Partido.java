package Ejercicio.src;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private HashSet<Mensajeria> enviadoresMensajes;
    private int cantAfiliados;

    public Partido(String nombre, String direccion, HashSet<Mensajeria> enviadoresMensajes, int cantAfiliados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.enviadoresMensajes = enviadoresMensajes;
        this.cantAfiliados = cantAfiliados;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public HashSet<Mensajeria> getEnviadoresMensajes() {
        return enviadoresMensajes;
    }
    public void setEnviadoresMensajes(HashSet<Mensajeria> enviadoresMensajes) {
        this.enviadoresMensajes = enviadoresMensajes;
    }
    public int getCantAfiliados() {
        return cantAfiliados;
    }
    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }
    public void agregarMensajero(Mensajeria mensajero){
        enviadoresMensajes.add(mensajero);
    }
    public void hacerCampania(){
        for(Mensajeria mensajeria:enviadoresMensajes){
            mensajeria.hacerCampania(getNombre());
        }
    }
}

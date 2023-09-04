import java.util.ArrayList;

public class CD {
    ArrayList<Cancion> canciones= new ArrayList<Cancion>();

    public CD() {
        canciones= new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public int numeroCanciones(){
        int cant=canciones.size();
        return cant;
    }
    public Cancion verCancion(int posicion){
        Cancion cancion= canciones.get(posicion);
        return cancion;
    }
    public void grabaCancion(int posicion, Cancion nuevaCancion){
        canciones.set(posicion, nuevaCancion);
    }
    public void agrega(Cancion cancion){
        canciones.add(cancion);
    }
    public void elimina(int posicion){
        canciones.remove(posicion);
    }
}

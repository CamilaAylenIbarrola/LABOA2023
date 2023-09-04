import java.util.HashSet;

public class SistemaMascota {
    private final HashSet<Mascota>Mascotas;

    public SistemaMascota(HashSet<Mascota> mascotas) {
        Mascotas = mascotas;
    }

    public void agregarMascota(String nombre, Dueno dueno, TipoMascota tipo){
        if(tipo.getNombre().equals("perro")){
            Perro nuevoperro= new Perro(nombre, dueno);
            Mascotas.add(nuevoperro);
        }else if(tipo.getNombre().equals("gato")){
            Gato nuevogato= new Gato(nombre, dueno);
            Mascotas.add(nuevogato);
        }else{
            Pajarito nuevopajarito= new Pajarito(nombre, dueno);
            Mascotas.add(nuevopajarito);
        }
    }
    public void eliminarMascota(Mascota mascotaeliminar){
        Mascotas.remove(mascotaeliminar);
    }
    public void modificarmascota(Mascota mascotavieja, Mascota mascotanueva){
        Mascotas.remove(mascotavieja);
        Mascotas.add(mascotanueva);
    }
    public void saludar(String nombre, Dueno dueno){
        for(Mascota mascota : Mascotas){
            if(mascota.getNombre().equals(nombre)){
                if(mascota.getDueno().equals(dueno)){
                    if(mascota instanceof Pez){
                        ((Pez)mascota).restarVidas();
                        int cantidadVidas=((Pez)mascota).getVidasActuales();
                        if(cantidadVidas==0){
                            Mascotas.remove(mascota);
                        }
                    }
                    if(!(mascota instanceof Pez)){
                        mascota.saludar(true);
                    }
                }else{
                    if(mascota instanceof Pez){
                        Mascotas.remove(mascota);
                    }else{
                        mascota.saludar(false);
                    }
                }
            }
        }
    }
}

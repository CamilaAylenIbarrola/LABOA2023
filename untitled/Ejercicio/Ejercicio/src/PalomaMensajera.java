package Ejercicio.src;

public class PalomaMensajera extends Ave implements Mensajeria{
    private boolean sabeMapa;
    public PalomaMensajera(String color, String nombre, String especie, boolean sabeMapa) {
        super(color, nombre, especie);
        this.sabeMapa=sabeMapa;
    }

    @Override
    public void hacerCampania(String nombre) {
        if (sabeMapa) {
            System.out.println("Lanzando un papelito que dice: Vote por" + nombre +" para un mejor futuro");
        }else{
            System.out.println("No el mapa");
        }
    }
}

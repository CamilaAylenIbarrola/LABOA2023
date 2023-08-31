import java.util.ArrayList;

public class Main{
    public static void main(String[]args){

        ArrayList<String>hola123=new ArrayList<String>();
        hola123.add("maria");
        hola123.add("abril");
        hola123.add("pedro");
        hola123.add("anna");
        hola123.add("rocio");
        hola123.add("lola");
        for(String nombreActual : hola123){
            if(nombreActual.charAt(0) == 'a'){
                System.out.println(nombreActual);
            }
        }
        ArrayList<Cancion>pepe=new ArrayList<Cancion>();
        pepe.add(new Cancion("pepito", new Persona("mono")));
        pepe.add(new Cancion("messi", new Persona("pepe")));
        pepe.add(new Cancion());
        Cancion nombrecancion=new Cancion();
        CD teresa= new CD(pepe);
        teresa.grabaCancion(0,nombrecancion);
        for(Cancion cancionactual : teresa.getCanciones()){
            System.out.println(cancionactual.getNombre());
        }
    }
}
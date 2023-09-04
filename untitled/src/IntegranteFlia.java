import java.util.ArrayList;

public class IntegranteFlia extends Persona{
    private ArrayList<Plato> listaPlatos;
    public IntegranteFlia(String nombre, Fecha fechaNacimiento, ArrayList<Plato>listaPlatos){
        super(nombre,fechaNacimiento);
        this.listaPlatos=listaPlatos;
    }
    public IntegranteFlia(){

    }
    public ArrayList<Plato>getListaPlatos() {
        return listaPlatos;
    }
    public void setListaPlatos(ArrayList<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }
    public void agregarPlato(Plato platoNuevo){
        listaPlatos.add(platoNuevo);
    }
    public double caloriasConsumidas(){
        double calorias=0;
        for(Plato plato:listaPlatos){
            calorias= calorias + plato.getCalorias();
        }
        return calorias;
    }
}

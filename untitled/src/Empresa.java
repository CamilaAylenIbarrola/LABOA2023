import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo>listaVehiculos;
    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    public void mayorCantV(){
        int cantAutos=0;
        int cantCamionetas=0;
        int cantBicis=0;
        for(Vehiculo vehiculo: listaVehiculos){
            if(vehiculo.getClass().getCanonicalName().equals("Camioneta")){
                cantCamionetas++;
            }else if(vehiculo.getClass().getCanonicalName().equals("Coche")){
                cantAutos++;
            }else{
                cantBicis++;
            }
        }
        if(cantAutos>cantCamionetas && cantAutos>cantBicis){
            System.out.println("Hay más autos");
        }else if(cantCamionetas>cantBicis && cantCamionetas>cantAutos){
            System.out.println("Hay más camionetas");
        }else{
            System.out.println("Hay más bicicletas");
        }
    }
    public int porcDescapotables(){
        int cantTotal=0;
        int cantDescapotables=0;
        for(Vehiculo vehiculo: listaVehiculos){
            if(vehiculo.getClass().getCanonicalName().equals("Coche")){
                cantTotal++;
                boolean esDEscapotable=((Coche) vehiculo).getDescapotable();
                if(esDEscapotable){
                    cantDescapotables++;
                }
            }
        }
        int porc= (cantDescapotables*100)/cantTotal;
        return porc;
    }
}

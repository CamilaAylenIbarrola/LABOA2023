

public class Cafetera {
    private int cantidadmax;
    private int cantidadactual;

    public Cafetera() {
        cantidadmax=1000;
        cantidadactual=0;
    }

    public Cafetera(int cantidadmax, int cantidadactual) {
        this.cantidadmax = cantidadmax;
        this.cantidadactual = cantidadactual;
        if(cantidadactual>cantidadmax){
            this.cantidadactual=cantidadmax;
        }
    }

    public Cafetera(int cantidadmax){
        this.cantidadmax = cantidadmax;
        cantidadactual=cantidadmax;
    }

    public void llenarCafetera(){
        cantidadactual=cantidadmax;
    }

    public void servirTaza(int capacidad){
        if(cantidadactual>capacidad){
            cantidadactual=cantidadactual - capacidad;
        } else if(cantidadactual<=capacidad){
            cantidadactual=0;
        }
    }

    public void vaciarCafetera(){
        cantidadactual=0;
    }

    public void agregarCafe(int cantidad){
        if(cantidadactual==cantidadmax){
        } else{
            cantidadactual=cantidadactual + cantidad;
        }
    }

}

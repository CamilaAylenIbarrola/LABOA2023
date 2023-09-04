public class Cafetera {
    private float cantMax;
    private float cantActual;
    public Cafetera(){
        this.cantMax=1000;
        this.cantActual=0;
    }
    public Cafetera(float cantMax){
        this.cantMax= cantMax;
        this.cantActual=cantMax;
    }
    public Cafetera(float cantMax, float cantActual){
        if(cantActual> cantMax) {
            this.cantMax = cantActual;
        }else{
            this.cantMax=cantMax;
            this.cantActual=cantActual;
        }
    }
    public float getCantMax() {
        return cantMax;
    }
    public void setCantMax(float cantMax) {
        this.cantMax = cantMax;
    }
    public float getCantActual() {
        return cantActual;
    }
    public void setCantActual(float cantActual) {
        this.cantActual = cantActual;
    }
    public void llenarCafetera(){
        this.cantActual= this.cantMax;
    }
    public void servirTaza(int capacidad){
        if(capacidad>cantActual){
            this.cantActual=0;
        }else{
            this.cantActual= cantActual - capacidad;
        }
    }
    public void vaciarCafetera(){
        this.cantActual= 0;
    }
    public void agregarCafe(int cantidad) {
        float disponibilidad = this.cantMax - this.cantActual;
        if (disponibilidad >= cantidad) {
            this.cantActual = this.cantActual + cantidad;
        } else {
            this.cantActual = this.cantMax;
        }
    }
}

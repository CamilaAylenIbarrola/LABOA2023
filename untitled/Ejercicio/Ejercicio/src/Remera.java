package Ejercicio.src;

public class Remera extends Ropa{
    private int espalda;
    private int contorno;
    private int largoTorso;
    public Remera(String color, String marca, MaterialRopa material, String estado,  int espalda, int contorno, int largoTorso) {
        super(color, marca, material, estado);
        this.espalda=espalda;
        this.contorno=contorno;
        this.largoTorso=largoTorso;
    }
    public int getEspalda() {
        return espalda;
    }
    public void setEspalda(int espalda) {
        this.espalda = espalda;
    }
    public int getContorno() {
        return contorno;
    }
    public void setContorno(int contorno) {
        this.contorno = contorno;
    }
    public int getLargoTorso() {
        return largoTorso;
    }
    public void setLargoTorso(int largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public String toString() {
        String atributos= "Color " + getColor() + " Marca " + getMarca() + " Material " + getMaterial() + " Estado " + getEstado() + " Medida espalda " + getEspalda() + " Medida Torso " + getLargoTorso() + " Medida contorno " + getContorno();
        return atributos;
    }
    @Override
    public boolean prestar() {
            if (this.getEstado() == null) {
                System.out.println("La remera se dará prestada");
                return true;

            } else {
                System.out.println("La remera no se prestará");
                return false;
            }
    }
    @Override
    public boolean agregarElemento() {
        if(prestar() == true){
            System.out.println("El articulo puede ingresar al circuito de préstamos");
            return true;
        }else{
            System.out.println("El artículo ingresado no podrá ingresar a nuestro sistema");
            return false;
        }
    }
}

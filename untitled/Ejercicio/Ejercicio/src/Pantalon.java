package Ejercicio.src;

public class Pantalon extends Ropa {
    private int medidaCintura;
    private int largo;
    private int medidaCadera;

    public Pantalon(String color, String marca, MaterialRopa material, String estado, int medidaCintura, int largo, int medidaCadera) {
        super(color, marca, material, estado);
        this.medidaCadera=medidaCadera;
        this.largo=largo;
        this.medidaCintura=medidaCintura;
    }
    public int getMedidaCintura() {
        return medidaCintura;
    }
    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public int getMedidaCadera() {
        return medidaCadera;
    }
    public void setMedidaCadera(int medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    @Override
    public String toString() {
        String atributos= "Color " + getColor() + " Marca " + getMarca() + " Material " + getMaterial() + " Estado " + getEstado() + " Medida Cintura " + getMedidaCintura() + " Medida largo " + getLargo() + " Medida cadera " + getMedidaCadera();
        return atributos;
    }
    @Override
    public boolean prestar() {
            if (this.getEstado() == null) {
                System.out.println("El pantalón no se prestará");
                return false;
            } else {
                System.out.println("El pantalón se dará prestado");
                return true;
            }
    }

    @Override
    public boolean agregarElemento(){
        if(prestar()){
            System.out.println("El artículo puede ingresar al circuito de préstamos");
            return true;
        }else{
            System.out.println("El artículo ingresado no podrá ingresar a nuestro sistema");
            return false;
        }
    }
}

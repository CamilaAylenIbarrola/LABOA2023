

public class Main{
    public static void main(String[]args){
        Circulo pepe=new Circulo(3);
        System.out.println(pepe.calcularPerimetro());
        System.out.println(pepe.calcularArea());

        Rectangulo pedro=new Rectangulo(3,5);
        System.out.println(pedro.calcularPerimetro());
        System.out.println(pedro.calcularArea());
    }
}
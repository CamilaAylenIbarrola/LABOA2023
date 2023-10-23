package SimulacionPrueba;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1=new Cuadrado(11);
        Rectangulo rectangulo1=new Rectangulo(0,8);
        Triangulo triangulo1=new Triangulo(4,8);
        Circulo circulo1=new Circulo(6);

        System.out.println(cuadrado1.calcularArea());
        System.out.println(rectangulo1.calcularArea());

    }
}

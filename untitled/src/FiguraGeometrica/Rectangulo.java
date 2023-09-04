package FiguraGeometrica;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        double area;
        area=base*altura;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro=2*base+2*altura;
        return perimetro;
    }

}

package FiguraGeometrica;

public class Circulo {
    private double radio;

    public Circulo(double radio1) {
        radio = radio1;
    }

    public Circulo() {
        radio=2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro=2*Math.PI * radio;
        return perimetro;
    }
}

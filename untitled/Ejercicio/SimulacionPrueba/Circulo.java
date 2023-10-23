package SimulacionPrueba;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        try{
            if(radio==0) {
                throw new CeroException("no se puede calcular el area del circulo ya que un dato es 0");
            }else{
                this.radio = radio;
            }
        }
        catch (CeroException e){
            System.out.println(e.getMessage());
        }
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area;
        area=Math.PI*(radio*radio);
        return area;
    }
}

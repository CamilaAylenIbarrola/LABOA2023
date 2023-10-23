package SimulacionPrueba;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        try{
            if(base==0 || altura==0) {
                throw new CeroException("no se puede calcular el area del rectangulo ya que un dato es 0");
            }else{
                this.base = base;
                this.altura = altura;
            }
        }
        catch (CeroException e){
            System.out.println(e.getMessage());
        }
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

    @Override
    public double calcularArea() {
        double area;
        area=base*altura;
        return area;
    }
}

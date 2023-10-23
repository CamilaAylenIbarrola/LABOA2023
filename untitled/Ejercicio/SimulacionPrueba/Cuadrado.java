package SimulacionPrueba;

public class Cuadrado extends FiguraGeometrica {
    private double lados;

    public Cuadrado(double lados) {
        try{
            if(lados==0) {
                throw new CeroException("no se puede calcular el area del cuadrado ya que un dato es 0");
            }else{
                this.lados=lados;
            }
        }
        catch (CeroException e){
            System.out.println(e.getMessage());
        }
    }

    public double getLados() {
        return lados;
    }
    public void setLados(double lados) {
        this.lados = lados;
    }

    @Override
    public double calcularArea() {
        double area;
        area=lados*lados;
        return area;
    }
}

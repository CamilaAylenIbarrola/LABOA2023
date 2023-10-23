package Ejercicio.src;

public abstract class Elemento {
    private boolean estado;
    private double valorActual;
    private double valorUmbral;
    private int año;
    public Elemento( boolean estado, double valorActual,double valorUmbral,int año ){
        this.estado=estado;
        this.valorUmbral=valorUmbral;
        this.valorActual=valorActual;
        this.año=año;

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public double getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void verificar(){
        if(estado==true && valorActual>valorUmbral){
            alarma();
        }
    }
    public void alarma(){
        System.out.println("alarma");
    }
}

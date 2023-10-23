package Ejercicio.src;

public class Tarjeta extends MetodoPago{
    private int nro;
    private String banco;
    private boolean credito;
    private boolean debito;
    public Tarjeta (int nro, String banco, boolean credito, boolean debito){
        this.nro=nro;
        this.banco=banco;
        this.credito=credito;
        this.debito=debito;
    }

    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public boolean isCredito() {
        return credito;
    }
    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    public boolean isDebito() {
        return debito;
    }
    public void setDebito(boolean debito) {
        this.debito = debito;
    }
}

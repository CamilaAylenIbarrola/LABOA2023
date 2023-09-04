public abstract class CuentaBancaria {
    private Cliente cliente;
    private int cbu;
    private int nroCuenta;
    private String alias;
    private double saldo;
    public CuentaBancaria(Cliente cliente, int cbu, int nroCuenta, String alias, double saldo){
        this.cliente=cliente;
        this.cbu=cbu;
        this.nroCuenta=nroCuenta;
        this.alias=alias;
        this.saldo=saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getCbu() {
        return cbu;
    }
    public void setCbu(int cbu) {
        this.cbu = cbu;
    }
    public int getNroCuenta() {
        return nroCuenta;
    }
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositarDinero(double cantidad){
        this.saldo=this.saldo+cantidad;
    }
    public void retirarDinero(double cantidad){
        this.saldo=this.saldo-cantidad;
    }
}

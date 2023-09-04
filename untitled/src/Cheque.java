public class Cheque {
    private Cliente clienteOrigen;
    private Cliente clienteDestino;
    private double monto;
    public Cheque(Cliente clienteOrigen, Cliente clienteDestino, double monto){
        this.clienteOrigen=clienteOrigen;
        this.clienteDestino=clienteDestino;
        this.monto=monto;
    }

    public Cliente getClienteOrigen() {
        return clienteOrigen;
    }
    public void setClienteOrigen(Cliente clienteOrigen) {
        this.clienteOrigen = clienteOrigen;
    }
    public Cliente getClienteDestino() {
        return clienteDestino;
    }
    public void setClienteDestino(Cliente clienteDestino) {
        this.clienteDestino = clienteDestino;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
}

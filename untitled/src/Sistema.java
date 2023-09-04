import java.util.ArrayList;

public class Sistema {
    private ArrayList<Compra> listaComputadoras;
    private ArrayList<Componente> listaCompras;

    public ArrayList<Compra> getListaComputadoras() {
        return listaComputadoras;
    }
    public void setListaComponentes(ArrayList<Compra> listaComputadoras) {
        this.listaComputadoras = listaComputadoras;
    }
    public ArrayList<Componente> getListaCompras() {
        return listaCompras;
    }
    public void setListaCompras(ArrayList<Componente> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public void realizarCompra(Persona cliente, MetodoPago pago, ArrayList<Componente> listaComponentes, int precioFinal){
        Compra compra1=new Compra(cliente, pago, listaComponentes, precioFinal);
        listaComputadoras.add(compra1);
    }
    public void agregarComponente(Componente componenteNuevo){
        listaCompras.add(componenteNuevo);
    }
    public void eliminarComponente(Componente componenteEliminar){
        listaCompras.remove(componenteEliminar);
    }
    public void modificarComponente(Componente componenteViejo, Componente componenteModificado){
        listaCompras.remove(componenteViejo);
        listaCompras.add(componenteModificado);
    }

}
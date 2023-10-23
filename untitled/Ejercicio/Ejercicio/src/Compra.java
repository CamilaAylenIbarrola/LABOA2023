package Ejercicio.src;

import java.util.ArrayList;

public class Compra{
    private Persona cliente;
    private MetodoPago pago;
    private ArrayList<Componente> listaComponentes;
    private double precioFinal;
    public Compra(Persona cliente, MetodoPago pago, ArrayList<Componente> listaComponentes, double precioFinal){
        boolean validado= validarCompra(listaComponentes);
        if(validado==true){
            this.cliente=cliente;
            this.pago=pago;
            for(Componente componente: listaComponentes){
                boolean hayStock= verificarStock(componente);
                if(hayStock==false){
                    listaComponentes.remove(componente);
                    System.out.println("No hay stock de " + componente.getNombre() + " por lo tanto, se eliminó de la lista");
                }
                componente.setStock(componente.getStock()-1);
                precioFinal=calcularPrecioFinal(listaComponentes, pago);
            }
        }else{
            System.out.println("No se cumplen los requisitos para realizar la compra");
        }
    }
    public Persona getCliente() {
        return cliente;
    }
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Componente> getListaComponentes() {
        return listaComponentes;
    }
    public void setListaComponentes(ArrayList<Componente> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }
    public MetodoPago getPago() {
        return pago;
    }
    public void setPago(MetodoPago pago) {
        this.pago = pago;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }
    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }
    public boolean validarCompra(ArrayList<Componente> listaComponentes){
        boolean cpu=false;
        boolean dispEntrada=false;
        boolean dispSalida=false;
        boolean validado=false;
        for(Componente componente: listaComponentes){
            if(componente instanceof CPU){
                cpu=true;
            }
            if(componente instanceof DispSalida){
                dispSalida=true;
            }
            if(componente instanceof DispEntrada){
                dispEntrada=true;
            }
        }
        if(cpu==true && dispEntrada==true && dispSalida==true){
            validado=true;
        }
        return validado;
    }
    public boolean verificarStock(Componente componente){
        boolean verificado=false;
        if(componente.getStock()!=0){
            verificado=true;
        }
        return verificado;
    }
    public double calcularPrecioFinal(ArrayList<Componente> listaComponentes, MetodoPago pago){
        double total=0;
        for(Componente componente:listaComponentes){
            total= total + componente.getPrecio();
        }
        if(pago instanceof Tarjeta){
            total= total - (total*5)/100;
        }
        return total;
    }
    public int cantDispSalida(ArrayList<Componente> listaComponentes){
        int cantSalida= 0;
        for(Componente componente:listaComponentes){
            if(componente instanceof DispSalida){
                cantSalida++;
            }
        }
        return cantSalida;
    }
    public int cantDispEntrada(ArrayList<Componente> listaComponentes){
        int cantEntrada= 0;
        for(Componente componente:listaComponentes){
            if(componente instanceof DispEntrada){
                cantEntrada++;
            }
        }
        return cantEntrada;
    }

}

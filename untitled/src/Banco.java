import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<CuentaBancaria>listaCuentas;
    public Banco(ArrayList<Cliente> listaClientes,  ArrayList<CuentaBancaria>listaCuentas){
        this.listaClientes= listaClientes;
        this.listaCuentas=listaCuentas;
    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public ArrayList<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }
    public void setListaCuentas(ArrayList<CuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    public void eliminarCliente(Cliente cliente){
        listaClientes.remove(cliente);
    }
    public void agregarCuenta(CuentaBancaria cuenta){
        listaCuentas.add(cuenta);
    }
    public void eliminarrCuenta(CuentaBancaria cuenta){
        listaCuentas.remove(cuenta);
    }
    public int devolverCBU(int cuil){
        int cbu=0;
        for(CuentaBancaria cuenta:listaCuentas){
            if(cuenta.getCliente().getCuil()== cuil){
                cbu=cuenta.getCbu();
            }
        }
        return cbu;
    }
    public String nombreApellido(int nroCuenta){
        String nombre="";
        for(CuentaBancaria cuenta:listaCuentas){
            if(cuenta.getNroCuenta() == nroCuenta){
                nombre = cuenta.getCliente().getNombre() + cuenta.getCliente().getApellido();
            }
        }
        return nombre;
    }

    public void clienteMasJoven(){
        int edad=0;
        String nombreCliente="";
        for(Cliente cliente: listaClientes){
            if(cliente.getEdad()<edad){
                edad=cliente.getEdad();
                nombreCliente=cliente.getNombre() + " " + cliente.getApellido();
            }
        }
        System.out.println(nombreCliente);
    }

    public void mayorCheques(){
        int cantidad=0;
        int aux=0;
        int cbu=0;
        for(CuentaBancaria cuenta: listaCuentas){
            if(cuenta instanceof CuentaCorriente){
                aux=((CuentaCorriente) cuenta).getListaCheques().size();
                if(aux>cantidad){
                    cantidad=aux;
                    cbu=cuenta.getCbu();
                }
            }
        }
        System.out.println(cbu);
    }
}

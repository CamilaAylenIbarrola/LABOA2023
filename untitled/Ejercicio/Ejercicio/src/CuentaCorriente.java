package Ejercicio.src;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{
    private ArrayList<Cheque> listaCheques;
    public CuentaCorriente(Cliente cliente, int cbu, int nroCuenta, String alias, double saldo, ArrayList<Cheque> listaCheques){
        super(cliente, cbu, nroCuenta, alias,saldo);
        this.listaCheques=listaCheques;
    }
    public ArrayList<Cheque> getListaCheques() {
        return listaCheques;
    }
    public void setListaCheques(ArrayList<Cheque> listaCheques) {
        this.listaCheques = listaCheques;
    }
    public void agregarCheque(Cheque cheque){
        listaCheques.add(cheque);
    }
    public void eliminarCheque(Cheque cheque){
        listaCheques.remove(cheque);
    }
}

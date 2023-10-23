package Ejercicio.src;

public class DispositivoMovil extends Dispositivo implements Mensajeria{
    private  CompaniaTelefonica compania;
    private int nroTelefono;
    private boolean estadoPrendido;
    private int credito;
    public DispositivoMovil(int nroSerie, String fabricante, String modelo, CompaniaTelefonica compania, int nroTelefono, boolean estado, int credito) {
        super(nroSerie, fabricante, modelo);
        this.compania=compania;
        this.nroTelefono=nroTelefono;
        this.compania=compania;
        this.nroTelefono=nroTelefono;
        this.estadoPrendido=estado;
        this.credito=credito;
    }

    @Override
    public void hacerCampania(String nombre) {
        if(credito>=20 && estadoPrendido==true) {
            System.out.println("Conectando con la antena más cercana");
            System.out.println("Vote por" + nombre + " para un mejor futuro");
            credito=credito-20;
        }else{
            System.out.println("No tengo credito/dispositivo prendido");
        }
    }
}

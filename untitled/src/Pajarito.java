public class Pajarito extends Mascota{
    private boolean esCantor;
    private String tipoCanto;

    public Pajarito(String nombre, Dueno dueno) {
        super(nombre, dueno);
    }


    @Override
    void saludar(boolean esDueno) {
        if(esDueno==true){
            for(int i=0;i<getAlegriaActual();i++){
                System.out.println("guau");
            }
        }
    }

    @Override
    void alimentar() {
        setAlegriaActual(getAlegria()+1);
    }
    @Override
    void tipoMascota() {
        System.out.println("pajarito");
    }
}

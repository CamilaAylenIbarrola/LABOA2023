public class Gato extends Mascota{


    public Gato(String nombre, Dueno dueno) {
        super(nombre, dueno);
    }

    @Override
    void saludar(boolean esDueno) {
        if(esDueno==true){
            for(int i=0;i<getAlegriaActual();i++){
                System.out.println("guau");
            }
        }else{
            System.out.println("MIAU!");
        }
    }

    @Override
    void alimentar() {
        setAlegriaActual(getAlegria()+1);
    }

    @Override
    void tipoMascota() {
        System.out.println("gato");
    }
}

public class Perro extends Mascota{

    public Perro(String nombre, Dueno dueno) {
        super(nombre, dueno);
    }

    @Override
    void saludar(boolean esDueno) {
        if(esDueno==true){
            for(int i=0;i<getAlegriaActual();i++){
                System.out.println("guau");
            }
            if(getAlegriaActual()>1){
                setAlegriaActual(getAlegriaActual()-1);
            }
        }else{
            System.out.println("GUAU!");
        }
    }

    @Override
    void alimentar() {
        setAlegriaActual(getAlegria()+1);
    }
    @Override
    void tipoMascota() {
        System.out.println("perro");
    }
}

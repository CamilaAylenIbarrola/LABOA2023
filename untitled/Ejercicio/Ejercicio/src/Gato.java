package Ejercicio.src;

public class Gato extends Animal{
    public Gato(String nombre, Dueno dueno) {
        super(nombre, dueno);
    }
    @Override
    void saludar(boolean esDueno) {
        if(esDueno == true) {
            for(int i=0; i< getAlegria(); i++) {
                System.out.println("miau");
            }
            setAlegria(getAlegria()-1);
        }else{
            System.out.println("MIAU!");
        }
    }

    @Override
    void alimentar() {
        setAlegria(getAlegriaInicial() + 1);

    }

    @Override
    void tipoMascota() {
        System.out.printf("Soy un gato");
    }
}

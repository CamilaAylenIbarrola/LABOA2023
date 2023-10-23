package Ejercicio.src;

public class Perro extends Animal{
    public Perro(String nombre, Dueno dueno) {
        super(nombre, dueno);
    }
    @Override
    void saludar(boolean esDueno) {
        if(esDueno == true) {
            for(int i=0; i<getAlegria(); i++) {
                System.out.println("Guau");
            }
            if(getAlegria()<1){
                setAlegria(getAlegria()-1);
            }
        }else{
            System.out.println("GUAU!");
        }
    }

    @Override
    void alimentar() {
        setAlegria(getAlegriaInicial() + 1);
    }

    @Override
    void tipoMascota() {
        System.out.printf("Soy un perro");
    }
}

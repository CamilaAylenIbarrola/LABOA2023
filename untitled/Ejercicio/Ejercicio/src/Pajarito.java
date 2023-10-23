package Ejercicio.src;

public class Pajarito extends Animal{
    private boolean esCantor;
    private String tipo;

    public Pajarito(String nombre, Dueno dueno, boolean esCantor, String tipo) {
        super(nombre, dueno);
        this.esCantor = esCantor;
        this.tipo = tipo;
    }

    public Pajarito(String nombre, Dueno dueno) {
        super(nombre, dueno);
    }

    @Override
    void saludar(boolean esDueno) {
        if(esDueno == true) {
            for(int i=0; i < getAlegria(); i++){
                System.out.println("pio");
            }
            if(getAlegria()>1){
                setAlegria(getAlegria()-1);
            }
        }
    }

    @Override
    void alimentar() {
        setAlegria(getAlegriaInicial() + 1);
    }

    @Override
    void tipoMascota() {
        System.out.printf("Soy un Pajarito");
    }
}

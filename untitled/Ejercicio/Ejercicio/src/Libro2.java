package Ejercicio.src;

import java.util.HashMap;

public class Libro2 extends Texto{
    private HashMap<Integer, Integer>capitulosPags;
    public Libro2(int codigo, int anioPublicacion, String titulo, HashMap<Integer, Integer>capitulosPags) {
        super(codigo, anioPublicacion, titulo);
        this.capitulosPags=capitulosPags;
    }
    public HashMap<Integer, Integer> getCapitulosPags() {
        return capitulosPags;
    }
    public void setCapitulosPags(HashMap<Integer, Integer> capitulosPags) {
        this.capitulosPags = capitulosPags;
    }

    @Override
    public String toString() {
        String atributos= "Codigo " + getCodigo() + " Publicacion " + getAnioPublicacion() + " Titulo " + getTitulo() + " Paginas " + getCapitulosPags();
        return atributos;
    }
    @Override
    public boolean prestar(){
            if(this.getCapitulosPags().size() % 2 == 1){
                System.out.println("El libro se derá prestado");
                return true;
            }else{
                System.out.println("El libro no se prestará");
                return false;
            }
    }
    @Override
    public boolean agregarElemento() {
        if(prestar()){
            System.out.println("El circuito puede ingresar al circuito de préstamos");
            return true;
        }else{
            System.out.println("El artículo ingresado no podrá ingresar a nuestro sistema");
            return false;
        }
    }
}

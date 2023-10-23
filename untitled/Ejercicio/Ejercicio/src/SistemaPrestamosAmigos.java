package Ejercicio.src;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaPrestamosAmigos {
    private HashSet<Prestable>listaObjetos;
    public SistemaPrestamosAmigos(HashSet<Prestable>listaObjetos){
        this.listaObjetos=listaObjetos;
    }
    public HashSet<Prestable> getListaObjetos() {
        return listaObjetos;
    }
    public void setListaObjetos(HashSet<Prestable> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
    public void agregar(Prestable objeto){
        if(objeto.agregarElemento()){
            listaObjetos.add(objeto);
        }
    }
    public void prestar(Prestable objeto){
        if(listaObjetos.contains(objeto)) {
            if (objeto.prestar()) {
                listaObjetos.remove(objeto);
            }
        }else{
            System.out.println("Ya fue prestada a otra persona");
        }
    }

}

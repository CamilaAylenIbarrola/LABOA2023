package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashSet;

public class MainPrestamos {
    public static void main(String[] args) {
        Revista revista1= new Revista(1, 2022, "Gente", LocalDate.of(2022, 9, 5));
        Remera remera1= new Remera("Rojo", "Nike", MaterialRopa.ALGODON, null, 28, 30, 40);
        HashSet<Prestable>listaObjetos= new HashSet<>();
        listaObjetos.add(revista1);
        listaObjetos.add(remera1);
        SistemaPrestamosAmigos sistema= new SistemaPrestamosAmigos(listaObjetos);

        sistema.prestar(remera1);
        sistema.prestar(remera1);
        remera1.setEstado("rota");
        sistema.agregar(remera1);

        System.out.println("-------------------------------------------");
        sistema.prestar(revista1);
        sistema.agregar(revista1);


    }
}

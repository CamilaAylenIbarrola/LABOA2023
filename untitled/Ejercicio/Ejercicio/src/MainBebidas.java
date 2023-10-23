package Ejercicio.src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Handler;

public class MainBebidas {
    public static void main(String[] args) {
        HashSet<Bebida>listaBebidas= new HashSet<>();
        BebidaAzucarada azucarada1=new BebidaAzucarada("Coca Cola", 5, 100);
        listaBebidas.add(azucarada1);
        BebidaNeutra neutra1=new BebidaNeutra("Agua", 20, 25, 50);
        listaBebidas.add(neutra1);
        HashSet<Bebedor>listaBebedores=new HashSet<>();
        SistemaBebidas sistema= new SistemaBebidas(listaBebedores, listaBebidas);
        sistema.mejorPeorCoeficiente();

        Bebedor b1= new Bebedor("Hernan", "Casas", 46321459, new HashMap<Bebida, Integer>());
        Bebedor b2= new Bebedor("Pia", "Dominguez", 46985321, new HashMap<Bebida, Integer>());
        sistema.agregarPersona(b1);
        sistema.agregarPersona(b2);
        sistema.agregarPersona(b1);
        b1.tomar(azucarada1, 100);
        b1.tomar(azucarada1, 2);
    }

}

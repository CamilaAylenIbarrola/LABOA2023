package Ejercicio5;
import java.util.HashSet;

public class MainRestaurante {
    public static void main(String[] args) {

        Chef c1 = new Chef("cami", true, 20);
        Chef c2 = new Chef("julieta", false, 20);
        Chef c3 = new Chef("lola", true, 16);
        Chef c4 = new Chef("anna", false, 14);
        Plato p1 = new Plato("ñoquis", "aa", TipoPlato.ENTRADA, 100, c1);
        Plato p2 = new Plato("ñoquis", "aa", TipoPlato.ENTRADA, 100, c1);
        Plato p3 = new Plato("carne", "ac", TipoPlato.ENTRADA, 100, c3);

        Restaurante r1 = new Restaurante("elrestaurante", new HashSet<Plato>(), new HashSet<Chef>());

        r1.contratarChef(c1);
        r1.contratarChef(c2);
        r1.contratarChef(c3);
        r1.contratarChef(c4);

        r1.agregarPlato(p1);
        r1.agregarPlato(p1);
        r1.agregarPlato(p3);
    }
}
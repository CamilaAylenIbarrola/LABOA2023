import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        System.out.println("Ingrese una letra");
        Scanner entrada= new Scanner(System.in);
        char letra= entrada.next().charAt(0);
        String texto= "Ayer me compre muñecos de la marca ‘Colchitas’ por internet";
        texto= texto.replace('e', letra);
        System.out.println(texto);
    }
}

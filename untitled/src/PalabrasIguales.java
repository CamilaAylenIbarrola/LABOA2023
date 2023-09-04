import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        System.out.println("Ingrese palabra");
        Scanner entrada= new Scanner(System.in);
        String palabra1= entrada.nextLine();
        System.out.println("Ingrese palabra");
        String palabra2= entrada.nextLine();

        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }

}
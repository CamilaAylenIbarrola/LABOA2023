import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese número");
        int nro1= entrada.nextInt();
        System.out.println("Ingrese número");
        int nro2= entrada.nextInt();

        if(nro1>nro2){
            System.out.println("El primer número es mayor");
        }else if(nro2>nro1){
            System.out.println("El segundo número es mayor");
        }else{
            System.out.println("Son iguales");
        }
    }
}

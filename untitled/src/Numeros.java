import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int nro=0;
        String lista="";
        int contador=0;
        Scanner entrada = new Scanner(System.in);

        while(nro != -1) {
            System.out.println("Ingrese número");
            nro = entrada.nextInt();
            if(nro != -1){
                lista= lista + " " + nro;
                contador++;
            }
        }
        System.out.println("Se ingresaron estos números " + lista);
        System.out.println("En total son " + contador);


    }
}
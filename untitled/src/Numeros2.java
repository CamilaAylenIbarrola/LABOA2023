import java.util.Scanner;
public class Numeros2 {
    public static void main(String[] args) {
        int nro=0;
        int contador=1;
        Scanner entrada = new Scanner(System.in);
        nro = entrada.nextInt();
        String lista= Integer.toString(nro);
        int nromayor=nro;
        int nromenor=nro;
        int sumatotal=nro;
        int sumapos=0;
        int sumaneg=0;
        if(nro>0){
            sumapos=sumapos + nro;
        }else{
            sumaneg=sumaneg + nro;
        }

        while(nro != -1) {
            System.out.println("Ingrese número");
            nro = entrada.nextInt();
            if(nro != -1){
                sumatotal=sumatotal + nro;
                lista= lista + " " + nro;
                contador++;
                if(nro>nromayor){
                    nromayor= nro;
                }
                if(nro<nromenor){
                    nromenor=nro;
                }
                if(nro>0){
                    sumapos=sumapos + nro;
                }else{
                    sumaneg=sumaneg + nro;
                }
            }
        }
        System.out.println("Se ingresaron estos números " + lista);
        System.out.println("En total son " + contador);
        System.out.println("El número menor es " + nromenor);
        System.out.println("El número mayor es " + nromayor);
        System.out.println("La suma de todos los números es " + sumatotal);
        System.out.println("La suma de todos los números positivos es  " + sumapos);
        System.out.println("La suma de todos los números negativos es " + sumaneg);



    }
}

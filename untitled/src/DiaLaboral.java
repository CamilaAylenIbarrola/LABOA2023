import java.util.Scanner;
public class DiaLaboral {
    public static void main(String[] args) {
        System.out.println("Ingrese dia de la semana ");
        Scanner entrada= new Scanner(System.in);
        String dia= entrada.nextLine();

        switch (dia){
            case "lunes":
                System.out.println("Día laboral");
                break;
            case "martes":
                System.out.println("Día laboral");
                break;
            case "miercoles":
                System.out.println("Día laboral");
                break;
            case "jueves":
                System.out.println("Día laboral");
                break;
            case "viernes":
                System.out.println("Día laboral");
                break;
            default:
                System.out.println("No es día laboral");

        }

    }
}

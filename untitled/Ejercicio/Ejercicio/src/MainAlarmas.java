package Ejercicio.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAlarmas {
    public static void main(String[] args) {
        ArrayList<Elemento> sensores=new ArrayList<>();
        SensorHumo s1=new SensorHumo(true, 100, 200, 2023);
        SensorHumo s2=new SensorHumo(false, 150, 200, 2022);
        SensorHumo s3=new SensorHumo(true, 190, 200, 2023);
        sensores.add(s1);
        sensores.add(s2);
        sensores.add(s3);

        System.out.println("Ingrese numero entero del 0 al " + sensores.size());
        Scanner entrada= new Scanner(System.in);

        try{
            Integer nroSensor= entrada.nextInt();
            String nro= nroSensor.toString();
            if(!nro.contains(",")){
                if(nroSensor<sensores.size()) {
                    System.out.println("V actual " + sensores.get(nroSensor).getValorActual() + " Umbral" + sensores.get(nroSensor).getValorUmbral() + " Año" + sensores.get(nroSensor).getAño());
                }else {
                    throw new NullPointerException("No existe esa cantidad de sensores para mostrarte la info del sensor que buscas");
                }
            }else{
                throw new InputMismatchException("No se pueden ingresar numeros decimales");
            }
        }catch (NullPointerException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}

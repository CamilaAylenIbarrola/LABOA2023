package Ejercicio.src;

public enum Dia {
    LUNES("Lunes"), MARTES("Martes"), MIERCOLES("Miercoles"), JUEVES("Jueves"), VIERNES("Viernes"), SABADO("Sabado"), DOMINGO("Domingo");
    private String nombreDia;
    private Dia(String nombreDia){
        this.nombreDia=nombreDia;
    }

    public String getNombreDia() {
        return nombreDia;
    }
}

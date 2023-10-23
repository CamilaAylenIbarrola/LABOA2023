package Ejercicio.src;

public enum DiasHabiles {
    LUNES("Lunes"), MARTES("Martes"), MIERCOLES("Miercoles"), JUEVES("Jueves"), VIERNES("Viernes");
    private String nombreDia;
    private DiasHabiles(String nombreDia){
        this.nombreDia=nombreDia;
    }

    public String getNombreDia() {
        return nombreDia;
    }
}

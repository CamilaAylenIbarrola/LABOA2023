package Ejercicio.src;

import java.time.LocalDate;

public class ExamenOral extends Examen{

    private NivelSatisfaccion nivel;

    public ExamenOral(String materia, LocalDate fechaRealizacion, NivelSatisfaccion nivel) {
        super(materia, fechaRealizacion);
        this.nivel=nivel;
    }

    @Override
    boolean aprobar() {
        if(NivelSatisfaccion.INSUFICIENTE==nivel){
            return false;
        }else{
            return true;
        }
    }
}

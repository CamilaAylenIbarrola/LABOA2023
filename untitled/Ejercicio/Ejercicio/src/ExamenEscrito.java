package Ejercicio.src;

import java.time.LocalDate;
import java.util.Map;

public class ExamenEscrito extends Examen {
    private static int duracion = 90;
    private int notaNumerica;

    public ExamenEscrito(String materia, LocalDate fechaRealizacion, int notaNumerica) {
        super(materia, fechaRealizacion);
        this.notaNumerica = notaNumerica;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNotaNumerica() {
        return notaNumerica;
    }

    public void setNotaNumerica(int notaNumerica) {
        this.notaNumerica = notaNumerica;
    }

    @Override
    boolean aprobar() {
        if (duracion < 90 && notaNumerica > 6) {
            return true;
        } else {
            return false;
        }
    }
}

import java.time.LocalDateTime;

public class Llamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private LocalDateTime fecha;
    private Tiempo duracion;

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDateTime fecha, Tiempo duracion){
        this.empleadoOrigen=empleadoOrigen;
        this.empleadoDestino=empleadoDestino;
        this.fecha= fecha;
        this.duracion=duracion;
    }
    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }
    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }
    public Empleado getEmpleadoDestino() {
        return empleadoDestino;
    }
    public void setEmpleadoDestino(Empleado empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Tiempo getDuracion() {
        return duracion;
    }
    public void setDuracion(Tiempo duracion) {
        this.duracion = duracion;
    }
}

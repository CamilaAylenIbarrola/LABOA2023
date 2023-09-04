import java.time.LocalDateTime;

public class Funcion {
    private Pelicula peli;
    private LocalDateTime fechaYhora;
    private SalaCine sala;
    private int cantEntradas;

    public Funcion(Pelicula peli, LocalDateTime fechaYhora, SalaCine sala, int cantEntradas) {
        this.peli = peli;
        this.fechaYhora = fechaYhora;
        this.sala = sala;
        this.cantEntradas = cantEntradas;
    }
    public Funcion(Pelicula peli, LocalDateTime fechaYhora, SalaCine sala) {
        this.peli = peli;
        this.fechaYhora = fechaYhora;
        this.sala = sala;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public int getCantEntradas() {
        return cantEntradas;
    }

    public void setCantEntradas(int cantEntradas) {
        this.cantEntradas = cantEntradas;
    }
}

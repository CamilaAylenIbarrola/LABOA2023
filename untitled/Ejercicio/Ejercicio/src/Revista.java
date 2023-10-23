package Ejercicio.src;

import java.time.LocalDate;

public class Revista extends Texto{
    private LocalDate fechaPublicacion;
    public Revista(int codigo, int anioPublicacion, String titulo, LocalDate fechaPublicacion) {
        super(codigo, anioPublicacion, titulo);
        this.fechaPublicacion=fechaPublicacion;
    }
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    @Override
    public String toString() {
        String atributos= "Codigo " + getCodigo() + " Publicacion " + getAnioPublicacion() + " Titulo " + getTitulo() + " Paginas " + getFechaPublicacion();
        return atributos;
    }
    @Override
    public boolean prestar() {
            LocalDate hoy = LocalDate.now();
            if (hoy.getYear() != this.fechaPublicacion.getYear()) {
                System.out.println("La revista se dará prestada");
                return true;
            } else if ((hoy.getMonthValue() - this.fechaPublicacion.getMonthValue()) > 3) {
                System.out.println("La revista se dará prestada");
                return true;
            } else {
                System.out.println("La revista no se prestará");
                return false;
            }
    }
    @Override
    public boolean agregarElemento(){
        if(prestar()){
            System.out.println("El artículo puede ingresar al circuito de préstamos");
            return true;
        }else{
            System.out.println("El artículo ingresado no podrá ingresar a nuestro sistema");
           return false;
        }
    }
}

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaCine {
    private HashSet<Espectador>altaUsuarios;
    private HashSet<Funcion>funciones;

    public SistemaCine(HashSet<Espectador> altaUsuarios, HashSet<Funcion> funciones) {
        this.altaUsuarios = altaUsuarios;
        this.funciones = funciones;
    }

    public HashSet<Espectador> getAltaUsuarios() {
        return altaUsuarios;
    }

    public void setAltaUsuarios(HashSet<Espectador> altaUsuarios) {
        this.altaUsuarios = altaUsuarios;
    }

    public HashSet<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashSet<Funcion> funciones) {
        this.funciones = funciones;
    }

    public void agregarFuncion(Pelicula nombrePeli, LocalDateTime fechaYhora, SalaCine sala){
        Funcion nuevaFuncion=new Funcion(nombrePeli,fechaYhora,sala);
        funciones.add(nuevaFuncion);
    }
    public void funcionesDipo(){
        for(Funcion posicion : funciones){
            LocalDateTime ahora=LocalDateTime.now();
            if(posicion.getCantEntradas()<45 && posicion.getFechaYhora().isAfter(ahora)){
                System.out.println("Pelicula: " + posicion.getPeli());
                System.out.println("Fecha y hora: " + posicion.getFechaYhora() + posicion.getFechaYhora().getDayOfWeek() + posicion.getFechaYhora().getMonth());
            }
        }
    }
    public void PeliMasVista() {
        HashMap<String, Integer> peliculas = new HashMap<String, Integer>();
        for (Funcion posicion : funciones) {
            if (peliculas.containsKey((posicion.getPeli().getTitulo()))) {
                for (Map.Entry<String, Integer> entrada : peliculas.entrySet()) {
                    if (entrada.getKey().equals(posicion.getPeli().getTitulo())) {
                        entrada.setValue(entrada.getValue() + posicion.getCantEntradas());
                    }
                }
            } else {
                peliculas.put(posicion.getPeli().getTitulo(), posicion.getCantEntradas());
            }
        }
        int mayorVistas = 0;
        String peliMasVista = "";
        for (Map.Entry<String, Integer> entrada : peliculas.entrySet()) {
            if (entrada.getValue() > mayorVistas) {
                mayorVistas = entrada.getValue();
                peliMasVista = entrada.getKey();
            }
        }
        System.out.println(peliMasVista);
    }
    public void usuarioMenosCompro(){
        int menorEntradas=-1;
        Espectador menorespectador= new Espectador();
        for(Espectador espectadorActual: altaUsuarios){
            if(espectadorActual.getPelisVistas().size()<menorEntradas){
                menorEntradas=espectadorActual.getPelisVistas().size();
                menorespectador=espectadorActual;
            }
        }
        System.out.println("El usuario que menos compró es: " + menorespectador.getNombre() + menorespectador.getApellido() + "Id " + menorespectador.getIdentificador());
    }
}

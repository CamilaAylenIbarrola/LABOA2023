package Ejercicio.src;

import java.util.HashSet;

public class SistemaBiblioteca {
    private HashSet<Usuario> listaUsuarios;
    private HashSet<LibroElectronico>listaLibros;

    public SistemaBiblioteca(HashSet<Usuario> listaUsuarios, HashSet<LibroElectronico> listaLibros) {
        this.listaUsuarios = listaUsuarios;
        this.listaLibros = listaLibros;
    }

    public HashSet<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(HashSet<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public HashSet<LibroElectronico> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(HashSet<LibroElectronico> listaLibros) {
        this.listaLibros = listaLibros;
    }


    public void prestarLibro(LibroElectronico libro, Usuario usuario) throws LimiteDePrestamosAlcanzadosException, MembresiaException {
        if ((usuario.getMembresia().equals(Membresia.ORO) && usuario.getListaPrestados().size() == 50) || (usuario.getMembresia().equals(Membresia.PLATA) && usuario.getListaPrestados().size() == 14) || (usuario.getMembresia().equals(Membresia.BRONCE) && usuario.getListaPrestados().size() == 5)) {
            throw new MembresiaException("Excediste tus descargas disponibles");
        } else {
            if (libro.getCantDescargasActual() + 1 > LibroElectronico.getCantDescargas()) {
                throw new LimiteDePrestamosAlcanzadosException("No se puede prestar por limite de descargas");
            } else {
                libro.setCantDescargasActual(libro.getCantDescargasActual() + 1);
                usuario.getListaPrestados().add(libro);
                System.out.println("Se realizó el prestamo");
            }
        }
    }
    public void gestionarDevolucion(LibroElectronico libro, Usuario usuario){
        for(LibroElectronico libroElect: listaLibros){
            if(libroElect.equals(libro)){
                libro.setCantDescargasActual(libro.getCantDescargasActual()-1);
                usuario.getListaPrestados().remove(libro);
            }
        }
    }
    public void agregarLibro(LibroElectronico libro){
        listaLibros.add(libro);
    }
    public void modificarLibro(LibroElectronico modificado, LibroElectronico libro){
        listaLibros.remove(libro);
        listaLibros.add(modificado);
    }
    public void eliminarLibro(LibroElectronico libro){
        listaLibros.remove(libro);
    }
}

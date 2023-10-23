package Ejercicio.src;

import java.time.LocalDate;
import java.util.HashSet;

public class BibliotecaVirtualMain {
    public static void main(String[] args) {
        Autor a2= new Autor("Catalina", "Rodriguez", 45236952, "Corrientes 333", LocalDate.of(2002, 5, 15), null);
        Autor a1= new Autor("Pedro", "Perez", 45236953, "Corrientes 444", LocalDate.of(2001, 4, 1), null);
        LibroElectronico l1= new LibroElectronico("Los rojos", a1, "LosRojos.pdf", GeneroLiterario.ACCION, 1);
        LibroElectronico l2= new LibroElectronico("Los azules", a1, "LosAzules.pdf", GeneroLiterario.FICCION, 1);
        HashSet<LibroElectronico> autor1= new HashSet<>();
        autor1.add(l1);
        autor1.add(l2);
        HashSet<LibroElectronico> autor2= new HashSet<>();
        LibroElectronico l3= new LibroElectronico("Buenos Aires II", a2, "BuenosAiresII.pdf", GeneroLiterario.CIENCIAFICCION,0);
        LibroElectronico l4= new LibroElectronico("Corrientes II", a2, "CorrientesII.pdf", GeneroLiterario.NOFICCION,0);
        LibroElectronico l5= new LibroElectronico("La Pampa III", a2, "LaPampaIII.pdf", GeneroLiterario.TRILOGIA,80);
        autor2.add(l3);
        autor2.add(l4);
        autor2.add(l5);
        a1.setBibliografia(autor1);
        a2.setBibliografia(autor2);

        HashSet<LibroElectronico>prestados1= new HashSet<>();
        prestados1.add(l1);
        prestados1.add(l2);
        prestados1.add(l3);
        prestados1.add(l4);
        prestados1.add(l5);
        HashSet<LibroElectronico>prestados2= new HashSet<>();
        prestados1.add(l2);
        Usuario u1= new Usuario("Jose", "Carrera", 22365159, LocalDate.of(1990, 6, 19), "josecarrera@gmailcom", prestados1, Membresia.BRONCE);
        Usuario u2= new Usuario("Tamara", "Paez", 22365155, LocalDate.of(1990, 6, 20), "paeztamara@gmailcom", prestados2,  Membresia.PLATA);
        HashSet<Usuario>listaUsuarios=new HashSet<>();
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
        HashSet<LibroElectronico>libros= new HashSet<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
        libros.add(l4);
        libros.add(l5);

        SistemaBiblioteca sistema= new SistemaBiblioteca(listaUsuarios, libros);
        try {
            sistema.prestarLibro(l4, u1);
            System.out.println(u1.getListaPrestados().size());
        }catch (MembresiaException | LimiteDePrestamosAlcanzadosException e){
            System.out.println(e.getMessage());
        }
        try {
            sistema.prestarLibro(l4, u2);
            System.out.println(u1.getListaPrestados().size());
        }catch (MembresiaException | LimiteDePrestamosAlcanzadosException e){
            System.out.println(e.getMessage());
        }
        try {
            sistema.prestarLibro(l5, u2);
            System.out.println(u1.getListaPrestados().size());
        }catch (MembresiaException | LimiteDePrestamosAlcanzadosException e){
            System.out.println(e.getMessage());
        }
    }
}

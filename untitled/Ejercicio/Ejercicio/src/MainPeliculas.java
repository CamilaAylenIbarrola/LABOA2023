package Ejercicio.src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class MainPeliculas {
    public static void main(String[] args) {
        Pelicula peli1= new Pelicula("Los 3 chiflados", 165, GeneroPelicula.COMEDIA);
        Pelicula peli2= new Pelicula("Caidos del mapa", 105, GeneroPelicula.AVENTURA);
        Pelicula peli3= new Pelicula("Shrek", 120, GeneroPelicula.COMEDIA);

        SalaCine sala1= new SalaCine(1);
        SalaCine sala2= new SalaCine(2);

        FuncionCine f1= new FuncionCine(peli3, LocalDateTime.of(2023,9,2,16,45), sala1, 30);
        FuncionCine f2=new FuncionCine(peli3, LocalDateTime.of(2023,9,6,16,45), sala1, 40);
        FuncionCine f3= new FuncionCine(peli2, LocalDateTime.of(2023,9,5,16,45), sala2, 25);

        HashSet<Pelicula>vistasE1=new HashSet<>();
        vistasE1.add(peli3);
        Espectador e1= new Espectador("Alicia", "Blancos", LocalDate.of(2000, 5, 10), "aliciablancos@gmail.com", vistasE1);

        HashSet<Pelicula>vistasE2=new HashSet<>();
        vistasE2.add(peli1);
        vistasE2.add(peli3);
        Espectador e2= new Espectador("Pedro", "Puentes", LocalDate.of(2000, 5, 19), "pedropuentes@gmail.com", vistasE2);
        HashSet<Espectador>listaEspectadores= new HashSet<>();
        listaEspectadores.add(e1);
        listaEspectadores.add(e2);

        HashSet<FuncionCine>listaFunciones=new HashSet<>();
        listaFunciones.add(f1);
        listaFunciones.add(f2);
        listaFunciones.add(f3);

        SistemaCine cine= new SistemaCine(listaEspectadores, listaFunciones);

        System.out.println("Cantidad de usuarios dados de alta:");
        System.out.println(Espectador.getContador());

        System.out.println("Peliculas creadas");
        System.out.println(Pelicula.getContador());

        System.out.println("Pelis disponibles");
        cine.funcionesDispo();

        System.out.println("Peli mas vista");
        cine.peliMasVista();

        System.out.println("Usuario que menos compro");
        cine.usuarioMenosCompro();



    }
}

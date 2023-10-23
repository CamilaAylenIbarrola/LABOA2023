package Ejercicio.src;

import java.util.ArrayList;
import java.util.Scanner;
public class Buffet {
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Plato> listaPlatos;
    public Buffet(ArrayList<Pedido> listaPedidos, ArrayList<Persona> listaPersonas, ArrayList<Plato> listaPlatos){
        this.listaPedidos=listaPedidos;
        this.listaPersonas=listaPersonas;
        this.listaPlatos= listaPlatos;
    }
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }
    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    public ArrayList<Plato> getListaPlatos() {
        return listaPlatos;
    }
    public void setListaPlatos(ArrayList<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }
    public void agregarPedido(Pedido pedido1){
        listaPedidos.add(pedido1);
    }
    public void agregarAlumno(Alumno alumno1){
        listaPersonas.add(alumno1);
    }
    public void agregarProfesor(Profesores profesor1){
        listaPersonas.add(profesor1);
    }
    public void agregarPlato(){
       Plato nuevoPlato= new Plato();
        System.out.println("Ingrese nombre del plato a agregar");
        Scanner entrada= new Scanner(System.in);
        String nombre= entrada.next();
        nuevoPlato.setNombre(nombre);

        System.out.println("Ingrese precio");
        double precio= entrada.nextInt();
        nuevoPlato.setPrecio(precio);

        listaPlatos.add(nuevoPlato);
    }

    public void modificarPlato(){
        System.out.println("Ingrese nombre del plato");
        Scanner entrada= new Scanner(System.in);
        String nombre= entrada.next();
        System.out.println("¿Desea modificar el nombre? Si es así ingrese si");
        String rta1= entrada.next();
        System.out.println("¿Desea modificar el precio? Si es así ingrese si");
        String rta2= entrada.next();

        for(Plato plato: listaPlatos){
            if(plato.getNombre().equals(nombre)){
                if(rta1.equals("si")){
                    System.out.println("¿Ingrese nuevo nombre");
                    String nombrePlato= entrada.next();
                    plato.setNombre(nombrePlato);
                }
                if(rta2.equals("si")){
                    System.out.println("¿Ingrese nuevo precio");
                    int precio= entrada.nextInt();
                    plato.setPrecio(precio);
                }
            }
        }
    }

    public void eliminarPlato(){
        System.out.println("Ingrese nombre del plato");
        Scanner entrada= new Scanner(System.in);
        String nombre= entrada.next();
        int contador=0;
        for(Plato plato : listaPlatos){
            if(plato.getNombre().equals(nombre)){
                listaPlatos.remove(contador);
            }
            contador++;
        }
    }

    public void agregarPedido(){
        Pedido nuevoPedido= new Pedido();
        System.out.println("Ingrese numero de dia");
        Scanner entrada= new Scanner(System.in);
        int dia= entrada.nextInt();
        System.out.println("Ingrese número de mes");
        int mes= entrada.nextInt();
        System.out.println("Ingrese año");
        int año= entrada.nextInt();
        Fecha fechaP= new Fecha(dia, mes, año);
        nuevoPedido.setFecha(fechaP);
        System.out.println("Ingrese nombre del plato");
        String nombre= entrada.next();
        Plato platoAgregado= new Plato();
        int contador=0;
        for(Plato plato: listaPlatos){
            if(plato.getNombre().equals(nombre)){
                platoAgregado.setNombre(plato.getNombre());
                platoAgregado.setPrecio(plato.getPrecio());
            }
        }
        nuevoPedido.setPlato1(platoAgregado);
        System.out.println("Ingrese nombre de la persona");
        String nombreP= entrada.next();
        System.out.println("Ingrese apellido de la persona");
        String apellidoP= entrada.next();
        Alumno a= new Alumno(nombreP, apellidoP, (String) null);
        nuevoPedido.setPersona1(a);
        System.out.println("¿Fue entregado? Si es así, ingrese 1");
        int rta1= entrada.nextInt();
        if(rta1 == 1){
            nuevoPedido.setEntregado(true);
            System.out.println("Ingrese hora");
            int horas= entrada.nextInt();
            System.out.println("Ingrese minutos");
            int min= entrada.nextInt();
            Tiempo horario= new Tiempo(horas, min);
            nuevoPedido.setHoraEntrega(horario);
        }else{
            nuevoPedido.setEntregado(false);
        }
    }

    public void modificarPedido(Pedido pedido1){
        System.out.println("¿Desea modificar la fecha? Si es así ingrese si");
        Scanner entrada= new Scanner(System.in);
        String rta1= entrada.next();
        System.out.println("¿Desea modificar el plato? Si es así ingrese si");
        String rta2= entrada.next();
        System.out.println("¿Desea modificar la persona? Si es así ingrese si");
        String rta3= entrada.next();
        System.out.println("¿Desea modificar si está entregado? Si es así ingrese si");
        String rta4= entrada.next();
        System.out.println("¿Desea modificar la hora de entrega? Si es así ingrese si");
        String rta5= entrada.next();

        for(Pedido pedido: listaPedidos){
            if(pedido1.getFecha().equals(pedido.getFecha()) && pedido1.getPersona1().getNombre().equals(pedido.getPersona1().getNombre())){
                if(rta1.equals("si")){
                    System.out.println("Ingrese numero de dia");
                    int dia= entrada.nextInt();
                    pedido.getFecha().setDia(dia);
                    System.out.println("Ingrese numero de mes");
                    int mes= entrada.nextInt();
                    pedido.getFecha().setMes(mes);
                    System.out.println("Ingrese numero de año");
                    int año= entrada.nextInt();
                    pedido.getFecha().setAño(año);
                }
                if(rta2.equals("si")){
                    System.out.println("Ingrese el nombre del plato");
                    String nPlato= entrada.next();
                    for(Plato plato: listaPlatos){
                        if(plato.getNombre().equals("nPlato")){
                            pedido.setPlato1(plato);
                        }
                    }
                }
                if(rta3.equals("si")){
                    System.out.println("Ingrese nombre");
                    String nombre=entrada.next();
                    System.out.println("Ingrese apellido");
                    String apellido;
                    apellido= entrada.next();
                    for(Persona persona: listaPersonas){
                        if(persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido)){
                            pedido.setPersona1(persona);
                        }
                    }
                }
                if(rta4.equals("si")){
                    if(pedido.getEntregado() == true){
                        pedido.setEntregado(false);
                    }else{
                        pedido.setEntregado(true);
                    }
                    System.out.println("Se cambió correctamente la hora de entrega");
                }
                if(rta5.equals("si")){
                    System.out.println("Ingrese hora");
                    int hora= entrada.nextInt();
                    pedido.getHoraEntrega().setHora(hora);
                    System.out.println("Ingrese minutos");
                    int min= entrada.nextInt();
                    pedido.getHoraEntrega().setMinutos(min);
                }
            }
        }
    }

    public void eliminarPedido(Pedido pedido1){
        int contador=0;
        for(Pedido pedido: listaPedidos){
            contador++;
            if(pedido.getFecha().equals(pedido1.getFecha()) && pedido.getPersona1().equals(pedido1.getPersona1())){
                listaPedidos.remove(contador);
            }
        }

    }

    public void platosDelDia(){
        System.out.println("Ingrese numero de día actual");
        Scanner entrada= new Scanner(System.in);
        int dia= entrada.nextInt();
        System.out.println("Ingrese numero de mes actual");
        int mes= entrada.nextInt();
        System.out.println("Ingrese número de año actual");
        int año= entrada.nextInt();

        for(Pedido pedido: listaPedidos){
            if(pedido.getFecha().getDia() == dia && pedido.getFecha().getMes() == mes && pedido.getFecha().getAño() == año){
                System.out.println(pedido.getPlato1().getNombre() + " " + pedido.getPersona1().getNombre() + " " + pedido.getPersona1().getApellido() + " " + pedido.getEntregado());
                double precio= 0;
                if(pedido.getPersona1() instanceof Profesores){
                    double precioFinal= pedido.calcularPrecio();
                    System.out.println(precioFinal);
                }else{
                    System.out.println(pedido.getPlato1().getPrecio());
                }

            }
        }
    }
}

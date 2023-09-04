import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class SistemaLlamadas {
    private HashSet<Llamada> listaLlamadas;
    private HashSet<Empleado> listaEmpleados;

    public HashSet<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(HashSet<Llamada> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }

    public HashSet<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(HashSet<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void agregarEmpleado(Empleado nuevo) {
        listaEmpleados.add(nuevo);
    }

    public void eliminarEmpleado(Empleado eliminado) {
        listaEmpleados.remove(eliminado);
    }

    public void realizarLlamada(Empleado origen, int nroTel, Tiempo duracion) {
        LocalDateTime hoy = LocalDateTime.now();
        Empleado destino = new Empleado();
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNroTel() == nroTel) {
                destino.equals(empleado);
            }
        }
        Llamada nuevaLlamada = new Llamada(origen, destino, hoy, duracion);
        listaLlamadas.add(nuevaLlamada);
    }

    public void listadoLlamadas() {
        String listado = "";
        for (Empleado empleado : listaEmpleados) {
            for (Llamada llamada : listaLlamadas) {
                if (llamada.getEmpleadoOrigen().equals(empleado)) {
                    listado = listado + " " + llamada.getEmpleadoDestino();
                    listado = listado + " " + llamada.getFecha();
                    listado = listado + " " + llamada.getDuracion();
                }
            }
        }
        System.out.println(listado);
    }

    public int calcularTiempoExterior(Empleado empleado, ArrayList<Llamada> listaLlamadas) {
        int duracion = 0;
        for (Llamada llamada : listaLlamadas) {
            if (llamada.getEmpleadoOrigen().equals(empleado) && (llamada.getEmpleadoDestino().getPais() != llamada.getEmpleadoOrigen().getPais())) {
                duracion = duracion + (llamada.getDuracion().getHora() * 60) + llamada.getDuracion().getMinutos();
            }
        }
        return duracion;
    }

    public void ranking(ArrayList<Llamada> listaLlamadas) {
        int top1 = 0;
        int top2 = 0;
        int top3 = 0;
        int aux = 0;
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();

        for (Empleado empleado : listaEmpleados) {
            aux = calcularTiempoExterior(empleado, listaLlamadas);
            if (aux > top1) {
                top3 = top2;
                top2 = top1;
                top1 = aux;
                empleado3 = empleado2;
                empleado2 = empleado1;
                empleado1 = empleado;
            } else if (aux > top2) {
                top3 = top2;
                top2 = aux;
                empleado3 = empleado2;
                empleado2 = empleado;
            } else if (aux > top3) {
                top3 = aux;
                empleado3 = empleado;
            }
        }
        String ranking = "";
        ranking = "1 " + empleado1.getNombre() + " " + empleado1.getApellido() + " " + " 2 " + empleado2.getNombre() + " " + empleado2.getApellido() + " " + "3 " + empleado3.getNombre() + empleado3.getApellido();
        System.out.println(ranking);
    }
}

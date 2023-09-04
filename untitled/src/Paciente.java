import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona{
    private HashMap<LocalDate, Double> listaSeguimientoPeso;
    private HashMap<LocalDate, Double>listaSeguimientoAltura;
    public Paciente(String nombre, String apellido, Fecha fechaNacimiento, LocalDate fecha, HashMap<LocalDate, Double>listaSeguimientoPeso,HashMap<LocalDate, Double>listaSeguimientoAltura ){
        super(nombre,apellido, fechaNacimiento);
        this.listaSeguimientoPeso=listaSeguimientoPeso;
        this.listaSeguimientoAltura=listaSeguimientoAltura;
    }
    public HashMap<LocalDate, Double> getListaSeguimientoPeso() {
        return listaSeguimientoPeso;
    }
    public void setListaSeguimientoPeso(HashMap<LocalDate, Double> listaSeguimientoPeso) {
        this.listaSeguimientoPeso = listaSeguimientoPeso;
    }
    public HashMap<LocalDate, Double> getListaSeguimientoAltura() {
        return listaSeguimientoAltura;
    }
    public void setListaSeguimientoAltura(HashMap<LocalDate, Double> listaSeguimientoAltura) {
        this.listaSeguimientoAltura = listaSeguimientoAltura;
    }

    public void conocerPesoAltura(LocalDate fechaBusqueda){
        double peso=listaSeguimientoPeso.get(fechaBusqueda);
        double altura=listaSeguimientoAltura.get(fechaBusqueda);
        System.out.println("Peso: " + peso + " Altura: " + altura);
    }

    public void promedioAñoPesoAltura(int anio){
        double sumaAltura=0;
        int cantDatosAltura=0;
        int cantDatosPeso=0;
        double sumaPeso=0;
        for(Map.Entry<LocalDate, Double> entrada: listaSeguimientoAltura.entrySet()){
            if(entrada.getKey().getYear() == (anio)){
                sumaAltura=sumaAltura + entrada.getValue();
                cantDatosAltura++;
            }
        }
        for(Map.Entry<LocalDate, Double> entrada: listaSeguimientoPeso.entrySet()){
            if(entrada.getKey().getYear() == (anio)){
                sumaPeso=sumaPeso + entrada.getValue();
                cantDatosPeso++;
            }
        }
        double promedioAltura= sumaAltura/cantDatosAltura;
        double promedioPeso= sumaPeso/cantDatosPeso;
        System.out.println("Promedio peso: " + promedioPeso + " Promedio altura: " + promedioAltura);
    }
    public double procentajeCrecimiento(int anioMenor, int anioMayor){
        int mesMayorAnioMayor=0;
        int diaMayorAnioMayor=0;
        int mesMayorAnioMenor=0;
        int diaMayorAnioMenor=0;
        double alturaAnioMayor=0;
        double alturaAnioMenor=0;

        for(Map.Entry<LocalDate, Double> entrada: listaSeguimientoAltura.entrySet()){
            if((entrada.getKey().getYear() == anioMayor) && (entrada.getKey().getMonthValue() > mesMayorAnioMayor) && (entrada.getKey().getDayOfMonth() > diaMayorAnioMayor)){
                mesMayorAnioMayor=entrada.getKey().getMonthValue();
                diaMayorAnioMayor=entrada.getKey().getDayOfMonth();
                alturaAnioMayor=entrada.getValue();
            }
            if((entrada.getKey().getYear() == anioMenor) && (entrada.getKey().getMonthValue() > mesMayorAnioMenor) && (entrada.getKey().getDayOfMonth() > diaMayorAnioMenor)){
                mesMayorAnioMenor=entrada.getKey().getMonthValue();
                diaMayorAnioMenor=entrada.getKey().getDayOfMonth();
                alturaAnioMenor=entrada.getValue();
            }
        }
        double diferenciaAltura= alturaAnioMayor - alturaAnioMenor;
        return diferenciaAltura;
    }
}

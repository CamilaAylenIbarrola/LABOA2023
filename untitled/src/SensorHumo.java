public class SensorHumo extends Elemento{

    public SensorHumo(boolean estado, double valorActual, double valorUmbral, int año) {
        super(estado, valorActual, valorUmbral, año);
    }

    @Override
    public void alarma() {
        System.out.println("Llamar a los bomberos");
    }
}

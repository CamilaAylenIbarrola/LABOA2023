package Ejercicio.src;

public enum TecnologiaTV {
    ULTRAHD("Ultra hd"), TECNO4K("4K"), FULLHD ("Full HD");
    private String nombreTecnologia;
    private TecnologiaTV(String nombreTecnologia){
        this.nombreTecnologia=nombreTecnologia;
    }

    public String getNombreTecnologia() {
        return nombreTecnologia;
    }
}

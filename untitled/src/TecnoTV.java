public enum TecnoTV {
    ULTRAHD("Ultra hd"), TECNO4K("4K"), FULLHD ("Full HD");
    private String nombreTecnologia;
    private TecnoTV(String nombreTecnologia){
        this.nombreTecnologia=nombreTecnologia;
    }

    public String getNombreTecnologia() {
        return nombreTecnologia;
    }
}

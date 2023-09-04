public enum PartidosPoliticos {
    ELPOLIAVANZA("El poli avanza"),JUNTOSPORELPOLI("Juntos por el poli"),UNIONPORLADOCENCIA("Union por la docencia"),FRENTEDECONSTITUYENTES("Frente de constituyentes");

    private String nombrepartido;
    PartidosPoliticos(String nombrepartido) {
        this.nombrepartido=nombrepartido;
    }

    public String getNombrepartido() {
        return nombrepartido;
    }
}

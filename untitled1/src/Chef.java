public class Chef {
    private String nombre;
    private boolean experienciaPrevia;
    private int edad;

    public Chef(String nombre, boolean experienciaPrevia, int edad) {
        this.nombre = nombre;
        this.experienciaPrevia = experienciaPrevia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isExperienciaPrevia() {
        return experienciaPrevia;
    }
    public void setExperienciaPrevia(boolean experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void verificacion() throws ExperienciaPreviaException, MenorDeEdadException {
        if(!experienciaPrevia){
            throw new ExperienciaPreviaException("no puede trabajar ya que no tiene experiencia previa");
        }else if(edad<18) {
            throw new MenorDeEdadException("no puede trabajar ya que es menor de edad");
        }
    }
}

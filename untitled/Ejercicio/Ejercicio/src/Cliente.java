package Ejercicio.src;
public class Cliente extends Persona{
    private int cuil;
    public Cliente(String nombre, String apellido, int dni, Fecha nacimiento, String direccion, int cuil){
        super(nombre,apellido,dni,nacimiento, direccion);
        this.cuil=cuil;
    }
    public void setCuil(int cuil){
        this.cuil=cuil;
    }
    public int getCuil(){
        return cuil;
    }

}

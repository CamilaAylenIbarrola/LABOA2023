package Ejercicio.src;

import java.util.HashSet;

public class SistemaBebidas {
    private HashSet<Bebedor>listaBebedores;
    private HashSet<Bebida>listaBebidas;
    public SistemaBebidas(HashSet<Bebedor> listaBebedores, HashSet<Bebida> listaBebidas) {
        this.listaBebedores = listaBebedores;
        this.listaBebidas = listaBebidas;
    }
    public HashSet<Bebedor> getListaBebedores() {
        return listaBebedores;
    }
    public void setListaBebedores(HashSet<Bebedor> listaBebedores) {
        this.listaBebedores = listaBebedores;
    }
    public HashSet<Bebida> getListaBebidas() {
        return listaBebidas;
    }
    public void setListaBebidas(HashSet<Bebida> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }
    public void mejorPeorCoeficiente(){
        try{
            if(listaBebedores.size()>0){
                double mejor=0;
                double peor= -1;
                Bebedor mejorBebedor=new Bebedor();
                Bebedor peorBebedor= new Bebedor();
                for(Bebedor bebedor:listaBebedores){
                    if(bebedor.coeficienteHidratacion()<peor){
                        peor=bebedor.coeficienteHidratacion();
                        peorBebedor=bebedor;
                    }else if(bebedor.coeficienteHidratacion()>mejor){
                        mejor=bebedor.coeficienteHidratacion();
                        mejorBebedor=bebedor;
                    }
                }
                System.out.println("El mejor es " + mejorBebedor.getNombre() + " " + mejorBebedor.getApellido());
                System.out.println("El peor es " + peorBebedor.getNombre() + " " + peorBebedor.getApellido());
            }else{
                throw new NullPointerException("Bebedores inexistentes para calcular coeficientes");
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public void agregarPersona(Bebedor bebedor){
        if(listaBebedores.size()==0){
            System.out.println("Se agregó");
            listaBebedores.add(bebedor);
        }else {
            try {
                for (Bebedor personaActual : listaBebedores) {
                    if (personaActual.getDni() == bebedor.getDni()) {
                        throw new DniYaExistente("Ese usuario ya fue agregado");
                    } else {
                        System.out.println("Se agregó");
                        listaBebedores.add(bebedor);
                    }
                }
            } catch (DniYaExistente e) {
                System.out.println(e.getMessage());
            }
        }
    }


}

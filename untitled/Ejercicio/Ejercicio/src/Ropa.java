package Ejercicio.src;

public abstract class Ropa implements Prestable{
    private String color;
    private String marca;
    private MaterialRopa material;
    private String estado;
    public Ropa(String color, String marca, MaterialRopa material, String estado) {
        this.color = color;
        this.marca = marca;
        this.material = material;
        this.estado = estado;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public MaterialRopa getMaterial() {
        return material;
    }
    public void setMaterial(MaterialRopa material) {
        this.material = material;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract String toString();
}

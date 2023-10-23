package Ejercicio.src;

public enum Color {
    BORDO("Bordo", "#C82A54"), ROJO("Rojo", "#EF280F"),  NARANJA("Naranja", "#E36B2C"),  AMARILLO("Amarillo", "#E7D40A"),  VERDE("Verde", "#6DC36D"),  CELESTE("Celeste", "#109DFA"), AZUL("Azul", "024A86"), LILA("Lila", "#E69DFB"), ROSA("Rosa", "#FF689D"), BLANCO("Blanco","ECECEC"), VIOLETA("Violeta", "38C4966"),GRIS("Gris", "#BBA9BB"), NEGRO("Negro", "#222222");
    private String nombre;
    private String codigo;
    private Color(String nombre, String codigo){

    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
}

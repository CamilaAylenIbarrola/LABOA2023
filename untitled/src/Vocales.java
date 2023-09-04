public class Vocales {
    public static void main(String[] args) {
        String texto = "Ayer me compre muñecos de la marca ‘Colchitas’ por internet";
        int cantvocales = 0;

        for (int i = 0; i <= texto.length()-1; i++) {
            char letra = texto.charAt(i);
            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u') || (letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
                cantvocales++;
            }
        }
        System.out.println("Hay " + cantvocales + " vocales");
    }
}

import javax.swing.*;

public class MasCortaMasLarga {
    public static void main(String[] args) {

        int cantidadPalabras = 3;//Integer.parseInt(JOptionPane.showInputDialog("Cuantas palabras vas a ingresar:"));
        System.out.println("La cantidad de palabras es: " + cantidadPalabras);
        String palabraIntroducida = "";
        String palabraMayor = "";
        String palabraMenor = "";
        int longitudPalabraMayor=0;
        int longitudPalabraMenor=Integer.MAX_VALUE;


        for (int i = 1; i < cantidadPalabras + 1; i++) {
            palabraIntroducida = JOptionPane.showInputDialog("Introduce palabra: ");
            System.out.println("Palabra " + i + ": " + palabraIntroducida);

            if (palabraIntroducida.length()>longitudPalabraMayor){
                longitudPalabraMayor=palabraIntroducida.length();
                palabraMayor=palabraIntroducida;
            }
            if (palabraIntroducida.length()<longitudPalabraMenor){
                longitudPalabraMenor=palabraIntroducida.length();
                palabraMenor=palabraIntroducida;
            }
        }

        System.out.println("La palabra más larga es: " + palabraMayor);
        System.out.println("La palabra más corta es: " + palabraMenor);
    }
}

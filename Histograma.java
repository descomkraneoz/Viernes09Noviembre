import javax.swing.*;

public class Histograma {

    private static final int CERO =0 ;

    public static void main(String[] args) {

        int ingresaValor;
        char simbolo='*';
        int contadorPositivos=0;
        int contadorNegativo=0;

        do {
            ingresaValor= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor, termina con 0"));
            System.out.println(ingresaValor);
            if (ingresaValor>0){
                contadorPositivos++;
            }else {
                contadorNegativo++;
            }

        }while (ingresaValor!=CERO);

        if (ingresaValor>=0){
            System.out.print("Positivos: ");
            for (int i = 0; i < contadorPositivos; i++) {
                System.out.print(simbolo);
            }
        }
        System.out.println("\n");

        if (ingresaValor<=0){
            System.out.print("Negativos: ");
            for (int i = 0; i <contadorNegativo-1 ; i++) {
                System.out.print(simbolo);
            }
        }
    }
}

public class NumerosNaturales {
    public static void main(String[] args) {
        int primerNumero=1;
        int cantidadNumeros=5;
        double mediaAritmetica=0;
        int sumaMedia=0;

        for (int i = primerNumero; i < cantidadNumeros; i++) {
            System.out.print(i+",");
            sumaMedia=sumaMedia+i;
        }

        mediaAritmetica=(sumaMedia+cantidadNumeros)/(double)cantidadNumeros;
        System.out.print(cantidadNumeros+"\n");
        System.out.println("La media es: "+String.format("%.2f",mediaAritmetica));
    }
}



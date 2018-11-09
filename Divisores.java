public class Divisores {
    public static void main(String[] args) {

        int numeroLeido=1000;
        int divisor=2;
        boolean terminarPrograma=false;

       /* Una forma de hacerlo aunque no me gusta mucho


        if (numeroLeido>=0) {
            while (!terminarPrograma) {
                if (numeroLeido % divisor == 0) {
                    numeroLeido = numeroLeido / divisor;
                    System.out.println("Un divisor es: "+divisor);

                }else {
                    divisor=divisor+1;
                }
                if (numeroLeido==1){
                    terminarPrograma=true;
                }
            }
        }else {
            System.out.println("El numero introducido no es entero positivo");
        }
        System.out.println("Terminado");

        */

        //Otra forma, con bucle for

        System.out.print("Los divisores son: ");
        for (int i = 2; i <=numeroLeido-1 ; i++) {
            if (numeroLeido%i==0){
                System.out.print(i+",");
            }
        }
        System.out.print(numeroLeido); //añade el ultimo valor permitido
    }
}
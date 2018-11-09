public class TrianguloFloyd {
    public static void main(String[] args) {

        int numeroFilas=5;
        int numerosRellenanTriangulo=0;

        for (int i = 1; i <=numeroFilas ; i++) { //recorre las filas
            for (int j = 1; j <= i; j++){ //recorre cada elemento de la fila
                numerosRellenanTriangulo++;
                System.out.print(" "+numerosRellenanTriangulo);
            }
            System.out.println("");
        }
    }
}
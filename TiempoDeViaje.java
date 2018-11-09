import javax.swing.*;

public class TiempoDeViaje {
    private static final int CERO_MINUTOS = 0;
    private static final int SESENTA_MINUTOS = 60;
    private static final int MINUTO_NUEVE=9;

    public static void main(String[] args) {

        int minutos=0;
        int tiempoTramo;
        int horas=0;

        do {
            tiempoTramo= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tiempo en minutos para el tramo de viaje"));
            System.out.println("Duración tramo: "+tiempoTramo);
            minutos=tiempoTramo+minutos;
        }while (tiempoTramo!=CERO_MINUTOS);
        if (minutos>=SESENTA_MINUTOS){
            horas++;
            minutos=minutos%SESENTA_MINUTOS;
        }
        if (minutos<=MINUTO_NUEVE){
            System.out.println("Tiempo total de viaje: "+horas+":"+0+minutos+" horas");
        }else{
            System.out.println("Tiempo total de viaje: "+horas+":"+minutos+" horas");
        }
    }
}

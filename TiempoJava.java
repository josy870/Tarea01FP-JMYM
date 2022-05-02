import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class TiempoJava {
    public static void main(String[] args) {
        //2.8
        //Definir variables
        double v, e, t;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de la Velocidad:");
        v=lt.nextDouble();
        System.out.println("Ingrese el valor del Espacio:");
        e=lt.nextDouble();
        //Proceso
        t=e/v;  
        //Datos de salida
        System.out.print("El Tiempo que tarda en bicicletas es:" +t);
        lt.close();

    }
}


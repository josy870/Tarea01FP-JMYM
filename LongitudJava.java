import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class LongitudJava {
    public static void main(String[] args) {
        //2.19
        //Definir variables
        double L, r;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor del Radio:");
        r=lt.nextDouble();
        //Proceso
        L=2*3.14*r;  
        //Datos de salida
        System.out.print("La Longitud es:" +L);
        lt.close();
    }
}
import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class DolarJava {
    public static void main(String[] args) {
        //2.2
        //Definir variables
        double d, s, p;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolares:");
        d=lt.nextDouble();
        System.out.println("Ingrese el presio del dolar:");
        p=lt.nextDouble();
        //Proceso
        s=d*p;
        //Datos de salida
        System.out.print("La cantidad en soles es:" +s);
        lt.close();

    }
}
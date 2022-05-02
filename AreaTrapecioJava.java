import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class AreaTrapecioJava {
    public static void main(String[] args) {
        //2.20
        //Definir variables
        double a, B, b, h;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de la Base Mayor:");
        B=lt.nextDouble();
        System.out.println("Ingrese el valor de la Base menor:");
        b=lt.nextDouble();
        System.out.println("Ingrese el valor de la Altura:");
        h=lt.nextDouble();
        //Proceso
        a=B+b/2*h;  
        //Datos de salida
        System.out.print("El Area del Trapecio es:" +a);
        lt.close();

    }
}
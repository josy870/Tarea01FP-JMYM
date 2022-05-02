import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class EdadJava {
    public static void main(String[] args) {
        //2.3
        //Definir variables
        double e, A, a;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el año actual:");
        A=lt.nextDouble();
        System.out.println("Ingrese el año de nacimiento:");
        a=lt.nextDouble();
        //Proceso
        e=A-a;
        //Datos de salida
        System.out.print("la edad actual es:" +e);
        lt.close();

    }
}
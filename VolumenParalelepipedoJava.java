import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class VolumenParalelepipedoJava {
    public static void main(String[] args) {
        //2.22
        //Definir variables
        double v, a, b, c;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de lado a:");
        a=lt.nextDouble();
        System.out.println("Ingrese el valor del lado b:");
        b=lt.nextDouble();
        System.out.println("Ingrese el valor del lado c:");
        c=lt.nextDouble();
        //Proceso
        v=a*b*c;
        //Datos de salida
        System.out.print("El volumen es:" +v);
        lt.close();

    }
}
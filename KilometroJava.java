import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class KilometroJava {
    public static void main(String[] args) {
        //2.21
        //Definir variables
        double m, vm=1609, k;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad en millas:");
        m=lt.nextDouble();
        //Proceso
        k=m*vm;
        //Datos de salida
        System.out.print("La cantidad de millas en kilometros es:" +k);
        lt.close();

    }
}

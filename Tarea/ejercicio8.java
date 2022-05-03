import java.util.Scanner;
public class ejercicio8 {

    public static void main(String[] args) {
        //Definir variables
        double L, Pi = 3.1416, R;
        //Datos de salida
        Scanner lt = new Scanner(System.in);
        System.out.println("ingrese el valor del radio:");
        R = lt.nextDouble();    
        //Proceso
        L = Pi * Math.pow(R, 2);
        //Datos de salida
        System.out.println("la longitud es; " + L);

    }
} 
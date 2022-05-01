import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        // DEFINIR VARIABLES
        double L, Pi = 3.1416, R;
        //DATOS DE ENTRADA
        Scanner lt= new Scanner(System.in);
        System.out.println("ingrese el valor del radio: ");
        R = lt.nextDouble();
        //PROCESO
        L = Pi * Math.pow(R, 2);
        //DATOS DE SALIDA
        System.out.println("la longitud es; " + L);

    }
} 

import java.util.Scanner;

public class ejercicio3 {
    private static Scanner lt;
    public static void main(String[] args) {
        //DEFINIR VARIABLES
        double suma = 0, termino;
        //DATOS DE ENTRADA
        Scanner lt = new Scanner(System.in);
        System.out.println("ingrese el termino n");
        termino = lt.nextInt();
        //PROCESO
        suma = 2 * (termino + 1);
        //DATOS DE SALIDA
        System.out.println("la suma es:" + suma);    

    }

}
import java.util.Scanner;
public class ejercicio2 {
    
    public static void main(String[] args) {
        //DEFINIR VARIABLES
        int h, c, t;
        //DATOS DE ENTRADA
        Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en h");
        h=lt.nextInt();
        System.out.println("Ingrese el costo por hora c");
        c=lt.nextInt();
        //PROCESO
        t=h*c;
        //DATOS DE SALIDA
        System.out.print("El cobro total es:"+t);
    }
} 
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        //Definir variables
        double k, c, t;
        //Datos de entrada
        Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese el costo por kilometro c");
        c=lt.nextDouble();
        System.out.println("Ingrese la cantidad de kilometros k");
        k=lt.nextDouble();
        //Proceso
        t=c*k;
        //Datos de salida
        System.out.print("El precio del boleto en es:"+t);
    }
} 

import java.util.Scanner;

public class ejercicio4 {
   public static void main(String[] args) {
    //Definir variables
    double area, base, altura;
    //Datos de entrada
    Scanner lt = new Scanner(System.in);
    System.out.println("ingrese la altura del triangulo: ");
    altura = lt.nextDouble();
    System.out.println("ingrese la base del triangulo: ");
    base = lt.nextDouble();
    //Proceso
    area = (altura * base)/ 2;
    //Datos de salida
    System.out.println("el area es; \n" + area);

    }
}

package Retos;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner conversion=new Scanner(System.in);
        double gradosc,gradosf;
        System.out.println("ingrese los grados fahrenheit que desea convertir ");
        gradosf = conversion.nextDouble();
        gradosc = (gradosf-32)/1.8;
        System.out.println("los grados centigrados a colocar en su horno son "+gradosc);
        conversion.close();
    }
}

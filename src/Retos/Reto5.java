package Retos;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre,apellido,nombreCompleto;
        System.out.println("ingrese su primer nombre ");
        nombre=leer.next();
        System.out.println("ingrese su primer apellido");
        apellido=leer.next();
        int length=nombre.length();
        System.out.println("la longitud de su nombre es "+length);
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());
        nombreCompleto=nombre+" "+apellido;
        System.out.println(nombreCompleto);
        String subnombre=nombre.substring(0, 2);
        System.out.println(subnombre+apellido);
        leer.close();
    }
}

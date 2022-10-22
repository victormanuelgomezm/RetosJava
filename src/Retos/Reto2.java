package Retos;
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner vacuna=new Scanner(System.in);
        float meses,peso,dosisvacuna;
        System.out.println("ingrese los meses que tiene el bebe");
        meses=vacuna.nextFloat();
        meses=meses*10;
        System.out.println("ingrese el peso del bebe");
        peso=vacuna.nextFloat();
        peso=peso+10;
        dosisvacuna=peso/meses*8;
        System.out.println("la dosis a aplicar es "+dosisvacuna+" milimetros cubicos ");
        vacuna.close();
    }
}

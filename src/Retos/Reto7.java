package Retos;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner election=new Scanner(System.in);
        
        int aleatorio=0,respuesta,apuesta,acumulador=0,contador=0;
        char co=1;
        System.out.println("ingrese el valor q desea recargar ");
        acumulador=election.nextInt();
            do{
                System.out.println("ingrese el valor que desea apostar ");
                apuesta=election.nextInt();
                System.out.println("para jugar:\n presione 1 para elegir cara \n 2 para elegir sello");
                respuesta=election.nextInt();
                System.out.println("la moneda esta en el aire y ya cayo ");
                aleatorio=(int)(Math.random()*2)+1;
                if(aleatorio==1 && respuesta==1){
                    System.out.println("salio cara usted escogio cara ganaste!!\n debe multiplicar su apuesta ");
                    acumulador=acumulador+apuesta;
                    contador=contador+1;
                }
                else if(aleatorio==1 && respuesta==2){
                    System.out.println("salio cara usted escogio sello perdiste! ");
                    acumulador=acumulador-apuesta;
                    contador=contador+1;
                    if(acumulador<=0){
                        System.out.println("su saldo es insuficiente ");
                        break;
                    }
                }
                else if(aleatorio==2 && respuesta==2){
                    System.out.println("salio sello usted escogio sello ganaste!!\n debe duplicar su apuesta ");
                    acumulador=acumulador+apuesta;
                    contador=contador+1;
                }
                else if(aleatorio==2 && respuesta==1){
                    System.out.println("salio sello usted escogio cara perdiste! ");
                    acumulador=acumulador-apuesta;
                    contador=contador+1;
                    if(acumulador<=0){
                        System.out.println("su saldo es insuficiente ");
                        break;
                    }
                }
                election.nextLine();
                System.out.println("ingrese s si desea volver a jugar o n para salir ");
                co=election.nextLine().charAt(0);
                System.out.println("el saldo disponible  es "+acumulador+" y las veces que jugo fueron "+contador);
            }
            while (co=='s'||co=='S');
            election.close();
    }
            
}

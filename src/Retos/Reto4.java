package Retos;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner juego=new Scanner(System.in);
        int aleatorio=0,election;
        System.out.println("digite 1 para piedra \n digite 2 para papel \n digita 3 para tijera");
        election=juego.nextInt();
        aleatorio=(int)(Math.random()*3)+1;
        if(aleatorio==1 && election==1){
            System.out.println("la maquina escogio piedra y usted escogio piedra tenemos un empate!!");
        }
        else if(aleatorio==1 && election==2){
            System.out.println("la maquina escogio piedra y usted escogio papel ganaste!!");
        }
        else if(aleatorio==1 && election==3){
            System.out.println("la maquina escogio piedra y usted escogio tijera perdiste!!");
        }
        else if(aleatorio==2 && election==1){
            System.out.println("la maquina escogio papel y usted escogio piedra perdiste!!");
        }
        else if(aleatorio==2 && election==2){
            System.out.println("la maquina escogio papel y usted escogio papel tenemos un empate!!");
        }
        else if(aleatorio==2 && election==3){
            System.out.println("la maquina escogio papel y usted escogio tijera ganaste!!");
        }
        else if(aleatorio==3 && election==1){
            System.out.println("la maquina escogio tijera y usted escogio piedra  ganaste!!");
        }
        else if(aleatorio==3 && election==2){
            System.out.println("la maquina escogio tijera y usted escogio papel  perdiste!!");
        }
        else if(aleatorio==3 && election==3){
            System.out.println("la maquina escogio tijera y usted escogio tijera tenemos un empate!!");
        }
        else{
            System.out.println("opcion invalida ");
        }
        juego.close();
    }
}

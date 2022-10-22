package Ejercicios;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ejercicio1 {
    public static void main(String[] args) {
        int precio,cantidad,referencia=0,subtotal,total=0,valorrecibido,telefonia,op;
        Scanner valor=new Scanner(System.in);
        
        for(int i=0; i <=4 ;i ++){
        System.out.println("digite el precio del producto");
        precio=valor.nextInt();
        System.out.println("digite la cantidad del producto");
        cantidad=valor.nextInt();
        subtotal=precio*cantidad;
        System.out.println(cantidad+"del producto de precio"+precio+"es"+subtotal);
         //iniciar contador
        referencia=referencia+1;
        //iniciamos el acumulador para el total de la compra
        total=total+subtotal;
        }
        System.out.println("el total de su compra es "+total);
        System.out.println("la cantidad de minutos de la compra es"+referencia);
        System.out.println("ingrese el valor con el que desea pagar");
        valorrecibido=valor.nextInt();
        valorrecibido=valorrecibido-total;
        System.out.println("su cambio es "+valorrecibido);
        System.out.println("cuenta usted con telefonia movil exito ? maruqe 1 para si \n marque 2 para no\n");
        op=valor.nextInt();
        switch (op) {
            case 1:
                System.out.println("los minutos acumulados en su compra fueron"+referencia);
                
                break;
        
            default:
                System.out.println("no dejes de perder minutos adquiere ya tu movil exito");
                break;
        }
        
        valor.close();
    }
    

}

package Retos;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int precio,valor=0,cantidad,aleatorio=0,eleccion,subtotal,pago;
        double total=0,descuento,cambio;
        System.out.println("presione 1 para registrar un producto o presione 2 para salir");
        eleccion=leer.nextInt();
        while(eleccion==1){
        System.out.println("digite el precio del producto ");
        precio=leer.nextInt();
        System.out.println("digite la cantidad ");
        cantidad=leer.nextInt();
        subtotal=precio*cantidad;
        valor=valor+subtotal;
        aleatorio=(int)(Math.random()*4)+1;
        System.out.println("presione 1 para registrar otro producto o presione 2 para salir");
        eleccion=leer.nextInt();
        
        }
        
        
        if(valor<=49900){
            System.out.println("no fue escogido para participar en nuestra promocion su total a pagar es "+valor);
        }
        else if(valor>=50000){
            System.out.println("saliste escogido para participar en nuestra promocion");
            if(aleatorio==1){
                descuento=valor*0.10;
                total=valor-descuento;
                System.out.println("salio bolita amarilla ganaste el 10% de descuento el valor a pagar es "+total);
            }
            else if(aleatorio==2){
                descuento=valor*0.30;
                total=valor-descuento;
                System.out.println("salio bolita amarilla ganaste el 30% de descuento el valor a pagar es "+total);
            }
            else if(aleatorio==3){
                descuento=valor*0.50;
                total=valor-descuento;
                System.out.println(" salio bolita amarilla ganaste el 50% de descuento el valor a pagar es "+total);
            }
            else if(aleatorio==4){
                System.out.println("felicidades tu compra es totalmente gratis ");
            }
        System.out.println("ingrese el valor con el que desea cancelar ");
        pago=leer.nextInt();
        cambio=pago-total;
        System.out.println("usted me entrego "+pago+"su cambio es "+cambio);
        }
        
        leer.close();
    }
    }


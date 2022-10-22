package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int hombre=0,mujer=0,genero;
        
        for(int i=0; i<=9;i++){
        System.out.println("ingrese 1 si es hombre o ingrese 2 si es mujer");
        genero=leer.nextInt();
            if(genero==1){
                hombre=hombre+1;
            }
            else if(genero==2){
                mujer=mujer+1;
            }
            else{
                System.out.println("datos incorrectos");
            }
        }
        System.out.println("en el grupo hay "+hombre+"hombres y"+mujer+"mujeres");
        leer.close();
    }
}

package Ejercicios;
import java.util.Scanner;

public class Ejerciciocalculadora {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op,num1,num2,total;
        String usuario,contraseña,usuario1,contraseña1;
        usuario="jfajardo";
        contraseña="12345678#";
        usuario1="tcabrera";
        contraseña1="qwerty2022";
        System.out.println("ingrese su usuario");
        usuario=leer.nextLine();
        System.out.println("ingrese su contraseña");
        contraseña=leer.nextLine();
        

        if((usuario.equals("jfajardo"))||(contraseña.equals("12345678#"))){
            System.out.println("menu opciones \n 1.suma \n 2. resta\n 3. multiplicacion \n 4.division\n 5. elevar a la potencia\n 6. elevar al cuadrado \n ingrese el numero de la opcion que desea realizar");
            op=leer.nextInt();
            System.out.println("ingrese numero 1 ");
            num1=leer.nextInt();
            System.out.println("ingrese numero 2 ");
            num2=leer.nextInt();
            switch(op){
                case 1:
                    total=num1+num2;
                    System.out.println("el total de la suma  "+total);
                break;
                case 2:
                    total=num1-num2;
                    System.out.println("el total de la resta es  "+total);
                break;
                case 3:
                    total=num1*num2;
                    System.out.println("el total de la multiplicacion es  "+total);
                break;
                case 4:
                    total=num1/num2;
                    System.out.println("el total de la division es  "+total);
                break;
                case 5:
                    total=(int)(Math.pow(num1, num2));
                    System.out.println("la potencia de los numeros que elegio es  "+total);
                break;
                case 6:
                    double resultado=Math.sqrt(num1);
                    double resultado1=Math.sqrt(num2);
                    System.out.println("la raiz cuadrada de num1 "+resultado+" \n la raiz cuadrada de num2 "+resultado1);
                break;
                default:
                    System.out.println("la opcion seleccionada no es valida");
                break;
            }
        }
        else if((usuario1.equals("tcabrera"))||(contraseña1.equals("qwerty2022"))){
            System.out.println("menu opciones \n 1.suma \n 2. resta\n 3. multiplicacion \n 4.division\n 5. elevar a la potencia\n 6. elevar al cuadrado \n ingrese el numero de la opcion que desea realizar");
            op=leer.nextInt();
            System.out.println("ingrese numero 1 ");
            num1=leer.nextInt();
            System.out.println("ingrese numero 2 ");
            num2=leer.nextInt();
            switch(op){
                case 1:
                    total=num1+num2;
                    System.out.println("el total de la suma  "+total);
                break;
                case 2:
                    total=num1-num2;
                    System.out.println("el total de la resta es  "+total);
                break;
                case 3:
                    total=num1*num2;
                    System.out.println("el total de la multiplicacion es  "+total);
                break;
                case 4:
                    total=num1/num2;
                    System.out.println("el total de la division es  "+total);
                break;
                case 5:
                    total=(int)(Math.pow(num1, num2));
                    System.out.println("la potencia de los numeros que elegio es  "+total);
                break;
                case 6:
                    double resultado=Math.sqrt(num1);
                    double resultado1=Math.sqrt(num2);
                    System.out.println("la raiz cuadrada de num1 "+resultado+" \n la raiz cuadrada de num2 "+resultado1);
                break;
                default:
                    System.out.println("la opcion seleccionada no es valida");
                break;
                
            }
        }
        leer.close();
    }
}

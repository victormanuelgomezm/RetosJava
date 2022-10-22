package Ejercicios;

import java.util.Scanner;

public class Ejerciciocalculadora1{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int op, num1, num2, total;

        String usuario;
        String contraseña;

        System.out.println("Ingrese su usuario ");
        usuario = leer.next();

        System.out.println("Ingrese su contraseña");
        contraseña = leer.next();

        if (usuario.equals("jfajardo") || usuario.equals("tcabrera") && contraseña.equals("12345678#") || contraseña.equals("qwerty2022")) {

            System.out.println("puedes usar la calculadora");

            System.out.println("Menu de opciones \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n Ingrese el numero de la opcion que desea realizar");
            op = leer.nextInt();

            System.out.println("Ingrese el numero 1");
            num1 = leer.nextInt();

            System.out.println("Ingrese el numero 2");
            num2 = leer.nextInt();

            switch (op) {
                case 1 -> {
                    total = num1 + num2;
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es " + total);
                }
                case 2 -> {
                    total = num1 - num2;
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es " + total);
                }
                case 3 -> {
                    total = num1 * num2;
                    System.out.println("La multiplicaion entre " + num1 + " y " + num2 + " es " + total);
                }
                case 4 -> {
                    total = num1 / num2;
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es " + total);
                }
                case 5 -> {
                    double n1 = (double) num1;
                    double n2 = (double) num2;
                    double t;
                    t = Math.pow(n1, n2);
                    System.out.println("la potencia de " + n1 + " y de " + n2 + " es " + t);
                }
                case 6 -> {
                    double raiz = Math.sqrt(num1);
                    double raiz2 = Math.sqrt(num2);
                    System.out.println("la raiz cuadrada de " + num1 + " es  " + raiz + "\n y la raiz cuadrada de " + num2 + " es " + raiz2);
                }
            }

        }
        else  if ((( usuario.equals ( "jfajardo" ) ) && ( contraseña.equalsIgnoreCase(contraseña))) || ( usuario.equals("tcabrera") && ( contraseña.equalsIgnoreCase(contraseña)))){
            System.out.println ( "Tu contraseña no es correcta.\n No puedes usar la calculadora" );
        }
        else  if ((( usuario.equalsIgnoreCase(usuario) ) && ( contraseña.equals("12345678#"))) || ( usuario.equalsIgnoreCase(usuario) && ( contraseña.equals("qwerty2022")))){
            System.out.println ( "Usuario no existe, no esta registrado. \n No puedes usar la calculadora" );
        }

        leer.close();
    }

}


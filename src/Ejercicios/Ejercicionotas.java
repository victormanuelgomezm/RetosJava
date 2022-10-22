package Ejercicios;
import java.util.Scanner;

public class Ejercicionotas {
    public static void main(String[] args) {
        Scanner notas=new Scanner(System.in);
        double nota=0.0,valoracumulado,promedio,total=0;
        for(int i=0;i<=3;i++){
        System.out.println("digite la nota de su taller");
        nota=notas.nextDouble();
        total=total+nota;
        }
        promedio=total/4;
        if((promedio>=3.0)||(promedio<=3.9)){
            System.out.println("usted aprobo la materia raspando");
        }
        else if(promedio>=4.0){
            System.out.println("aprobaste la materia con buenos resultados ");
        }
        else{
            System.out.println("usted reprobo la materia");
        }
        System.out.println("su notal final es "+promedio);
        notas.close();

    }
}

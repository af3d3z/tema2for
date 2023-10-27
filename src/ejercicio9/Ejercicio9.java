package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // entrada del usuario
        int num;
        // aquí se guardan los divisores del número
        int divisores = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        num = sc.nextInt();

        if(num == 1){
            System.out.println("El número 1 no es primo.");
        }else{
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    divisores++;
                }
            }

            if(divisores == 0){
                System.out.println("El número " + num + " es primo.");
            }else {
                System.out.println("El número " + num + " no es primo.");
            }
        }
    }
}

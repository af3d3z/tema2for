package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // número hasta el que tendrá que contar
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número hasta el que contar:");
        num = sc.nextInt();

        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
        sc.close();
    }

}

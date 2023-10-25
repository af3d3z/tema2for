package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // variable que guardará el total de los 10 números
        int suma = 0;
        // entrada de usuario
        int num;
        // variable donde guardará la media
        double media;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<=10; i++){
            System.out.println("Introduce un número:");
            num = sc.nextInt();
            suma += num;
        }
        media = (double) suma /10;

        System.out.println("Media: " + media);
        sc.close();
    }
}

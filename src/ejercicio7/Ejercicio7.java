package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // factorial
        int fact = 1;
        // entrada de usuario
        int num;
        Scanner sc = new Scanner(System.in);

        // pedimos un número al usuario
        System.out.println("Introduce un número");
        num = sc.nextInt();

        for(int i = 1; i<=num;i++){
          fact = fact*i;
        }

        System.out.println("El factorial de " + num + " es: " + fact);
        sc.close();
    }
}

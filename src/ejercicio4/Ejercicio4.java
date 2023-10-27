package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // número introducido por el usuario
        int num;
        Scanner sc = new Scanner(System.in);

        // preguntamos al usuario un número
        System.out.println("Introduce un número:");
        num = sc.nextInt();

        System.out.println("Múltiplos de 3 desde el 1 al " + num + ":");
        for(int i = 1; i<=num; i++){
            if(i % 3 == 0)
                System.out.println(i);
        }
        sc.close();
    }
}

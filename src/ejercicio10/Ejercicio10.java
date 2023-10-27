package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // en a se guardará el menor y en b el mayor
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        a = sc.nextInt();
        System.out.println("Introduce un número mayor al anterior:");
        b = sc.nextInt();

        if(a>b){
            System.out.println("El segundo número debe ser MAYOR al anterior.");
        }else{
            for(int i = a; i<=b;i++){
                System.out.println(i);
            }
        }
    }
}

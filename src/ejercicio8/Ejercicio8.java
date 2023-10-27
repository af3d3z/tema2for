package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // creamos suspensos para indicar si hay alumnos suspensos
        boolean suspensos = false;
        // entrada usuario
        double num;
        Scanner sc = new Scanner(System.in);
        // usamos la distribución americana para leer el punto
        sc.useLocale(Locale.US);

        for(int i = 1; i<=5; i++){
            System.out.println("Introduce la nota del alumno:");
            num = sc.nextDouble();
            if(num < 5)
                suspensos = true;
        }

        if(suspensos){
            System.out.println("Hay alumnos suspensos.");
        }else{
            System.out.println("No hay alumnos suspensos");
        }
        sc.close();
    }
}

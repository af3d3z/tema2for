package ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        // suma de los 10 primeros números impares
        int suma = 0;

        for(int i = 1; i <= 10; i++){
            if(!(i % 2 == 0)) {
                suma += i;
                System.out.println(i);
            }
        }

        System.out.println("Suma: " + suma);
    }
}

package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        // recorremos todos los dígitos del 1 al 100 y si son múltiplos de 7 se imprimen por pantalla
        for(int i = 1; i < 100; i++){
            if(i % 7 == 0)
                System.out.println(i);
        }
    }
}

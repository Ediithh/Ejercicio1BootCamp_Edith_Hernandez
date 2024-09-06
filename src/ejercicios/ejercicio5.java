package ejercicios;

public class ejercicio5 {

    public static void main(String[] args) {

    //5. Máximo de tres números
    //Descripción: Dados los números a = 5, b = 12 y c = 9, encuentra cuál de ellos es el mayor.
    //Variables: a = 5, b = 12, c = 9.

        int a = 20;
        int b = 40;
        int c = 9;

        int maximo;

        if (a >= b && a >= c) {
            maximo = a;
        } else if (b >= a && b >= c) {
            maximo = b;
        } else {
            maximo = c;
        }
        System.out.println("El número mayor es: " + maximo);
    }
}

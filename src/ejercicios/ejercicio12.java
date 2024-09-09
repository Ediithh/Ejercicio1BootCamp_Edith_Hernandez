package ejercicios;

public class ejercicio12 {

    public static void main(String[] args) {
        //  12. Inversión de un número
        //	Descripción: Dado el número a = 54321, invierte el orden de sus dígitos. El resultado sería 12345.
        //	Variables: a = 54321.

        int a = 54321;
        int resto = 0;
        int invertido = 0;

        while (a > 0) {
            resto = a % 10;
            invertido = invertido * 10 + resto;
            a /= 10;
        }

        System.out.println("Número invertido: " + invertido);
    }
}

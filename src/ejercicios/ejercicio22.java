package ejercicios;

public class ejercicio22 {
    public static void main(String[] args) {

    //  22. Conteo de dígitos de un número
    //	Descripción: Cuenta cuántos dígitos tiene el número a = 987654. El resultado sería 6 dígitos.
    //	Variables: a = 987654.

        int a = 9876541;

        if(a == 0) a++;
        System.out.println("El número de dígitos que tiene " + a + " es " + Math.floor(Math.log10(Math.abs(a)) +1));
    }
}

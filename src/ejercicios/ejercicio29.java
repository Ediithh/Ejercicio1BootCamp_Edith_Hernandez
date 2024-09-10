package ejercicios;

public class ejercicio29 {

    public static void main(String[] args) {

    // 29. Verificar si un número es un cuadrado perfecto
    //	Descripción: Determina si el número a = 64 es un cuadrado perfecto. Un cuadrado perfecto es un número que es el
    //	resultado de multiplicar un entero por sí mismo. En este caso, 8 × 8 = 64.
    //	Variables: a = 64.

        int a = 64;
        int suma = 0;

        for (int i = 1; suma < a; i += 2) {
            suma += i;
            }
            if (suma == a) {
                System.out.println(a + " es un cuadrado perfecto.");
                } else
                    System.out.println(a + " no es un cuadrado perfecto.");
    }
}

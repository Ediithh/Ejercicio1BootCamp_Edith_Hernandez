package ejercicios;

public class ejercicio25 {
    public static void main(String[] args) {

        //  25. Generar tabla de multiplicar
        //	Descripción: Genera la tabla de multiplicar del número a = 7.
        //	Variables: a = 7.
        int a =7;
        int multiplicador = 1;
        while(multiplicador <=10) {
            System.out.println(multiplicador + " X " + a + " = " + multiplicador * a);
            multiplicador++;
        }
    }
}


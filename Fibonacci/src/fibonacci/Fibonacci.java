package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int numero_Verificar = 21;

        int a = 0;
        int b = 1;
        int fibonacci = 0;

        while (fibonacci < numero_Verificar) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        if (fibonacci == numero_Verificar) {
            System.out.println(numero_Verificar + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero_Verificar + " não pertence à sequência de Fibonacci.");
        }
    }
}
import java.util.Scanner;

public class RibeiraoPreto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1, c = 0;

        if (numero == 0 || numero == 1) {
            return true; 
        }

        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == numero;
    }
}
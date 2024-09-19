package Sequenciais;

public class Sequenciais {

    public static void main(String[] args) {
        // a) Sequência: 1, 3, 5, 7, ___
        int a = 1;
        int proximoA = a + 2;
        System.out.println("a) " + proximoA); // Saída: 9

        // b) Sequência: 2, 4, 8, 16, 32, 64, ____
        int b = 64;
        int proximoB = b * 2;
        System.out.println("b) " + proximoB); // Saída: 128

        // c) Sequência: 0, 1, 4, 9, 16, 25, 36, ____
        int n = 7; // próximo número natural
        int proximoC = n * n;
        System.out.println("c) " + proximoC); // Saída: 49

        // d) Sequência: 4, 16, 36, 64, ____
        int d = 8; // próximo número par
        int proximoD = d * d;
        System.out.println("d) " + proximoD); // Saída: 100

        // e) Sequência: 1, 1, 2, 3, 5, 8, ____
        int a1 = 1, a2 = 1;
        int proximoE;
        for (int i = 2; i < 7; i++) {
            proximoE = a1 + a2;
            a1 = a2;
            a2 = proximoE;
        }
        System.out.println("e) " + proximoE); // Saída: 13

        // f) Sequência: 2, 10, 12, 16, 17, 18, 19, ____
        int f = 19;
        int proximoF = f + 1;
        System.out.println("f) " + proximoF); // Saída: 20
    }
}

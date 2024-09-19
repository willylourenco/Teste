package VerificaLetraA;

import java.util.Scanner;

public class VerificaLetraA {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a entrada da string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Chama a função que verifica a ocorrência da letra 'a' ou 'A'
        int quantidade = contarOcorrenciasDeA(input);
        
        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    // Função que conta quantas vezes 'a' ou 'A' aparecem na string
    public static int contarOcorrenciasDeA(String str) {
        int contador = 0;

        // Percorre a string e conta as ocorrências de 'a' ou 'A'
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        
        return contador;
    }
}

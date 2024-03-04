package atividade04;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um caractere: ");
        char letra = scanner.next().charAt(0);
        letra = Character.toLowerCase(letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("O caractere é uma vogal.");
        } else {
            System.out.println("O caractere é uma consoante.");
        }

        scanner.close();
    }
}
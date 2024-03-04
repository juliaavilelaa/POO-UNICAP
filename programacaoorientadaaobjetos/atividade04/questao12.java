package atividade04;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e 5, simultaneamente.");
        } else {
            System.out.println("O número não é divisível por 3 e 5 ao mesmo tempo.");
        }

        scanner.close();
    }
}
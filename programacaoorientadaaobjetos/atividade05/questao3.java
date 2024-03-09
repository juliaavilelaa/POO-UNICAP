package atividade05;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro para encontrar seus divisores:");
        int numero = scanner.nextInt();

        System.out.printf("Divisores de %d:\n", numero);
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.printf("%d ", i);
            }
        }

        scanner.close();
    }
}
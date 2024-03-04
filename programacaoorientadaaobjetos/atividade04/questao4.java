package atividade04;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("%d é par.", numero);
        } else {
            System.out.printf("%d é ímpar.", numero);
        }

        scanner.close();
    }
}

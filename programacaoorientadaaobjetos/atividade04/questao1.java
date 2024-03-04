package atividade04;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("O número informado é igual a zero.");
        } else if (numero > 0) {
            System.out.println("O número informado é positivo.");
        } else {
            System.out.println("O número informado é negativo.");
        }

        scanner.close();
    }
}
package atividade05;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int num = scanner.nextInt();

        int soma = 0;
        while (num != 0) {
            int digito = num % 10;
            soma += Math.pow(digito, 3);
            num /= 10;
        }

        System.out.printf("Soma dos digitos elevados ao cubo: %d\n", soma);

        scanner.close();
    }
}
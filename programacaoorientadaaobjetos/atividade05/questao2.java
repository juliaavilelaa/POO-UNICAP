package atividade05;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        while (numero != 0) {
            int digito = numero % 10;
            soma += digito;
            numero /= 10;
        }

        System.out.printf("Soma dos digitos: %d\n", soma);

        scanner.close();
    }
}

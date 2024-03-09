package atividade05;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int num = scanner.nextInt();
        int numInicial = num;

        int somaPares = 0;
        while (num != 0) {
            int digito = num % 10;
            if (digito % 2 == 0) {
                somaPares += digito;
            }
            num /= 10;
        }

        System.out.printf("Soma dos digitos pares do numero %d: %d\n", numInicial, somaPares);

        scanner.close();
    }
}

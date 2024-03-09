package atividade05;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        int pares = 0;
        boolean ehImpar = false;

        System.out.println("Digite numeros inteiros (0 para parar)");
        while (num != 0) {
            num = scanner.nextInt();
            if (num % 2 == 0 && num != 0) {
                pares++;
            } else {
                ehImpar = true;
            }
        }
        if (ehImpar) {
            System.out.printf("Foram digitados %d numeros pares antes do primeiro numero impar.\n", pares);
        } else {
            System.out.println("Nao foi digitado nenhum numero impar.");
        }

        scanner.close();
    }
}

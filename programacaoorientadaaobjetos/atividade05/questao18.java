package atividade05;

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        int pares = 0;
        int impares = 0;

        System.out.println("Digite numeros inteiros (0 para parar): ");
        while (true) {
            num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("Foram digitados %d numeros pares e %d numeros impares.\n", pares, impares);

        scanner.close();
    }
}

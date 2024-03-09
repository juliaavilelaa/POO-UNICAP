package atividade05;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = 1;
        int maior = 0;
        int menor = 99999999;

        System.out.println("Informe numeros inteiros (0 para parar): ");
        while (valor != 0) {
            valor = scanner.nextInt();

            if (valor > maior && valor != 0) {
                maior = valor;
            }
            if (valor < menor && valor != 0) {
                menor = valor;
            }
        }

        System.out.printf("Maior valor digitado: %d\nMenor valor digitado: %d\n", maior, menor);

        scanner.close();
    }
}
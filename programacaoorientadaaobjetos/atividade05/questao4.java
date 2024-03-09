package atividade05;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe a altura da pessoa %d: ", i + 1);
            double altura = scanner.nextDouble();
            total += altura;
        }

        System.out.printf("A media de altura das 5 pessoas é %.2f.\n", total / 5);

        scanner.close();
    }
}
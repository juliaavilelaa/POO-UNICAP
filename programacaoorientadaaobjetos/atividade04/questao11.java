package atividade04;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salário do funcionário:");
        double sal = scanner.nextDouble();

        if (sal > 1500) {
            System.out.printf("Aumento de 10 porcento. Novo salário: %.2f", sal + (sal * 0.10));
        } else {
            System.out.printf("Aumento de 15 porcento. Novo salário: %.2f", sal + (sal * 0.15));
        }

        scanner.close();
    }
}
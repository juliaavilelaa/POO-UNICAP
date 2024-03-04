package atividade03;

import java.util.Scanner;

public class questao34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe\nvalor 1: ");
        double n1 = scanner.nextDouble();
        System.out.println("valor 2: ");
        double n2 = scanner.nextDouble();
        System.out.println("valor 3: ");
        double n3 = scanner.nextDouble();

        System.out.printf("Média aritmética = %.2f", (n1 + n2 + n3) / 3);

        scanner.close();
    }
}
package atividade04;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de dois números:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Os números são iguais.");
        } else if (n1 > n2) {
            System.out.printf("%d é maior que %d.", n1, n2);
        } else {
            System.out.printf("%d é maior que %d.", n2, n1);
        }

        scanner.close();
    }
}
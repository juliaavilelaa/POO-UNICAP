package atividade03;

import java.util.Scanner;

public class questao38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 3 números inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.printf("(%d + %d) * %d = %d", n1, n2, n3, (n1 + n2) * n3);

        scanner.close();
    }
}
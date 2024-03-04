package atividade04;

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois números inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.printf("Escolha a operação desejada:\n1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão\n");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
                break;
            case 2:
                System.out.printf("%d - %d = %d", n1, n2, n1 - n2);
                break;
            case 3:
                System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
                break;
            case 4:
                System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
                break;
        }

        scanner.close();
    }
}

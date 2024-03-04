package atividade04;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1:");
        double n1 = scanner.nextDouble();
        System.out.println("Nota 2:");
        double n2 = scanner.nextDouble();
        System.out.println("Nota 3:");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.printf("Média %.2f. O aluno está aprovado!", media);
        } else {
            System.out.printf("Média %.2f. O aluno está reprovado.", media);
        }

        scanner.close();
    }
}
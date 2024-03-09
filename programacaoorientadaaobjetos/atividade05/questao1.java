package atividade05;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nota do Aluno %d: ", i + 1);
            double nota = scanner.nextDouble();

            if (nota >= 7) {
                System.out.printf("Aluno %d aprovado.\n", i + 1);
            } else {
                System.out.printf("Aluno %d reprovado.\n", i + 1);
            }
        }

        scanner.close();
    }
}
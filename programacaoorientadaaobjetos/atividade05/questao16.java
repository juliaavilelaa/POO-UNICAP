package atividade05;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        int it = 0;
        while (it < 5) {
            System.out.printf("Informe a nota do Aluno %d: ", it + 1);
            double nota = scanner.nextInt();

            if (nota >= 7) {
                aprovados++;
            }
            it++;
        }

        System.out.printf("%d alunos foram aprovados.", aprovados);

        scanner.close();
    }
}

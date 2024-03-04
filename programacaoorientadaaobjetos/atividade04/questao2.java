package atividade04;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade de uma pessoa: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Essa pessoa é maior de idade.");
        } else {
            System.out.println("Essa pessoa é menor de idade.");
        }

        scanner.close();
    }
}

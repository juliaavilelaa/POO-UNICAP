package atividade04;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o nome de duas pessoas.\nNome 1: ");
        String nome1 = scanner.nextLine();
        System.out.printf("Nome 2: ");
        String nome2 = scanner.nextLine();

        if (nome1.length() > nome2.length()) {
            System.out.printf("O nome %s é maior que %s.", nome1, nome2);
        } else if (nome1.length() == nome2.length()) {
            System.out.println("O tamanho dos nomes é igual!");
        } else {
            System.out.printf("O nome %s é maior que %s.", nome2, nome1);
        }

        scanner.close();
    }
}
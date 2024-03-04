package atividade04;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma idade: ");
        int idade = scanner.nextInt();

        if (idade == 0 || idade == 1) {
            System.out.println("Bebê.");
        } else if (idade > 1 && idade < 13) {
            System.out.println("Criança.");
        } else if (idade > 12 && idade < 19) {
            System.out.println("Adolescente.");
        } else {
            System.out.println("Adulto.");
        }

        scanner.close();
    }
}

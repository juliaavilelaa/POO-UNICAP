package atividade03;

import java.util.Scanner;

public class questao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        int dias = idade * 365;
        int meses = dias / 30;

        System.out.printf("Massa! Você já viveu %d dias e %d meses", dias, meses);

        scanner.close();
    }
}
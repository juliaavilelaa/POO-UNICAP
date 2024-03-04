package atividade03;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f %n", IMC);

        scanner.close();
    }
}
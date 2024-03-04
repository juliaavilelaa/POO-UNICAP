package atividade03;

import java.util.Scanner;

public class questao39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus Celsius: ");
        double Celsius = scanner.nextDouble();

        System.out.printf("Temperatura em Fahrenheit: %.2f", (Celsius * 9 / 5) + 32);

        scanner.close();
    }
}
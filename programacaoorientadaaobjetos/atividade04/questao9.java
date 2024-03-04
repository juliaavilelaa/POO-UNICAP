package atividade04;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe\nPeso: ");
        double peso = scanner.nextDouble();
        System.out.printf("Altura: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);
        if (IMC <= 18.5) {
            System.out.println("A pessoa está abaixo do peso.");
        } else if (IMC <= 24.9) {
            System.out.println("A pessoa está no peso ideal :)");
        } else if (IMC <= 24.9) {
            System.out.println("A pessoa está levemente acima do peso.");
        } else if (IMC <= 34.9) {
            System.out.println("A pessoa está com sobrepeso.");
        } else if (IMC <= 39.9) {
            System.out.println("A pessoa está obesa.");
        } else if (IMC >= 40) {
            System.out.println("A pessoa está muito obesa.");
        }

        scanner.close();
    }
}
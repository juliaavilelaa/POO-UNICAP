package atividade04;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro de 1 a 5.");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Muito insuficiente.");
                break;
            case 2:
                System.out.println("Insuficiente.");
                break;
            case 3:
                System.out.println("Regular.");
                break;
            case 4:
                System.out.println("Bom.");
                break;
            case 5:
                System.out.println("Muito bom.");
                break;
            default:
                System.out.println("Inválido.");
                break;
        }

        scanner.close();
    }
}

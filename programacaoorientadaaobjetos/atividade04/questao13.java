package atividade04;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome de um dia da semana:");
        String dia = scanner.nextLine();

        switch (dia.toLowerCase()) {
            case "segunda":
                System.out.println("Dia útil.");
                break;
            case "terca":
                System.out.println("Dia útil.");
                break;
            case "quarta":
                System.out.println("Dia útil.");
                break;
            case "quinta":
                System.out.println("Dia útil");
                break;
            case "sexta":
                System.out.println("Dia útil.");
                break;
            case "sabado":
                System.out.println("Fim de semana.");
                break;
            case "domingo":
                System.out.println("Fim de semana.");
                break;
        }

        scanner.close();
    }
}
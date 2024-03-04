package atividade03;
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int ano = scanner.nextInt();
        int idade = 2024-ano;

        System.out.println("Sua idade deve ser: " + idade);

        scanner.close();
    }
}
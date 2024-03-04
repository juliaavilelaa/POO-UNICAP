package atividade03;
import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println(numero + " " + frase);

        scanner.close();
    }
}
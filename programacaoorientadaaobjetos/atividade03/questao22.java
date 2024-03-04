package atividade03;
import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numeroString = scanner.nextLine();

        int numeroInt = Integer.parseInt(numeroString);
        int soma = numeroInt + 10;

        String numeroString2 = Integer.toString(soma);

        System.out.println(numeroString + " + 10 = " + numeroString2 + " (em String)");

        scanner.close();
    }
}
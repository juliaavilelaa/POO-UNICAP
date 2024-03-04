package atividade03;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();
        int tamanho = frase.length();

        System.out.println("A string tem " + tamanho + " caracteres");

        scanner.close();
    }
}
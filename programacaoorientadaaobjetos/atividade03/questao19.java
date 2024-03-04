package atividade03;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de uma cidade: ");
        String cidade = scanner.nextLine();

        if (cidade.startsWith("s") || cidade.startsWith("S")) {
            System.out.println("A cidade começa com a letra S!");
        } else {
            System.out.println("A cidade não começa com a letra S.");
        }

        scanner.close();
    }
}
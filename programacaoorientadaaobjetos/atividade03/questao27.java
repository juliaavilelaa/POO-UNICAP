package atividade03;
import java.util.Scanner;

public class questao27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mercadinho Augusto\n1. Sapato\n2. Computador (Sistema Linux)\n3. Ricota\nEscolha seu produto!");
        String produto = scanner.nextLine();

        if (produto.equals("sapato")) {
            System.out.println("O sapato custa R$139,90!");
        } else if (produto.equals("computador")) {
            System.out.println("O computador com sistema linux integrado custa R$7990,75!");
        } else if (produto.equals("ricota")) {
            System.out.println("A ricota custa R$13,40!");
        }

        scanner.close();
    }
}
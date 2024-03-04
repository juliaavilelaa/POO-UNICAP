package atividade03;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Seu nome ao contrário é " + sobrenome + " " + nome + "!");

        scanner.close();
    }
}

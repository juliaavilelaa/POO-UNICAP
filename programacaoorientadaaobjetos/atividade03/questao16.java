package atividade03;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        if (nome.length() > 5) {
            System.out.println("Seu nome contém mais de 5 caracteres.");
        } else if (nome.length() == 5) {
            System.out.println("Seu nome contém exatamente 5 caracteres.");
        } else {
            System.out.println("Seu nome contém menos de 5 caracteres.");
        }

        scanner.close();
    }
}
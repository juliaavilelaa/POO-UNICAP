package atividade03;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Bem-vindo(a), " + nome + "!");
        scanner.close();
    }
}
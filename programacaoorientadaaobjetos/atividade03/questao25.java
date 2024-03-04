package atividade03;
import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o ano do seu nascimento? ");
        int ano = scanner.nextInt();

        System.out.println("Bem-vindo ao nosso programa, nascido em " + ano + "!");

        scanner.close();
    }
}
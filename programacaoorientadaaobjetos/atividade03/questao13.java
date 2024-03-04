package atividade03;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int cachorrao = scanner.nextInt();

        if (cachorrao < 0) {
            System.out.println(cachorrao + " é um número negativo");
        } else if (cachorrao == 0) {
            System.out.println(cachorrao + " é neutro");
        } else {
            System.out.println(cachorrao + " é um número positivo");
        }
        scanner.close();
    }
}
package atividade03;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + soma);

        scanner.close();
    }
}

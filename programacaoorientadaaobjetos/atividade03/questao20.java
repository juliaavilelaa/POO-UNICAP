package atividade03;
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números decimais.");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.printf("O resto da divisão entre %.2f e %.2f é igual a %.2f", num1, num2, num1%num2);
        scanner.close();
    }
}
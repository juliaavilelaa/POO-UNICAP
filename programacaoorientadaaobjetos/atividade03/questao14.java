package atividade03;
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println(num2 + " é maior que " + num1);
        }

        scanner.close();
    }
}
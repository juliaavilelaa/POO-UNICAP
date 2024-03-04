package atividade03;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        double num = scanner.nextDouble();

        double quadrado = Math.pow(num, 2);
        System.out.println(num + "² = " + quadrado);

        scanner.close();
    }
}

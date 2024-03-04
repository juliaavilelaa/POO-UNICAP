package atividade03;
import java.util.Scanner;

public class questao32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Informe o valor do raio: ");
        double r = scanner.nextInt();

        System.out.printf("Perímetro da circunferência: %.2f", 2*pi*r);

        scanner.close();
    }
}
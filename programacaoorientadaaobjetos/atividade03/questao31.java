package atividade03;
import java.util.Scanner;

public class questao31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe valores de base e altura para calcular a área de um triângulo: ");
        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        System.out.printf("Área do triângulo: %d", (base*altura)/2);

        scanner.close();
    }
}
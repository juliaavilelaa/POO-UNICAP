package atividade03;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();

        float numeroDecimal = (float)numeroInt;

        System.out.println("O número convertido para decimal é: " + numeroDecimal);

        scanner.close();
    }
}

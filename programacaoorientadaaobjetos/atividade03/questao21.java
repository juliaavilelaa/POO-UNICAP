package atividade03;
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        double numero = scanner.nextDouble();

        int numeroInt = (int)numero;

        System.out.println("Número convertido para inteiro: " + numeroInt);

        scanner.close();
    }
}
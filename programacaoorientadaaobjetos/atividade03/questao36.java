package atividade03;

import java.util.Scanner;

public class questao36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor em reais e a cotação do dólar: ");
        double valor = scanner.nextDouble();
        double cotacao = scanner.nextDouble();

        double dolar = valor * cotacao;
        System.out.printf("Na contação informada, o valor R$%.2f (reais) é $%.2f (dólares).", valor, dolar);

        scanner.close();
    }
}
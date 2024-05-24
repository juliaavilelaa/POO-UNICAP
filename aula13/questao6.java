package aula13;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            
            try {
                conta.sacar(valorSaque);
                System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
}

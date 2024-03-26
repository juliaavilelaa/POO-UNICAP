package atividade08;

public class questao1 {
    public static void main(String[] args) {
        ContaBancaria novaConta = new ContaBancaria();

        novaConta.setNome("Júlia");
        novaConta.setNumeroConta(1227);
        novaConta.setSaldo(13.97);
        System.out.println("Nome do titular da conta: " + novaConta.getNome());
        System.out.println("Número da conta: " + novaConta.getNumeroConta());
        System.out.println("Saldo: " + novaConta.getSaldo());
    }
}
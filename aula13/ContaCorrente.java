package aula13;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }
}

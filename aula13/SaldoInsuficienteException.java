package aula13;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar saque.");
    }
}

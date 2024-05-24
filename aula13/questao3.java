package aula13;

import java.util.*;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe dois números para efetuar sua divisão.");
            System.out.printf("Número 1: ");
            double n1 = scanner.nextDouble();
            System.out.printf("Número 2: ");
            double n2 = scanner.nextDouble();
            double div = n1 / n2;
            System.out.println("Resultado = " + div);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por 0 não aceita.");
        } catch (InputMismatchException e) {
            System.out.println("Valor informado não é numérico.");
        } finally {
            scanner.close();
        }
    }
}

package atividade03;

import java.util.Scanner;

public class questao37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor decimal: ");
        double numero = scanner.nextDouble();

        if (numero % 1 > 0.5) {
            System.out.println("Valor aproximado = " + Math.ceil(numero));
        } else {
            System.out.println("Valor aproximado = " + Math.floor(numero));
        }

        scanner.close();
    }
}
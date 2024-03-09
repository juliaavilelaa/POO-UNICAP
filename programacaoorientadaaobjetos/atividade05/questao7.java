package atividade05;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int num = scanner.nextInt();

        int invertido = 0;

        while (num != 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        System.out.println(invertido);

        scanner.close();
    }
}

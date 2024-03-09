package atividade05;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int digitos = 0;
        int num = 1;

        System.out.println("Informe numeros inteiros (-1 para parar)");
        while (num != -1) {
            num = scanner.nextInt();
            total += num;
            digitos++;
        }
        System.out.printf("Media dos numeros digitados: %d", total / digitos);

        scanner.close();
    }
}

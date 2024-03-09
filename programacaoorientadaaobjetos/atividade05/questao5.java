package atividade05;

import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.printf("Fizz ");
            } else if (i % 5 == 0) {
                System.out.printf("Buzz ");
            } else {
                System.out.printf("%d ", i);
            }
        }

        scanner.close();
    }
}

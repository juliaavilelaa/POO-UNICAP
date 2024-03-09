package atividade05;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int divisivelPor2 = 0;
        int divisivelPor3 = 0;
        int divisivelPor5 = 0;

        System.out.println("Digite numeros inteiros (0 para parar):");
        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }
            if (numero % 2 == 0) {
                divisivelPor2++;
            }
            if (numero % 3 == 0) {
                divisivelPor3++;
            }
            if (numero % 5 == 0) {
                divisivelPor5++;
            }
        }

        System.out.println("Numeros divisiveis por 2: " + divisivelPor2);
        System.out.println("Numeros divisiveis por 3: " + divisivelPor3);
        System.out.println("Numeros divisiveis por 5: " + divisivelPor5);

        scanner.close();
    }
}

package aula13;

import java.util.*;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int count = 0;

        try {
            System.out.println("Digite valores inteiros. (0 (zero) para encerrar)");
            int val = scanner.nextInt();
    
            while (true) {
                if (val == 0 || count == 10) {
                    vetor[count] = val;
                    break;
                }
                vetor[count] = val;
                count++;
                val = scanner.nextInt();
            }
            System.out.println("Vetor: ");
            for (int i = 0; i < count; i++) {
                System.out.print(vetor[i] + " ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capacidade do vetor atingida");
        } catch (InputMismatchException e) {
            System.out.println("Valor informado não é numérico");
        } finally {
            scanner.close();
        }
    }
}

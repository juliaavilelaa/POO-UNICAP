package aula13;

import java.util.*;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int index;

        System.out.println("Digite um nome:");
        nome = scanner.next();
        System.out.println("Digite um número:");
        index = scanner.nextInt();

        try {
            System.out.println(nome.charAt(index));
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }

        scanner.close();
    }
}

package aula13;

import java.util.*;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        System.out.println("Informe a idade de 10 pessoas.");
        for (int i = 0; i < 10; i++) {
            int idade = scanner.nextInt();
            idades.add(idade);
        }

        System.out.println("Agora, informe um número qualquer.");
        int pos = scanner.nextInt();
        try {
            idades.remove(pos);
            System.out.println("Idade removida na posição informada.");
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }

        scanner.close();
    }
}

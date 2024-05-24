package aula12;

import java.util.*;

public class MainConjuntoDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um conjunto de palavras separadas por vírgula:");
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras(scanner.nextLine());

        System.out.println("Agora, digite um novo conjunto de palavras:");
        String novoConjunto = scanner.nextLine();

        if (conjunto.contemTodas(novoConjunto)) {
            System.out.println("Todas as palavras do novo conjunto estão contidas no conjunto original!");
        } else {
            System.out.println("Há palavras que não estão no primeiro conjunto.");
        }

        scanner.close();
    }
}

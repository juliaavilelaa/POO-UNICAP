package atividade08;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro("Declínio de um Homem", "Osamu Dazai", 1948);

        int op;

        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Consultar nome do livro");
            System.out.println("2 - Consultar nome do autor");
            System.out.println("3 - Consultar ano de lançamento");
            System.out.println("0 - Sair");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Nome do livro: " + livro.getTitulo());
                    break;
                case 2:
                    System.out.println("Nome do autor: " + livro.getAutor());
                    break;
                case 3:
                    System.out.println("Ano de lançamento: " + livro.getAno());
                    break;
                case 0:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 0);

        scanner.close();
    }
}

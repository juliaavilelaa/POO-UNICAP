package atividade08;

import java.util.*;

public class questao3 {
    public static void main(String[] args) {
        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
        Scanner scanner = new Scanner(System.in);
        int op;
        String item;

        do {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Adicionar itens ao carrinho de compras");
            System.out.println("2 - Remover um item do carrinho de compras");
            System.out.println("3 - Listar itens no carrinho de compras");
            System.out.println("0 - Sair");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("O que você deseja adicionar?");
                    item = scanner.nextLine();
                    meuCarrinho.adicionarItem(item);
                    break;
                case 2:
                    System.out.println("O que você deseja remover?");
                    item = scanner.nextLine();
                    if (meuCarrinho.checarItem(item)) {
                        meuCarrinho.removerItem(item);
                        System.out.println(item + " foi removido do carrinho");
                    } else {
                        System.out.println("Esse item não está no carrinho!");
                    }
                    break;
                case 3:
                    System.out.println("Itens no carrinho de compras:");
                    meuCarrinho.listarItens();
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
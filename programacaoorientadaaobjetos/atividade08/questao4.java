package atividade08;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        BancoDeDados banco = new BancoDeDados("senha123");
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String chave, valor;

        do {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Adicionar registro");
            System.out.println("2 - Atualizar registro");
            System.out.println("3 - Excluir registro");
            System.out.println("4 - Consultar registro");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a chave do registro:");
                    chave = scanner.nextLine();
                    System.out.println("Digite o valor do registro:");
                    valor = scanner.nextLine();
                    System.out.println("Digite a senha:");
                    String senha = scanner.nextLine();
                    if (banco.adicionarRegistro(chave, valor, senha)) {
                        System.out.println("Registro adicionado com sucesso.");
                    } else {
                        System.out.println("Senha incorreta. Registro não adicionado.");
                    }
                    break;
                case 2:
                    System.out.println("Digite a chave do registro que deseja atualizar:");
                    chave = scanner.nextLine();
                    System.out.println("Digite o novo valor do registro:");
                    valor = scanner.nextLine();
                    System.out.println("Digite a senha:");
                    senha = scanner.nextLine();
                    if (banco.atualizarRegistro(chave, valor, senha)) {
                        System.out.println("Registro atualizado com sucesso.");
                    } else {
                        System.out.println("Senha incorreta ou registro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite a chave do registro que deseja excluir:");
                    chave = scanner.nextLine();
                    System.out.println("Digite a senha:");
                    senha = scanner.nextLine();
                    if (banco.excluirRegistro(chave, senha)) {
                        System.out.println("Registro excluído com sucesso.");
                    } else {
                        System.out.println("Senha incorreta ou registro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite a chave do registro que deseja consultar:");
                    chave = scanner.nextLine();
                    valor = banco.consultarRegistro(chave);
                    if (valor != null) {
                        System.out.println("Valor do registro: " + valor);
                    } else {
                        System.out.println("Registro não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

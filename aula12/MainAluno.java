package aula12;

import java.util.*;

public class MainAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();
        String nome, curso;
        int matricula, idade;

        System.out.println("Efetue o cadastro de 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aluno %d\n", i+1);
            System.out.printf("Nome: ");
            nome = scanner.next();
            System.out.printf("Número de matrícula: ");
            matricula = scanner.nextInt();
            System.out.printf("Idade: ");
            idade = scanner.nextInt();
            System.out.printf("Curso: ");
            curso = scanner.next();

            Aluno aluno = new Aluno(matricula, nome, idade, curso);
            cadastro.adicionarAluno(aluno);
        }

        System.out.println("\nLista de Alunos:");
        cadastro.exibirLista();

        scanner.close();
    }
}

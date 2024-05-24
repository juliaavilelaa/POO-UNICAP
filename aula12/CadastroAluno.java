package aula12;

import java.util.*;

public class CadastroAluno {
    ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

    public void adicionarAluno(Aluno aluno) {
        this.listaDeAlunos.add(aluno);
    }

    public void exibirLista() {
        for (Aluno aluno : listaDeAlunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println();
        }
    }
    
}

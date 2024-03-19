package atividade07;

public class questao5 {
    public static void main(String[] args) {
        Aluno augustinhoAluno = new Aluno("Augusto", 123456789);

        augustinhoAluno.setNota1(10);
        augustinhoAluno.setNota2(6);
        augustinhoAluno.setNota3(8);
        augustinhoAluno.setNota4(9);

        System.out.println("Média: " + augustinhoAluno.calcularMedia());

        augustinhoAluno.setNota2(10);

        System.out.println("Média após alteração da segunda nota: " + augustinhoAluno.calcularMedia());
    }

}

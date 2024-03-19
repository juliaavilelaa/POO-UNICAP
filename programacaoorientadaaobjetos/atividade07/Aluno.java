package atividade07;

public class Aluno {
    String nome;
    int cpf;
    int nota1;
    int nota2;
    int nota3;
    int nota4;

    public Aluno(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    int calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
    }
}

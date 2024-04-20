public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, String inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
    }

    public void lecionar() {}

    public void criarAtividade() {}

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}

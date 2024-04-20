public class Funcionario {
    private String nome;
    private String inscricao;
    private double Salario;
    private String turno;

    public void horariosDisponiveis() {}

    public void horarioTrabalho() {}

    public void informacoesFuncionario() {}

    public void funcaoDesempenhar() {}

    public Funcionario(String nome, String inscricao, double salario, String turno) {
        this.nome = nome;
        this.inscricao = inscricao;
        Salario = salario;
        this.turno = turno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getInscricao() {
        return inscricao;
    }
    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    
}

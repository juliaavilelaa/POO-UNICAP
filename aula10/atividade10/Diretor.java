public class Diretor extends Funcionario {
    private String segTurno;

    public Diretor(String nome, String inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
        
    }

    public void criarDescontos() {}

    public void encomendarFardas() {}

    public void gerenciarProfessores() {}

    public String getSegTurno() {
        return segTurno;
    }

    public void setSegTurno(String segTurno) {
        this.segTurno = segTurno;
    }

}

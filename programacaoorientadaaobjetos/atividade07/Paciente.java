package atividade07;

public class Paciente {
    String codigo;
    String nome;
    String dataNascimento;
    char sexo;
    String planoSaude;
    String alergia;
    String tipoSanguineo;

    public Paciente(String codigo, String nome, String dataNascimento, char sexo, String planoSaude, String alergia,
            String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Plano de Saúde: " + planoSaude);
        System.out.println("Alergia: " + alergia);
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
    }

    public void trocarDados(String codigo, String nome, String dataNascimento, char sexo, String planoSaude,
            String alergia, String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }
}

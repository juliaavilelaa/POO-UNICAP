package atividade07;

// codigo,nome,sexo,especialidade,endereco.

public class Medico {
    int codigo;
    String nome;
    char sexo;
    String especialidade;
    Endereco endereco;

    public Medico(int codigo, String nome, char sexo, String especialidade, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Endereço:");
        System.out.println("Rua: " + endereco.rua);
        System.out.println("Número: " + endereco.numero);
        System.out.println("Complemento: " + endereco.complemento);
        System.out.println("Bairro: " + endereco.bairro);
        System.out.println("Cidade: " + endereco.cidade);
        System.out.println("UF: " + endereco.uf);
        System.out.println("CEP: " + endereco.cep);
    }

    public void trocarDados(int codigo, String nome, char sexo, String especialidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
    }
}

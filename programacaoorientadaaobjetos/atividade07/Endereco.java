package atividade07;

public class Endereco {
    String rua;
    int numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    int cep;

    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String UF, int CEP) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = UF;
        this.cep = CEP;
    }

    public void trocarEndereco(String rua, int numero, String complemento, String bairro, String cidade, String UF,
            int CEP) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = UF;
        this.cep = CEP;
    }
}

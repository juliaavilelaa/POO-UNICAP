package atividade08;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidade;

    public void acelerarCarro(int num) {
        this.velocidade += num;
    }

    public void desacelerarCarro(int num) {
        int verificacao = this.velocidade -= num;
        if (verificacao < 0) {
            this.velocidade = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}

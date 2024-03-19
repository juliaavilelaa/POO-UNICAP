package atividade07;

public class Lutador {
    String nome;
    int energia;
    int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void reduzirEnergia(int golpes) {
        this.energia -= golpes;
    }

    int aplicarGolpe(int golpes) {
        return forca * golpes;
    }
}

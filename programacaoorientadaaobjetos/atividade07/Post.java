package atividade07;

public class Post {
    String texto;
    String link;
    int numeroCurtidas;
    int numeroCompartilhamentos;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
    }

    public void curtir() {
        this.numeroCurtidas += 1;
    }

    public void compartilhar() {
        this.numeroCompartilhamentos += 1;
    }

}

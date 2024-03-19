package atividade07;

public class questao4 {
    public static void main(String[] args) {
        Post meuPost = new Post("Eu e meu pai Augusto <3", "term.ooo");

        meuPost.curtir();
        meuPost.curtir();
        meuPost.curtir();

        System.out.println("Número de curtidas: " + meuPost.numeroCurtidas);

        meuPost.compartilhar();
        meuPost.compartilhar();

        System.out.println("Número de compartilhamentos: " + meuPost.numeroCompartilhamentos);
    }
}

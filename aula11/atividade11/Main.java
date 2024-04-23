package aula11.atividade11;

public class Main {
    public static void main(String[] args) {
        Revista revista = new Revista("Capricho", 2017, 8, "03/04/2024", 19);
        System.out.println(revista.calcular_multa());

        DVD dvd = new DVD("Madagascar", 2005, 5, "12/04/2024", 96);
        System.out.println(dvd.calcular_multa());

        Livro livro = new Livro("Declínio de um Homem", 1948, 3, "20/02/2024", "Osamu Dazai");
        System.out.println(livro.calcular_multa());
    }
}

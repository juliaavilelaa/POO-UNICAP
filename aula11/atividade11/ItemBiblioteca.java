package aula11.atividade11;

public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    private int numCopiasDisponiveis;
    private String dataDevolucao;

    public ItemBiblioteca(String titulo, int anoPublicacao, int numCopiasDisponiveis, String dataDevolucao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numCopiasDisponiveis = numCopiasDisponiveis;
        this.dataDevolucao = dataDevolucao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumCopiasDisponiveis() {
        return numCopiasDisponiveis;
    }

    public void setNumCopiasDisponiveis(int numCopiasDisponiveis) {
        this.numCopiasDisponiveis = numCopiasDisponiveis;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}

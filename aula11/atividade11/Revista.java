package aula11.atividade11;

import java.time.LocalDate;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int numCopiasDisponiveis, String dataDevolucao, int edicao) {
        super(titulo, anoPublicacao, numCopiasDisponiveis, dataDevolucao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public double calcular_multa(){
        LocalDate hoje = LocalDate.now();
        double multa = 0;
        String[] data = getDataDevolucao().split("/");
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);
        long totalDias = (ano * 365) + (mes * 30) + dia;
        long totalHoje = (hoje.getYear() * 365) + (hoje.getMonthValue() * 30) + hoje.getDayOfMonth();
        if (totalDias < totalHoje){
            multa = (totalHoje - totalDias) * 0.1;
        }
        return multa;
    }
}

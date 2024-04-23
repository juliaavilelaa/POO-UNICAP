package aula11.atividade11;

import java.time.LocalDate;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublicacao, int numCopiasDisponiveis, String dataDevolucao, String autor) {
        super(titulo, anoPublicacao, numCopiasDisponiveis, dataDevolucao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
        if(totalDias < totalHoje){
            multa = (totalHoje - totalDias) * 0.2;
        }
        return multa;
    }
    
}

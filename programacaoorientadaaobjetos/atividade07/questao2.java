package atividade07;

public class questao2 {
    public static void main(String[] args) {
        Endereco dadosEndereco = new Endereco("Rua 1", 01, "apto 101", "Bairro 1", "Recife", "PE", 10110010);
        Medico dadosMedico = new Medico(01, "Marcus", 'M', "Cirurgião", dadosEndereco);

        System.out.println("Informações do Médico antes da troca: ");
        dadosMedico.imprimirDados();

        dadosMedico.trocarDados(02, "Hannah", 'F', "Pediatra");
        dadosEndereco.trocarEndereco("Rua 2", 02, "apto 202", "Bairro 2", "Ilhéus", "BA", 20220020);

        System.out.println("\nInformações após a troca:");
        dadosMedico.imprimirDados();
    }
}

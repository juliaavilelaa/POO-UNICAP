package atividade07;

public class questao1 {
    public static void main(String[] args) {
        Paciente dadosPaciente = new Paciente("1", "Júlia", "03/10/2004",
                'F', "Sul América", "Nenhuma", "A+");

        dadosPaciente.imprimirDados();

        dadosPaciente.trocarDados("2", "Vicente", "16/12/1969",
                'M', "Sul América", "Poeira", "AB+");

        System.out.println();
        dadosPaciente.imprimirDados();
    }
}
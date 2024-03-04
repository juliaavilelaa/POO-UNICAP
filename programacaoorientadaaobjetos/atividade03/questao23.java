package atividade03;
import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data (no formato dd/mm/aaaa): ");
        String data = scanner.nextLine();

        String[] partes = data.split("/");

        String diaString = partes[0];
        String mesString = partes[1];
        String anoString = partes[2];

        int dia = Integer.parseInt(diaString);
        int mes = Integer.parseInt(mesString);
        int ano = Integer.parseInt(anoString);

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

        scanner.close();
    }
}
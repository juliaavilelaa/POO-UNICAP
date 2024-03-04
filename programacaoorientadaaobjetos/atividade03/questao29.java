package atividade03;
import java.util.Scanner;

public class questao29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu e-mail: ");
        String email = scanner.nextLine();

        int index1 = email.indexOf('@');
        int index2 = email.indexOf('.');

        String servico = email.substring(index1+1, index2);
        System.out.println("Olá, usuário do serviço de e-mail " + servico + "!");

        scanner.close();
    }
}
package atividade03;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        String idadeString = scanner.nextLine();

        int idade = Integer.parseInt(idadeString);

        System.out.println("Idade em número inteiro: " + idade);
        
        scanner.close();
    }
}

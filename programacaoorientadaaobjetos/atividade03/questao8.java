package atividade03;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números separados por espaço: ");
        
        String entrada = scanner.nextLine();
        String[] numeros = entrada.split(" ");

        int quantidade = numeros.length;

        System.out.println("Quantidade de números digitados: " + quantidade);

        scanner.close();
    }
}

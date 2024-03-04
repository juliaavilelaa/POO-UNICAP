package atividade03;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da base do retângulo: ");
        int base = scanner.nextInt();

        System.out.println("Digite o valor da altura do retângulo: ");
        int altura = scanner.nextInt();

        System.out.println("A área do retângulo é igual a " + base*altura);

        scanner.close();
    }
}
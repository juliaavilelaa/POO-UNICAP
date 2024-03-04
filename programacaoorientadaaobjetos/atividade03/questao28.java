package atividade03;
import java.util.Scanner;

public class questao28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor de um número: ");
        int numero = scanner.nextInt();

        System.out.printf("O dobro de %d é %d.", numero, 2*numero);
    
        scanner.close();
    }
}
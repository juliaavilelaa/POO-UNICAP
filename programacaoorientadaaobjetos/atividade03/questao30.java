package atividade03;
import java.util.Scanner;

public class questao30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("Soma = %d\nDiferença = %d\nProduto = %d\nQuociente = %d", num1+num2, num1-num2, num1*num2, num1/num2);
        
        scanner.close();
    }
}
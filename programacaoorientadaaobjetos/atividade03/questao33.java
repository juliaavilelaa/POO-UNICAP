package atividade03;
import java.util.Scanner;

public class questao33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe valores de base e altura: ");
        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        System.out.printf("O perímetro do retângulo é %d", 2*(base+altura));

        scanner.close();
    }
}

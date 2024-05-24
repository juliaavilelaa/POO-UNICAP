package aula13;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Triangulo triangulo = new Triangulo(3, 4, 5);
            triangulo.setL1(10);
            System.out.println("Digite 3 valores: ");
            double l1 = scanner.nextDouble();
            double l2 = scanner.nextDouble();
            double l3 = scanner.nextDouble();
            
            Triangulo triangulo2 = new Triangulo(l1, l2, l3);
        } catch (DimensoesInvalidasException e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}

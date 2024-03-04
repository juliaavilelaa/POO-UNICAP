package atividade03;
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String animal = scanner.nextLine();

        System.out.println("Você digitou o animal " + animal);

        scanner.close();
    }
}

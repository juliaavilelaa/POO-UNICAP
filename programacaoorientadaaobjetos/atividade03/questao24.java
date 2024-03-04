package atividade03;
import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Agora, digite o estado da sua cidade: ");
        String estado = scanner.nextLine();

        System.out.println("Você mora em " + cidade + ", " + estado + ".");

        scanner.close();
    }
}
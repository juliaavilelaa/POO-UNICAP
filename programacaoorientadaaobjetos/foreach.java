import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[5];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i : values) {
            System.out.println(i);
        }

        System.out.println("Informe o índice do elemento a ser removido: ");
        int index = scanner.nextInt();

        scanner.close();
    }
}
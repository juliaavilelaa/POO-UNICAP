import java.util.Scanner;

public class entradaPadrao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int inteiro = leitor.nextInt();
        double real = leitor.nextDouble();
        boolean logico = leitor.nextBoolean();
        leitor.nextLine();
        String cadeia = leitor.nextLine();

        System.out.println(inteiro);
        System.out.println(real);
        System.out.println(logico);
        System.out.println(cadeia);
        leitor.close();
    }
}
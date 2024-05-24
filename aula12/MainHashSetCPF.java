package aula12;

import java.util.*;;

public class MainHashSetCPF {
    public static void main(String[] args) {
        HashSet<String> listaCPF = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o CPF %d: ", i+1);
            listaCPF.add(scanner.nextLine());
        }
        System.out.println();
        System.out.println("Lista de CPFs:");
        for (String string : listaCPF) {
            System.out.println(string);
        }

        scanner.close();
    }
}

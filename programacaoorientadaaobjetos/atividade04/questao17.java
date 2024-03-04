package atividade04;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("==Informe seu estado civil==\n- solteiro;\n- casado;\n- divorciado;\n- viuvo.\n");
        String estadoCivil = scanner.nextLine();

        switch (estadoCivil) {
            case "solteiro":
                System.out.println("Você é solteiro.");
                break;
            case "casado":
                System.out.println("Você é casado.");
                break;
            case "divorciado":
                System.out.println("Você é divorciado.");
                break;
            case "viuvo":
                System.out.println("Você é viúvo.");
                break;
        }

        scanner.close();
    }
}

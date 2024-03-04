package atividade03;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu estado civil? %n- Solteiro %n- Casado %n- Divorciado %n- Viúvo");
        String estado = scanner.nextLine();

        if (estado.equals("solteiro")) {
            System.out.println("Você é solteiro(a)");
        } else if (estado.equals("casado")){
            System.out.println("Você é casado(a)");
        } else if (estado.equals("divorciado")) {
            System.out.println("Você é divorciado(a)");
        } else if (estado.equals("viuvo")) {
            System.out.println("Você é viúvo(a)");
        }

        scanner.close();
    }
}
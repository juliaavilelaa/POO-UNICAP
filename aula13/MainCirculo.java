package aula13;

import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            circulo.setRaio(number);
        } catch (ExcecaoRaioInvalido e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}

package atividade08;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Carro meuCarro = new Carro();

        System.out.println("Informe a marca do carro: ");
        String marca = s.nextLine();
        meuCarro.setMarca(marca);

        System.out.println("Informe o modelo do carro: ");
        String modelo = s.nextLine();
        meuCarro.setModelo(modelo);

        System.out.println("Informe o ano de fabricação do carro: ");
        int ano = s.nextInt();
        meuCarro.setAnoFabricacao(ano);

        System.out.println("Informe a velocidade atual do carro: ");
        int velocidade = s.nextInt();
        meuCarro.setVelocidade(velocidade);

        int op, num;
        do {
            System.out.println("Você deseja: ");
            System.out.println("1 - Desacelerar o carro");
            System.out.println("2 - Acelerar o carro");
            System.out.println("0 - Sair");

            op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe quanto de velocidade você irá reduzir: ");
                    num = s.nextInt();
                    meuCarro.desacelerarCarro(num);
                    System.out.println("Velocidade atual do carro após desaceleração: " + meuCarro.getVelocidade());
                    break;
                case 2:
                    System.out.println("Informe quanto de velocidade você irá aumentar: ");
                    num = s.nextInt();
                    meuCarro.acelerarCarro(num);
                    System.out.println("Velocidade atual do carro após aceleração: " + meuCarro.getVelocidade());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        } while (op != 0);
        s.close();
    }
}

package atividade05;

public class questao9 {
    public static void main(String[] args) {
        int produto = 1;
        int it = 1;

        while (it <= 5) {
            produto *= it;
            it++;
        }

        System.out.println(produto);
    }
}

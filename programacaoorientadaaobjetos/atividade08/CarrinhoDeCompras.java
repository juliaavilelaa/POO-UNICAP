package atividade08;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    public void removerItem(String item) {
        this.itens.remove(item);
    }

    public boolean checarItem(String item) {
        return this.itens.contains(item);
    }

    public void listarItens() {
        for (String item : this.itens) {
            System.out.println(item);
        }
    }

}

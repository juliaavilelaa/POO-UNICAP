package atividadeextra;

public class Teste {
    public static void main(String[] args) {
        PilhaDeCaixas pilha = new PilhaDeCaixas(1000);

        Caixa caixaUm = new Caixa("forte", "tijolos", 80, 400);
        Caixa caixaDois = new Caixa("forte", "placas", 50, 350);
        CaixaFragil caixaTres = new CaixaFragil("fragil", "vidro", 20, 200, 15);
        CaixaFragil caixaQuatro = new CaixaFragil("fragil", "joias", 5, 100, 8);
        Caixa caixaCinco = new Caixa("forte", "ferramentas", 10, 250);


        boolean empilhou = pilha.empilhar(caixaUm);
        if (empilhou) {
            System.out.println("Caixa empilhada.\n");
        } else {
            System.out.println("Caixa não empilhada.\n");
        }

        pilha.exibirDados();
        System.out.println();

        empilhou = pilha.empilhar(caixaDois);
        if (empilhou) {
            System.out.println("Caixa empilhada.\n");
        } else {
            System.out.println("Caixa não empilhada.\n");
        }

        Caixa caixaDesempilhada = pilha.desempilhar();
        System.out.println("Caixa de " + caixaDesempilhada.getConteudo() + " desempilhada.\n");

        empilhou = pilha.empilhar(caixaTres);
        if (empilhou) {
            System.out.println("Caixa empilhada.\n");
        } else {
            System.out.println("Caixa não empilhada.\n");
        }

        empilhou = pilha.empilhar(caixaQuatro);
        if (empilhou) {
            System.out.println("Caixa empilhada.\n");
        } else {
            System.out.println("Caixa não empilhada.\n");
        }

        empilhou = pilha.empilhar(caixaCinco);
        if (empilhou) {
            System.out.println("Caixa empilhada.\n");
        } else {
            System.out.println("Caixa não empilhada.\n");
        }

        pilha.exibirDados();
        System.out.println();
    }
}

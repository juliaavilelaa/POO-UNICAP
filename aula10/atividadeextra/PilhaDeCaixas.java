package atividadeextra;

import java.util.Stack;

public class PilhaDeCaixas {
    private int alturaMax;
    private Stack<Caixa> pilha = new Stack<>();

    public PilhaDeCaixas(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public Stack<Caixa> getPilha() {
        return pilha;
    }

    public void setPilha(Stack<Caixa> pilha) {
        this.pilha = pilha;
    }

    public double getAlturaAtual() {
        double alturaTotal = 0;
        for (Caixa caixa : this.pilha) {
            alturaTotal += caixa.getAltura();
        }
        return alturaTotal;
    }

    public double getPesoTotal() {
        double pesoTotal = 0;
        for (Caixa caixa : this.pilha) {
            pesoTotal += caixa.getPeso();
        }
        return pesoTotal;
    }

    public boolean empilhar(Caixa caixa) {
        if (caixa.getAltura() + getAlturaAtual() <= this.alturaMax) { 
            if (caixa instanceof CaixaFragil && !this.pilha.isEmpty()) {
                double pesoAcima = this.pilha.peek().getPeso();
                if (((CaixaFragil) caixa).getPesoSuportado() < pesoAcima) {
                    return false;
                }
            }
            this.pilha.push(caixa);
            return true;
        } 
        return false;
    }

    public Caixa desempilhar() {
        if (this.pilha.isEmpty()) {
            System.out.println("Não há caixas na pilha.");
            return null;
        } 
        return this.pilha.pop();
    }

    public void exibirDados() {
        for (int i = this.pilha.size() - 1; i >= 0; i--) {
            this.pilha.get(i).exibirEtiqueta();
        }
        System.out.println("Altura atual da pilha: " + this.getAlturaAtual());
        System.out.println("Peso total da pilha: " + this.getPesoTotal());
    }
}

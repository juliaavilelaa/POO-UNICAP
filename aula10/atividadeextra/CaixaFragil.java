package atividadeextra;

public class CaixaFragil extends Caixa {
    private double pesoSuportado;

    public CaixaFragil(String identificador, String conteudo, double peso, double altura, double pesoSuportado) {
        super(identificador, conteudo, peso, altura);
        this.pesoSuportado = pesoSuportado;
    }

    @Override
    public void exibirEtiqueta() {
        super.exibirEtiqueta();
        System.out.println("Peso máximo suportado: " + this.getPesoSuportado());
    }

    public double getPesoSuportado() {
        return pesoSuportado;
    }

    public void setPesoSuportado(double pesoSuportado) {
        this.pesoSuportado = pesoSuportado;
    }

    public CaixaFragil(String identificador, String conteudo, double peso, double altura) {
        super(identificador, conteudo, peso, altura);
    }
}

package aula13;
// criar nossa própria exceção
public class ExcecaoRaioInvalido extends Exception {
    public ExcecaoRaioInvalido() {
        super("O raio não pode ser 0 ou negativo.");
    }
}

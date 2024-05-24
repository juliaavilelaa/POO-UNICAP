package aula13;

public class Circulo {
    private double raio;

    public void setRaio(double raio) throws ExcecaoRaioInvalido {
        if (raio <= 0) {
            throw new ExcecaoRaioInvalido();
        }
        this.raio = raio;
    }
}

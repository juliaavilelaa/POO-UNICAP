package aula13;

public class Triangulo {
    private double l1;
    private double l2;
    private double l3;

    public Triangulo(double l1, double l2, double l3) throws DimensoesInvalidasException {
        if (!isTrianguloValido(l1, l2, l3)) {
            throw new DimensoesInvalidasException();
        }
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public void setL1 (double l1) throws DimensoesInvalidasException {
        if (!isTrianguloValido(l1, this.l2, this.l3)) {
            throw new DimensoesInvalidasException();
        }
        this.l1 = l1;
    }

    private boolean isTrianguloValido (double l1, double l2, double l3) {
        return l1 < l2 + l3 && l1 > Math.abs(l2 - l3) && l2 < l1 + l3 && l2 > Math.abs(l1 - l3) &&
        l3 < l1 + l2 && l3 > Math.abs(l1 - l2);
    }
}

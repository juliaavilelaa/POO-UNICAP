package atividade07;

public class questao3 {
    public static void main(String[] args) {
        Lutador ryuLutador = new Lutador("Ryu", 100, 10);
        Lutador bisonLutador = new Lutador("Bison", 100, 12);

        bisonLutador.reduzirEnergia(ryuLutador.aplicarGolpe(3));

        System.out.println("Energia de Bison após golpes de Ryu: " + bisonLutador.energia);

        ryuLutador.reduzirEnergia(bisonLutador.aplicarGolpe(8));

        System.out.println("\nEnergia de Ryu após golpes de Bison: " + ryuLutador.energia);
    }
}

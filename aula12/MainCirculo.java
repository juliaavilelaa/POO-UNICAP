package aula12;

import java.util.*;

public class MainCirculo {
    public static void main(String[] args) {
        ArrayList<Circulo> listaCirculos = new ArrayList<Circulo>();
        Circulo raio1 = new Circulo(1);
        Circulo raio2 = new Circulo(2);
        Circulo raio3 = new Circulo(3.1);
        Circulo raio4 = new Circulo(4);
        Circulo raio5 = new Circulo(5);

        listaCirculos.add(raio1);
        listaCirculos.add(raio2);
        listaCirculos.add(raio3);
        listaCirculos.add(raio4);
        listaCirculos.add(raio5);

        for (Circulo circulo : listaCirculos) {
            System.out.println(circulo.area());
        }
    }
}
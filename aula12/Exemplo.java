package aula12;

import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        // set: não garante a ordem dos elementos e não aceita repetidos
        HashSet<Integer> listaSet = new HashSet<>();
        listaSet.add(30);
        listaSet.add(13);
        listaSet.add(30);
        listaSet.add(19);
        listaSet.add(22);
        listaSet.add(18);
        System.out.println(listaSet);

        // list: aceita repetidos e mantem a ordenação de inserção
        ArrayList<Integer> listaList = new ArrayList<>();
        listaList.add(30);
        listaList.add(13);
        listaList.add(30);
        listaList.add(19);
        listaList.add(22);
        listaList.add(18);
        System.out.println(listaList);

        // map: forma pares de chave-valor
        HashMap<String, Integer> listaMap = new HashMap<String, Integer>();
        listaMap.put("Júlia", 1);
        listaMap.put("Dudu", 2);
        listaMap.put("Augusto", 3);
        System.out.println(listaMap);

        // sortedset: ordena e elimina os repetidos
        SortedSet<Integer> setOrdenado = new TreeSet<>();
        setOrdenado.add(30);
        setOrdenado.add(13);
        setOrdenado.add(30);
        setOrdenado.add(19);
        setOrdenado.add(22);
        setOrdenado.add(18);
        System.out.println(setOrdenado);

        // sortedmap: ordena
        SortedMap<Integer, String> mapaOrdenado = new TreeMap<Integer, String>();
        mapaOrdenado.put(3, "Augusto");
        mapaOrdenado.put(1, "Júlia");
        mapaOrdenado.put(2, "Eduardo");
        System.out.println(mapaOrdenado);
    }
}

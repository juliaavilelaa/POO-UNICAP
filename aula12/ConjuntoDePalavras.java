package aula12;

import java.util.*;;

public class ConjuntoDePalavras {
    private String palavras;
    private HashSet<String> listaPalavras = new HashSet<>();

    public ConjuntoDePalavras(String palavras) {
        this.palavras = palavras;
        String[] palavrasSeparadas = palavras.split(",");
        for (int i = 0; i < palavrasSeparadas.length; i++) {
            this.listaPalavras.add(palavrasSeparadas[i]);
        }
    }

    public String getPalavras() {
        return palavras;
    }

    public void setPalavras(String palavras) {
        this.palavras = palavras;
    }    

    public HashSet<String> getListaPalavras() {
        return listaPalavras;
    }

    public void setListaPalavras(HashSet<String> listaPalavras) {
        this.listaPalavras = listaPalavras;
    }
    
    public boolean contemTodas(String novasPalavras) {
        int contador = 0;
        String[] palavrasSeparadas = novasPalavras.split(",");
        for (int i = 0; i < palavrasSeparadas.length; i++) {
            for (String palavrasAnteriores : listaPalavras) {
                if (palavrasSeparadas[i].equals(palavrasAnteriores)) {
                    contador++;
                }
            }
        }
        if (contador == palavrasSeparadas.length) {
            return true;
        }
        return false;
    }
}

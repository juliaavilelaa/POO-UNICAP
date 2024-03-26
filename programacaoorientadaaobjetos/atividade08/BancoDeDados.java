package atividade08;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<String> chaves;
    private List<String> valores;
    private String senha;

    public BancoDeDados(String senha) {
        this.chaves = new ArrayList<>();
        this.valores = new ArrayList<>();
        this.senha = senha;
    }

    public boolean adicionarRegistro(String chave, String valor, String senha) {
        if (this.senha.equals(senha)) {
            this.chaves.add(chave);
            this.valores.add(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean atualizarRegistro(String chave, String novoValor, String senha) {
        if (this.senha.equals(senha)) {
            int index = this.chaves.indexOf(chave);
            if (index != -1) {
                this.valores.set(index, novoValor);
                return true;
            }
        }
        return false;
    }

    public boolean excluirRegistro(String chave, String senha) {
        if (this.senha.equals(senha)) {
            int index = this.chaves.indexOf(chave);
            if (index != -1) {
                this.chaves.remove(index);
                this.valores.remove(index);
                return true;
            }
        }
        return false;
    }

    public String consultarRegistro(String chave) {
        int index = this.chaves.indexOf(chave);
        if (index != -1) {
            return this.valores.get(index);
        }
        return null;
    }
}
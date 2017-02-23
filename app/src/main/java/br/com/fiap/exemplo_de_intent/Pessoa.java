package br.com.fiap.exemplo_de_intent;

import java.io.Serializable;

/**
 * Created by logonrm on 23/02/2017.
 */

public class Pessoa implements Serializable {



    private String nome;
    private int idade;
    private boolean deficiente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDeficiente() {
        return deficiente;
    }

    public void setDeficiente(boolean deficiente) {
        this.deficiente = deficiente;
    }
}

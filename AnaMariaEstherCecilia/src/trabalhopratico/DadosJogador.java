package trabalhopratico;


import java.util.Comparator;
import java.util.function.ToIntFunction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class DadosJogador implements Comparable<DadosJogador>{
    String nome;
    String senha;
    int pontos;
    int ondeParei;

    public int getOndeParei() {
        return ondeParei;
    }

    public void setOndeParei(int ondeParei) {
        this.ondeParei = ondeParei;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

       @Override
    public int compareTo(DadosJogador t) {
           if (t.getPontos() < this.pontos) {
            return -1;
        }
        if (t.getPontos() > this.pontos) {
            return 1;
        }
        return 0;
    }


}

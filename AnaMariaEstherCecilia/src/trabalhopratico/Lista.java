package trabalhopratico;

import trabalhopratico.ItemLista;

public class Lista<T> {

    private ItemLista<T> inicio;

    public void adicionar(T conteudo) {
        if (this.vazia()) {
            this.inicio = new ItemLista<>();
            this.inicio.setConteudo(conteudo);
        } else {
            ItemLista<T> atual = this.inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            ItemLista<T> itemLista = new ItemLista<>();
            itemLista.setConteudo(conteudo);
            atual.setProximo(itemLista);
        }

    }

    public void inserir(T conteudo, int posicao) {//em uma posiÃ§Ã£o
        // procura o elemento antes da posiÃ§Ã£o que deseja inserir o item
        ItemLista<T> atual = this.inicio;
        int contador = 0;
        while (contador < posicao - 1 && atual.getProximo() != null) {
            atual = atual.getProximo();
            contador++;
        }
        if (posicao != 0 && contador != posicao - 1) {
            throw new NullPointerException();
        }
        ItemLista<T> novoItem = new ItemLista<>();
        novoItem.setConteudo(conteudo);
        if (posicao == 0) {
            novoItem.setProximo(atual);
            this.inicio = novoItem;
        } else {
            novoItem.setProximo(atual.getProximo());
            atual.setProximo(novoItem);
        }
    }

    public void remover(Object v) {//Em qualquer posiÃ§Ã£o
        ItemLista<T> ant = null;
        ItemLista<T> p = this.inicio;
        while (p != null && !p.getConteudo().equals(v)) {
            ant = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (ant == null) {
                this.inicio = p.getProximo();
            } else {
                ant.setProximo(p.getProximo());
            }
        }
    }

    public boolean vazia() {
        return this.inicio == null;
    }

    public int buscar(T valor) {
        int i = 0;
        ItemLista<T> p = this.inicio;
        while (p != null) {
            if (p.getConteudo().equals(valor)) {
                return i;
            }
            p = p.getProximo();
            i++;
        }
        return -1;
    }

    public T imprimir(int posicao) {
        ItemLista<T> atual = this.inicio;
        int contador = 0;
        while (contador < posicao && atual.getProximo() != null) {
            atual = atual.getProximo();
            contador++;
        }
        if (posicao != 0 && contador != posicao) {
            throw new NullPointerException();
        }
            return atual.getConteudo();
    }

    public void esvazia(){
        this.inicio = null;
    }
}


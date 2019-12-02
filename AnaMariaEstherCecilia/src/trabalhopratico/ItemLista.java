package trabalhopratico;

public class ItemLista<T> {

    private T conteudo;
    private ItemLista proximo;

    public ItemLista getProximo() {
        return proximo;
    }

    public void setProximo(ItemLista itemFila) {
        this.proximo = itemFila;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    

}

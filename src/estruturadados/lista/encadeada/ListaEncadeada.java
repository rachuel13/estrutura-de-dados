package estruturadados.lista.encadeada;

public class ListaEncadeada {
    private Celula inicio;
    private Celula ultimo;
    private int tamanho;

    public void adiciona(int elemento) {
        Celula celula = new Celula(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho = tamanho + 1;
    }

    public void limpa() {
        for (Celula atual = this.inicio; atual != null;) {
            Celula proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.tamanho = 0;
    }

    public Integer remover() {
        Integer elementoRemovido = this.inicio.getElemento();

        Celula proximo = this.inicio.getProximo();
        this.inicio.setElemento(null);
        this.inicio.setProximo(null);
        this.inicio = proximo;

        this.tamanho--;

        return elementoRemovido;
    }
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Celula atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }
}

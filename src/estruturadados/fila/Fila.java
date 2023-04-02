package estruturadados.fila;

public class Fila {
    private static final Integer PRIMEIRA_POSICAO = 0;
    private Integer[] elementos;
    private int tamanho;

    public Fila(Integer capacidade) {
        this.elementos = new Integer[capacidade];
        this.tamanho = 0;
    }

    public void enfileirar(Integer elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public Integer desenfileirar() {
        if (!vazia()) {
            Integer elementoDeletado = this.elementos[PRIMEIRA_POSICAO];
            this.elementos =  remanejarPosicao(this.elementos);
            this.tamanho--;
            return elementoDeletado;
        }

        return null;
    }

    public Integer[] remanejarPosicao(Integer[] stack) {
        for (int i = 0; i < stack.length - 1; i++) {
            stack[i] = stack[i + 1];
        }

        return stack;
    }
    public boolean vazia() {
        return this.tamanho == 0;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.tamanho-1; i++){
            builder.append(this.elementos[i]);
            builder.append(", ");
        }

        if (this.tamanho > 0){
            builder.append(this.elementos[this.tamanho-1]);
        }
        builder.append("]");

        return builder.toString();
    }
}

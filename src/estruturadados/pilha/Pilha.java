package estruturadados.pilha;

public class Pilha  {
    private Integer[] elementos;
    private int tamanho;

    public Pilha(Integer capacidade) {
        this.elementos = new Integer[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void push(Integer elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public Integer pop() {
        if (vazia()) {
            return null;
        }

        return this.elementos[--tamanho];
    }

    public boolean vazia() {
        return this.tamanho == 0;
    }

    public Integer getTopo() {
        if (vazia()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
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

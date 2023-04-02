package estruturadados.lista.encadeada;

public class Celula {
    private Integer elemento;
    private Celula proximo;

    public Celula(int elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public Celula(int elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Integer getElemento() {
        return elemento;
    }

    public void setElemento(Integer elemento) {

        if (elemento == null) {
            this.elemento = null;
        }
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Celula { " +
                "elemento = " + elemento +
                ", proximo = " + proximo +
                '}';
    }
}

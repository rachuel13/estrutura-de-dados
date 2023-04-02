package estruturadados;

import estruturadados.fila.Fila;
import estruturadados.lista.encadeada.ListaEncadeada;
import estruturadados.pilha.Pilha;

public class Atividade3 {
    public static void main(String[] args) {
        //Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;
        ListaEncadeada lista = new ListaEncadeada();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println("=====================================================");
        System.out.println(" PASSOS: 1, 2, 3 E 4");
        System.out.println(" LISTA: " + lista);

        //Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
        Pilha pilha = new Pilha(5);

        while (lista.getTamanho() != 0) {
            pilha.push(lista.remover());
        }

        System.out.println(" PILHA: " + pilha);

        // Remova os dados da Pilha e insira-os em uma Fila - com 10 células);
        Fila fila = new Fila(10);
        while (pilha.getTamanho() != 0) {
            fila.enfileirar(pilha.pop());
        }
        System.out.println(" FILA:  " + fila);
        System.out.println("=====================================================");
        System.out.println(" PASSOS: 1, 2, 3 E 4");
        //Insira os números [6, 7, 8, 9 e 10] na lista
        lista.adiciona(6);
        lista.adiciona(7);
        lista.adiciona(8);
        lista.adiciona(9);
        lista.adiciona(10);
        System.out.println("LISTA: " + lista);

        while (lista.getTamanho() != 0) {
            pilha.push(lista.remover());
        }
        System.out.println("PILHA: " + lista);

        while (pilha.getTamanho() != 0) {
            fila.enfileirar(pilha.pop());
        }
        System.out.println(" FILA:  " + fila);
    }
}

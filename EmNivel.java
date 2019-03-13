package arvorebinaria;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class EmNivel implements IPercorre {

    public void percorre(Nodo nodo) {
        if (nodo == null) {
            throw new IllegalArgumentException("Tree node cannot be null!");
        }
        Deque<Nodo> fila = new ArrayDeque<>(); //Cria Lista
        fila.add(nodo); // add valor na fila
        while (!fila.isEmpty()) {  //enquanto fila nao for vazia fica em loop
            Nodo atual = fila.removeFirst(); // remove primeiro valor da fila, ou ultimo valor lido
            System.out.println(atual.getValor()); // escreve valor atual
            if (atual.getEsquerda() != null) { // verifica se tem valor a esquerda do nodo atual
                fila.add(atual.getEsquerda()); // adiciona valor a esquerda do ndo atual
            }
            if (atual.getDireita() != null) { // verifica se tem valor a direita do nodo atual  
                fila.add(atual.getDireita()); // adiciona valor a esquerda do nodo atual
            }
        }
    }
}

package arvorebinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class ArvoreBinaria {

    private Nodo raiz;

    private ArrayList<Integer> Lista = new ArrayList<Integer>();

    public boolean insere(int value) {
        if (raiz == null) {
            System.out.println(value + " eh a raiz da arvore");
            raiz = new Nodo(value);
            return true;
        } else {
            return raiz.insere(value);
        }
    }

    public void percorre(IPercorre metodo) {
        metodo.percorre(raiz);
    }

    public void preencheLista(Nodo nodo) {
        if (nodo != null) {
            preencheLista(nodo.getEsquerda());

            preencheLista(nodo.getDireita());
            Lista.add(nodo.getValor());
        }
    }

    public void remove() {
        int valor = -9999;
        System.out.println("Digite o valor que deseja excluir...");
        Scanner ler = new Scanner(System.in);
        valor = Integer.parseInt(ler.nextLine());

        preencheLista(raiz);
        int pos = Lista.indexOf(valor);
        Lista.remove(pos);
        ArvoreBinaria ab = new ArvoreBinaria();
        for (int i = Lista.size() - 1; i >= 0; i--) {
            ab.insere(Lista.get(i));
        }
    }
}

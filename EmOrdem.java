package arvorebinaria;

public class EmOrdem implements IPercorre {

    public void percorre(Nodo nodo) {
        if (nodo != null) {
            percorre(nodo.getEsquerda());
            System.out.println(" Valor " + nodo.getValor());
            percorre(nodo.getDireita());
        }
    }
}

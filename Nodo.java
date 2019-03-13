package arvorebinaria;

public class Nodo {

    private int valor;
    private Nodo esquerda, direita;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Nodo esquerda) {
        this.esquerda = esquerda;
    }

    public Nodo getDireita() {
        return direita;
    }

    public void setDireita(Nodo direita) {
        this.direita = direita;
    }

    /**
     * Construtor da Classe
     */
    public Nodo(int value) {
        this.valor = value;
    }

    /* Metodo recursivo de inserção */
    
    public boolean insere(int value) {
        if (value == this.valor) {
            System.out.println("Valor já existe na arvore");
            return false;
        } else if (value < this.valor) {
            if (esquerda == null) {
                esquerda = new Nodo(value);
                System.out.println("Insererindo " + value + " a esquerda de " + this.valor);
                return true;
            } else {
                return esquerda.insere(value);
            }
        } else if (value > this.valor) {
            if (direita == null) {
                direita = new Nodo(value);
                System.out.println("Inserindo " + value + " a direita de " + this.valor);
                return true;
            } else {
                return direita.insere(value);
            }
        }
        return false;
    }
}

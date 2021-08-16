package com.projeto.listascirculares;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> calda;
    private int tamanhoLista;

    

    public boolean isEmpty(){
        return this.tamanhoLista==0;
    }

    public int size(){
        return this.tamanhoLista;
    }
}

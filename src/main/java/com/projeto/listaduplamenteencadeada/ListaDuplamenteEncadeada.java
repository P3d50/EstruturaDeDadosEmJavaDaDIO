package com.projeto.listaduplamenteencadeada;

import com.projeto.noencadeamentodeno.No;

public class ListaDuplamenteEncadeada<T> {


    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;
    public ListaDuplamenteEncadeada() {

        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    private T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
            NoDuplo<T> noAuxiliar = primeiroNo;
            for(int i=0;(i<index)&&(noAuxiliar!=null);i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista = 0;
    }

    public boolean isEmpty(){
        return tamanhoLista == 0;
    }


}

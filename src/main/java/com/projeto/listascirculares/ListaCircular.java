package com.projeto.listascirculares;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public void remove(int index){
        if(index>=tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior qu o tamanho da lista");
        No<T> noAuxiliar = this.cauda;
            if(index==0){
                this.cauda = this.cauda.getNoProximo();
                this.cabeca.setNoProximo(this.cauda);
            }else if(index==1){
                this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
            }else {
                for(int i =0;i<index-1;i++){
                    noAuxiliar = noAuxiliar.getNoProximo();
                }
                noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
            }

            this.tamanhoLista--;
    }

    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("a lista esta vazia");
        }
        if(index==0){
            return this.cauda;
        }
        No<T> noAux = this.cauda;
        for(int i=0;(i<index)&&(noAux!=null);i++){
            noAux=noAux.getNoProximo();
        }
        return noAux;
    }

    public boolean isEmpty(){
        return this.tamanhoLista==0;
    }

    public int size(){
        return this.tamanhoLista;
    }
}

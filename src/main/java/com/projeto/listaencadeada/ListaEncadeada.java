package com.projeto.listaencadeada;

import com.projeto.noencadeamentodeno.No;

public class ListaEncadeada<T> {
    No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public T remove(int i){
        No noAlvo = this.getNo(i);
        if(i==0){
            refEntrada = noAlvo.getProximoNo();
            return (T)noAlvo.getConteudo();
        }
        No anterior = this.getNo(--i);
        No proximo = this.getNo(++i);
        anterior.setProximoNo(proximo);
        return (T)noAlvo.getConteudo();
    }

    public T get(int i){

        return (T)getNo(i).getConteudo();
    }

    private No getNo(int i){
        this.validaIndice(i);
        No<T> noAux = refEntrada;
        int count =0;
        while(count<=size()-1){
            if(count==i){
                return noAux;
            }else{
                noAux = noAux.getProximoNo();
                ++count;
            }
        }
        return noAux;
    }

    private void validaIndice(int i) {
        if(i>=size()){
            throw new ArrayIndexOutOfBoundsException("Não existe o índice especificado:"+"i, último índice da lista"+(size()-1));
        }
    }

    public void add(T dado){
        No<T> novoNo = new No(dado);
        if(this.isEmpty()){
            refEntrada = novoNo;
            return;
        }else{
            getLast().setProximoNo(novoNo);
        }

    }

    public int size(){
        int tamanhoLista = 0;
        No noAuxiliar = refEntrada;
        if(refEntrada!=null){
            while (refEntrada.getProximoNo() != null) {
                tamanhoLista++;
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty(){
        return refEntrada == null;
    }

    private No getLast() {
        No noAuxiliar = refEntrada;
        while (noAuxiliar.getProximoNo() != null) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }
}

package com.projeto.arvorebinaria;

public class ArvoreBinaria <T extends Comparable<T>>{

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz=null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<T>(conteudo);
        raiz = inserir(raiz,novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual,BinNo<T> novoNo){

        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo())<0){
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
        }else{
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
        }
        return atual;
    }
}

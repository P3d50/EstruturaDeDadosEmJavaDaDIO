package com.projeto.pilha;

class No{
    private int dado;
    private No referencia;

    public No() {
        this.referencia = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReferencia() {
        return referencia;
    }

    public void setReferencia(No referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}

public class Pilha {

    private No refTopNo;

    public Pilha(){
        this.refTopNo=null;
    }

    public No pop(){
        No noRetorno = null;
        if(!this.isEmpty()){
            noRetorno = refTopNo;
            refTopNo = refTopNo.getReferencia();
        }
        return noRetorno;
    }

    public void push(No novoNo){
        No refTopNoAuxiliar = refTopNo;
        refTopNo = novoNo;
        refTopNo.setReferencia(refTopNoAuxiliar);
    }

    public No top() {
        return refTopNo;
    }

    public boolean isEmpty(){
         return refTopNo==null;
    }

}

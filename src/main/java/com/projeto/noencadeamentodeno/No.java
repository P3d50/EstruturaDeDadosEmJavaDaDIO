package com.projeto.noencadeamentodeno;

public class No<T> {

    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteúdo='" + conteudo + '\'' +
                '}';
    }
}

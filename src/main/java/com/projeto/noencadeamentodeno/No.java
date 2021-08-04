package com.projeto.noencadeamentodeno;

public class No {
    private String conteudo;
    private No proximoNo;

    public String getConteudo() {
        return conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +

                '}';
    }
}

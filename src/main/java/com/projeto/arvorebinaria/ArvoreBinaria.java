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

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibiInOrdem(this.raiz);
    }

    private void exibiInOrdem(BinNo<T> atual){
        if(atual != null){
            exibiInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo()+",");
            exibiInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibiPosOrdem(this.raiz);
    }

    private void exibiPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibiPosOrdem(atual.getNoEsq());
            exibiPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo()+",");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibiPreOrdem(this.raiz);
    }

    private void exibiPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo()+",");
            exibiPreOrdem(atual.getNoEsq());
            exibiPreOrdem(atual.getNoDir());
        }
    }

    public void remove(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;
            while(atual!=null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo())<0){
                    atual = atual.getNoEsq();
                }else{
                    atual = atual.getNoDir();
                }
            }

            if(atual==null){
                System.out.println("Conteudo não encontrado, try");
            }

            if(pai==null){
                if(atual.getNoDir()==null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() ==null){
                    this.raiz = atual.getNoEsq();
                }else{
                    for(temp = atual, filho = atual.getNoEsq();filho.getNoDir()!=null;temp = filho,filho = filho.getNoEsq()){
                        if(filho!=atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            }else if(atual.getNoDir()==null){

            }else if(atual.getNoEsq()==null){

            }else{

            }
        }catch(NullPointerException e){
            System.out.println("Conteudo não encontrado, catch");
        }
    }
}
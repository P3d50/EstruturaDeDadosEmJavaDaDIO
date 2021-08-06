package com.projeto.fila;
import com.projeto.noencadeamentodeno.No;

public class Fila<T> {

    private No<T> refFirstIn;

    public Fila() {
        this.refFirstIn = null;
    }

    public T dequeue(){
        No auxNo = refFirstIn;
        refFirstIn = refFirstIn.getProximoNo();
        return (T)auxNo.getConteudo();
    }

    public void enqueue(T dado) {
        if(!isEmpty()) {
            getLast().setProximoNo(new No(dado));
        }else{
            refFirstIn = new No(dado);
        }
    }

    private No getLast() {
        No noAuxiliar = refFirstIn;
        while (noAuxiliar.getProximoNo() != null) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noAuxiliar;
    }


    public boolean isEmpty(){
        return this.refFirstIn==null;
    }

    @Override
    public String toString() {
        String nos = "-----------\n";
        No noAuxiliar = refFirstIn;
        while(noAuxiliar!=null){
            nos += noAuxiliar!=null?noAuxiliar.getConteudo().toString()+"\n":"";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return nos;
    }
}

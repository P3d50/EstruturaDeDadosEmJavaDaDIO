package com.projeto.fila;
import com.projeto.noencadeamentodeno.No;

public class Fila {

    private No refFirstIn;

    public Fila() {
        this.refFirstIn = null;
    }

    public No dequeue(){
        No auxNo = refFirstIn;
        refFirstIn = refFirstIn.getProximoNo();
        return auxNo;
    }

    public void enqueue(No proximoNo) {
        if(!isEmpty()) {
            getLast().setProximoNo(proximoNo);
        }else{
            refFirstIn = proximoNo;
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
            nos += noAuxiliar!=null?noAuxiliar.toString()+"\n":"";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return nos;
    }
}

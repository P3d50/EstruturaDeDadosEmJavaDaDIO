package com.projeto.fila;

import com.projeto.noencadeamentodeno.No;

public class Main {

    public static void main(String args[]){
        Fila<Integer> fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(7);
        System.out.println(fila.toString());
        fila.dequeue();
        System.out.println(fila.toString());
        fila.dequeue();
        System.out.println(fila.toString());
        fila.enqueue(8);
        System.out.println(fila.toString());
    }
}

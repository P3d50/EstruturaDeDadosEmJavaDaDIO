package com.projeto.fila;

import com.projeto.noencadeamentodeno.No;

public class Main {

    public static void main(String args[]){
        Fila fila = new Fila();
        fila.enqueue(new No(1));
        fila.enqueue(new No(2));
        fila.enqueue(new No(3));
        fila.enqueue(new No(4));
        fila.enqueue(new No(5));
        fila.enqueue(new No(6));
        fila.enqueue(new No(7));
        System.out.println(fila.toString());
        fila.dequeue();
        System.out.println(fila.toString());
        fila.dequeue();
        System.out.println(fila.toString());
        fila.enqueue(new No(8));
        System.out.println(fila.toString());
    }
}

package com.projeto.implementacaopadraojava.queue;

import com.projeto.implementacaopadraojava.Carro;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args){
        Queue<Carro> queue = new LinkedList<>();
        queue.add(new Carro("Ford"));
        queue.add(new Carro("Chev"));
        queue.add(new Carro("Fiat"));
        System.out.println(queue);
        System.out.println(queue.add(new Carro("Peugeot")));
        System.out.println(queue);
        System.out.println(queue.offer(new Carro("Renault")));
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }

}

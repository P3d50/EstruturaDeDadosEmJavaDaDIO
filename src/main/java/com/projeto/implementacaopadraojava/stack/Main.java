package com.projeto.implementacaopadraojava.stack;

import com.projeto.implementacaopadraojava.Carro;

import java.util.Stack;

public class Main {

    public static void main(String arg[]){

        Stack<Carro> stack = new Stack<Carro>();
        stack.push(new Carro("Ford"));
        stack.push(new Carro("Chev"));
        stack.push(new Carro("Fiat"));

      System.out.println(stack);
      stack.pop();
      System.out.println(stack);
      System.out.println(stack.peek());
      System.out.println(stack);
      System.out.println(stack.isEmpty());




    }
}

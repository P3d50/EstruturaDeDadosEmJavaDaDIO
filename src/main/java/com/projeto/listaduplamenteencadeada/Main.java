package com.projeto.listaduplamenteencadeada;


public class Main {


    public static void main(String arg[]){

        ListaDuplamenteEncadeada<String> encadeada = new ListaDuplamenteEncadeada<>();
        encadeada.add("Um");
        encadeada.add("Dois");
        encadeada.add(2,"Três");
        encadeada.add("Quatro");
        encadeada.add("Cinco");

        System.out.println(encadeada.toString());
        encadeada.remove(1);
        System.out.println(encadeada.toString());


    }
}

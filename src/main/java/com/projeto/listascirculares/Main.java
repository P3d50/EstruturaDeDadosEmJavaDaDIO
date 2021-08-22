package com.projeto.listascirculares;

public class Main {

    public static void main(String arg[]){
        ListaCircular<String> lista = new ListaCircular();
        lista.add("0");
        lista.add("1");
        lista.add("2");
        System.out.println(lista);
        lista.remove(0);
        lista.add("3");
        lista.add("4");
        System.out.println(lista);
        System.out.println(lista.get(1).toString());
    }
}

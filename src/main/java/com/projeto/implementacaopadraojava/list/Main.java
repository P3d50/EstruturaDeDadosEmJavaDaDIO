package com.projeto.implementacaopadraojava.list;

import com.projeto.implementacaopadraojava.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Carro> lista = new ArrayList<>();
        lista.add(new Carro("Ford"));
        lista.add(new Carro("Volks"));
        lista.add(new Carro("Chev"));
        lista.add(new Carro("Peugeot"));
        System.out.println(lista.contains(new Carro("Ford")));
        System.out.println(lista.get(2));
        System.out.println(lista.indexOf("Fiat"));
        System.out.println(lista.remove(2));
        System.out.println(lista);


    }
}

package com.projeto.implementacaopadraojava.set;

import com.projeto.implementacaopadraojava.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] arg){
        Set<Carro> hashSet = new HashSet<>();
        hashSet.add(new Carro("Ford"));
        hashSet.add(new Carro("Chevrolet"));
        hashSet.add(new Carro("Fiat"));
        hashSet.add(new Carro("Peugeot"));
        hashSet.add(new Carro("Alfa Romeo"));
        System.out.println(hashSet);

        Set<Carro> treeSet = new TreeSet<>();
        treeSet.add(new Carro("Ford"));
        treeSet.add(new Carro("Chevrolet"));
        treeSet.add(new Carro("Fiat"));
        treeSet.add(new Carro("Peugeot"));
        treeSet.add(new Carro("Zip"));
        treeSet.add(new Carro("Alfa Romeo"));
        System.out.println(treeSet);

    }
}

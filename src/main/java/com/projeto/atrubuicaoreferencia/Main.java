package com.projeto.atrubuicaoreferencia;

public class Main {

    public static void main(String arg[]){
        int intA =1;
        int intB=intA;
        System.out.println("intA:"+intA+" | intB:"+intB);
        intA=2;
        System.out.println("intA:"+intA+" | intB:"+intB);

        MeuObj obj1 = new MeuObj(1);
        MeuObj obj2 = obj1;

        System.out.println("obj1:"+obj1.toString()+" | obj2:"+obj2.toString());
        obj1.setNum(2);
        System.out.println("obj1:"+obj1.toString()+" | obj2:"+obj2.toString());


    }
}

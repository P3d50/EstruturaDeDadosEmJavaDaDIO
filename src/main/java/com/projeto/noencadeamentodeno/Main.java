package com.projeto.noencadeamentodeno;

public class Main {

    public static void main(String arg[]){
        No<String> no1 = new No("conteúdo nó 1");
        No<String> no2 = new No("conteúdo nó 2");
        no1.setProximoNo(no2);
        No<String> no3 = new No("conteúdo nó 3");
        no2.setProximoNo(no3);
        No<String> no4 = new No("conteúdo nó 4");
        no3.setProximoNo(no4);


        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());


    }
}

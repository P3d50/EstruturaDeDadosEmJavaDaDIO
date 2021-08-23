package com.projeto.implementacaopadraojava.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome","João");
        aluno.put("Idade","17");
        aluno.put("Média","8.5");
        aluno.put("Turma", "3a");
        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        Map<String, String> aluna = new HashMap<>();
        aluna.put("Nome","Mariana");
        aluna.put("Idade","18");
        aluna.put("Média","8.9");
        aluna.put("Turma", "3b");
        System.out.println(aluna);
        System.out.println(aluna.keySet());
        System.out.println(aluna.values());

        List<Map<String,String>> listaDeAlunos= new ArrayList<>();
        listaDeAlunos.add(aluno);
        listaDeAlunos.add(aluna);
        System.out.println(listaDeAlunos);
        System.out.println(aluno.containsKey("Nome"));
    }
}

package br.com.joaovellenich;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String PersonNames = "joao,roberto,antonio";
        String[] names = PersonNames.split(",");

        List<String> list = new ArrayList<>();
        Collections.addAll(list, names);
        Collections.sort(list);
        System.out.println("Nomes: ");
        System.out.println(list);

        String GenderEntry = "joao-M,roberto-M,fernanda-F";
        String[] NameGender = GenderEntry.split(",");

        List<String> male = new ArrayList<>();
        List<String> female = new ArrayList<>();
        for (String person: NameGender){
            if(person.split("-")[1].equals("F")){
                female.add(person.split("-")[0]);
            }else{
                male.add(person.split("-")[0]);
            }
        }

        System.out.println("Homem: ");
        System.out.println(male);
        System.out.println("Mulher: ");
        System.out.println(female);
    }
}

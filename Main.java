package com.company;

import java.util.TreeMap;

public class Main {
    private static void show(TreeMap<String, String> o) {

        String temp;

        for (int i = 0; i < o.size(); i++) {
            for (int j = i + 1; j < o.size(); j++)
                if (o.get(i).compareTo(o.get(j)) > 0) {
                    temp = o.get(i);
                    o.get(i) = o.get(j);
                    o.get(j) = temp;
                }
        } //Tutaj nie wiem co zrobić??????

        for(int i = 0; i < o.size(); i++) {
            System.out.println(o[i].getKey() + " : " + o[i].getValue());
        }
    }

    public static void main(String[] args) {
        TreeMap<String, String> dict = new TreeMap<>();

        dict.put("balck", "czarny");
        dict.put("dark grey", "ciemny szary");
        dict.put("grey", "szary");
        dict.put("light grey", "jasny szary");
        dict.put("white", "biały");
        dict.put("red", "czerwony");
        dict.put("green", "zielony");
        dict.put("pink", "różowy");
        dict.put("blue", "niebieski");
        dict.put("magenta", "fioletowy");

        show(dict);
    }
}

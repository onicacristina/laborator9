package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String text = "This is a;string. This is,another string.";
        String replace = text.replace('.','~');
        String[] split = replace.split("~");

        System.out.println("Fraza 1 : " + split[0]);
        System.out.println("Fraza 2 : " + split[1]);
        List<String> lista = new ArrayList<>();
        lista.add(split[0]);
        lista.add(split[1]);
        System.out.println(lista);
        List<String> l1 = Arrays.asList(split[0].replaceAll("[^\\p{Alnum}]+", " ").split(" "));
        System.out.println(l1);
        List<String> l2 = Arrays.asList(split[1].replaceAll("[^\\p{Alnum}]+", " ").split(" "));
        System.out.println(l2);

        List<String> common = new ArrayList<String>(l1);
        // use common.retainAll
        common.retainAll(l2);

        System.out.println("Cuvintele care se afla in ambele fraze sunt : " + common);
        System.out.println("Numarul de cuvinte comune este: " + common.size());

    }
}

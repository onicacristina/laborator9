package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static LinkedList<String> L = new LinkedList<>();
    public static LinkedList<Integer> P = new LinkedList<>();
    public static int n, m, elem;
    public static String element;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Cate elemente doriti sa aiba lista L (lista de cuvinte)?  ");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti elementele listei L :");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementul #" + (i + 1) + " : ");
            element = scanner.nextLine();
            L.add(element);

        }

        System.out.println("Cate elem doriti sa aiba lista P (lista cu cifre) ?  ");
        m = scanner.nextInt();
        System.out.println("Introduceti elementele listei P :");
        for (int i = 0; i < m; i++) {
            System.out.print("Elementul #" + (i + 1) + " : ");
            elem = scanner.nextInt();
            P.add(elem);
        }
        Collections.sort(P);
        System.out.println("Lista L este: " + L);
        System.out.println("Lista P este: " + P);
        sterge(L, P);

    }

    public static void sterge(LinkedList L, LinkedList P) {

        for (int i = 0; i < P.size() ; i++) {
            int poz = (int) P.get(i);
            if(poz<L.size())
            {
                L.remove(poz);
                System.out.println("Elementul de pe pozitia "+poz+" a fost sters!");
                System.out.println(L);
                System.out.println();
            }
            else
                System.out.println("\nLista l nu are pozitia "+poz);

        }
        System.out.println("\nLista L dupa ce elementele de pe pozitiile din lista P au fost sterse:");
        System.out.println(L);
    }
}

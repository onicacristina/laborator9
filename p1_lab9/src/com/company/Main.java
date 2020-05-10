package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<String> lista = new ArrayList<String>();
        int n;
        System.out.println("Cate elemente doriti sa adaugati in lista?  ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();

        adaugare(n,lista);
        afisare(n,lista);

    }
    public static void adaugare(int n,ArrayList lista)
    {
        String element;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <n ; i++) {
            System.out.print("Elemntul #"+ (i+1) +" : ");
            element = scanner.nextLine();
            lista.add(element);
        }
    }

    public static void afisare(int n, ArrayList lista)
    {
        System.out.println("Elementele listei  sunt: ");
        for (int i = 0; i <n ; i++)
            System.out.print(lista.get(i) +"   ");
    }
}
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> lista = new ArrayList<String>();
    public static ArrayList<String> lista2 = new ArrayList<String>();
    public static int n,m;
    public static void main(String[] args) {
	// write your code here

        //int n;
        System.out.println("Cate elemente doriti sa adaugati in lista 1 ?  ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        String element;

        for (int i = 0; i <n ; i++) {
            System.out.print("Elemntul #"+ (i+1) +" : ");

            element = scanner.nextLine();

            lista.add(element);

        }
        System.out.println("Cate elemente doriti sa adaugati in lista 2 ?  ");

        m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <m ; i++) {
            System.out.print("Elemntul #"+ (i+1) +" : ");
            element = scanner.nextLine();
            lista2.add(element);
        }

        System.out.println("\nLista 1 initial: " + lista);
        System.out.println("Lista 2 initial: " + lista2);

        cutAndPaste(0,2,2);
        System.out.println("\nLista 1 dupa operata cut and paste : " + lista);
        System.out.println("Lista 1 dupa operata cut and paste : " + lista2);


    }

    public static void cutAndPaste(int start, int end,int poz)
    {
        ArrayList<String> aux = new ArrayList<String>();
        int p=0;
        for (int i = end; i >= start; i--) {
            aux.add(lista.get(i));
            p++;
            lista.remove(i);
        }

        for (int i = p-1; i >=0 ; i--) {
            lista2.add(poz,aux.get(i));
            poz++;
        }

    }
}

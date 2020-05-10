package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static LinkedList<String> lista = new LinkedList<>();
    public static int n;
    public static String element;

    public static void main(String[] args) {

        System.out.println("Cate elemente doriti sa aiba lista?  ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti elementele listei:");
        for (int i = 0; i <n ; i++) {
            System.out.print("Elementul #"+ (i+1) +" : ");
            element = scanner.nextLine();
            lista.add(element);
        }

        System.out.print("\nElementele listei sunt:\n");
        print(n,lista);
        String[] itemsArray = new String[lista.size()];
        itemsArray = lista.toArray(itemsArray);

        // Metoda sortare
        Collections.sort(lista);
        System.out.println("\nElementele listei sortate sunt:");
        print(n,lista);

        // Sortare cu QuickSort
        sort(itemsArray,0,n-1);
        System.out.println("\nElementele listei sortate prin tehnica QuickSort sunt:");
        for(int i=0; i<n;i++) {
            System.out.print(itemsArray[i] + " ");
        }
        System.out.println();
    }

    public static int partition(String[] itemArray, int low, int high)
    {
        String pivot = itemArray[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (itemArray[j].compareTo(pivot)<0)
            {
                i++;

                String temp = itemArray[i];
                itemArray[i] = itemArray[j];
                itemArray[j] = temp;
            }
        }

        String temp = itemArray[i+1];
        itemArray[i+1] = itemArray[high];
        itemArray[high] = temp;

        return i+1;
    }


    public static void sort(String[] itemArray, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(itemArray, low, high);

            sort(itemArray, low, pi-1);
            sort(itemArray, pi+1, high);
        }
    }


    public static void print(int n, LinkedList lista)
    {
       // System.out.print("\nElementele listei sunt:\n");
        for(int i=0;i<n;i++)
            System.out.print(lista.get(i)+" ");
        System.out.println();
    }}
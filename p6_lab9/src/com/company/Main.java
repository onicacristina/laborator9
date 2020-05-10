package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de copii:   ");
        System.out.print("N = ");
        int N = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduceti un numar M (fiecare al M-lea copil la care ajunge mingea este eliminat):  ");
        System.out.print("M = ");
        int M = scanner.nextInt();

        System.out.println("\n=> Castigatorul este Copilul #"+ joseph(N,M));
    }

    public static int joseph(int N, int M) {

        ArrayList<Integer> people = new ArrayList<>();
        int tempPos = M - 1;
        int iteration = N - 1;

        for (int i = 0; i < N; i++) {
            people.add(i+1);
        }

        while (iteration > 0) {
            System.out.println("Copilul #"+people.remove(tempPos)+" a fost eliminat!");
            tempPos += M - 1;
            if (tempPos > people.size() - 1) {
                tempPos = tempPos % people.size();
            }
            iteration--;
        }

        return people.get(0);
    }
}
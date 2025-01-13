package org.example;

import java.util.Scanner;

public class Main {
    public static int nejmensi(int x, int y) {
        return x < y ? x : x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int vysledek = nejmensi(a, b);
        System.out.println(vysledek);


    }
}
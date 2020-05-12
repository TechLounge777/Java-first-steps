package com.company;

import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {
        System.out.println("Podaj promień koła");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double score = 3.14*r*r;
        System.out.println("Pole koła to " + 3.14*r*r);

    }
}

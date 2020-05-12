package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* System.out.println("Hello World!");
        System.out.println(1000);
        System.out.println(100*30000);
        System.out.println(5+9);*/

        Scanner input  = new Scanner(System.in);
        System.out.println("Podaj liczbę ");

        int number = input.nextInt(); // number = 125
        int lastDigit = number%10;

        System.out.println("Twoja liczba to " + number);
        System.out.println("Ostatnia cyfra to " + lastDigit);

            // % - reszta z dzielenia
            // 10 % 3 = 3*3 + 1
            // 15%6 = 2*6 + 1
            // 1256%10 = 6
            // 12%10 = 2
            // 127 = (1*10^2+2*10^1) +7

    }
}

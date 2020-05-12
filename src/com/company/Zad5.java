package com.company;

import java.util.Scanner;

public class Zad5 {

    // psvm
    public static void main(String[] args) {

            // sout
        System.out.println("Podaj liczbę pierwszą ");
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();

        System.out.println("Podaj liczbę drugą ");

        int secondNumber = input.nextInt();

        int score = firstNumber + secondNumber;

        System.out.println("Suma liczb to " + score);





    }



}

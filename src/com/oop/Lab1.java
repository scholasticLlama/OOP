package com.oop;

public class Lab1 {
    public static void main(String[] args) {

        //С2 = 215 % 2 = 1 --> O1 "-"
        //С3 = 215 % 3 = 2 --> C = 2
        //С5 = 215 % 5 = 0 --> O2 "*"
        //С7 = 215 % 7 = 5 --> type(i,j) = float

        int a = -2, b = 0, n = 0, m = 5; //boundaries of sum
        float S = 0; //Sum
        float C = 2;

        if (a > n || b > m) {
            System.out.println("Wrong boundaries!");
        } else {
            if (a <= C && C <= n) {
                System.out.println("Divizion by zero!");
            } else {
                for (float i = a; i <= n; i++) {
                    for (float j = b; j <= m; j++) {
                        S += i * j / (i - C);
                    }
                }
                System.out.println("Sum = " + S);
            }
        }
        int[] Const = new int[5];
        for (int i = 0; i < Const.length; i++) {
            System.out.println(Const[i]);
        }

    }
}





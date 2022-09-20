package com.oop;

public class Lab2 {

    public static void main(String[] args) {

        //С5 = 215 % 5 = 0 --> C = a x B, a - const
        //С7 = 215 % 7 = 5 --> type(C[i][j]) = char
        //С11 = 215 % 11 = 6 --> Обчислити суму найбільших елементів в стовпцях матриці з парними номерами
        // та найменших елементів в стовпцях матриці з непарними номерами

        char[][] B = {
                {'a', 'j'},
                {'c', 'o'}
        };
        char[][] C = new char[B.length][B[0].length];
        int a = 2;

        if (B[0].length == 0) {
            System.out.println("The matrix B is empty!");
            System.exit(0);
        }

        // create matrix C = a x B
        System.out.println("Created new matrix С[" + B.length + "][" + B[0].length + "] = a x B");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = (char) (B[i][j] * a);
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        // calculate sum in columns
        char SumMax = 0;
        char SumMin = 0;

        for (int i = 0; i < C[0].length; i++) {
            char element = C[0][i];
            int countElement = 1;

            for (int j = 1; j < C.length; j++) {
                if (i % 2 == 0) { // column is even; searching max element(s)
                    if (C[j][i] >= element) {
                        if (element == C[j][i]) countElement += 1;
                        else {
                            element = C[j][i];
                            countElement = 1;
                        }
                    }

                } else { // column is odd; searching min element(s)
                    if (C[j][i] <= element) {
                        if (element == C[j][i]) countElement += 1;
                        else {
                            element = C[j][i];
                            countElement = 1;
                        }
                    }
                }

            }
            if (i % 2 == 0) {
                SumMax += element * countElement;
            } else {
                SumMin += element * countElement;
            }

        }
        System.out.println("\nСума максимальних елементів: " + SumMax);
        if (C[0].length == 1)
            System.out.println("Щоб порахувати суму мінімальних елементів збільшіть кількість стовбців!");
        else System.out.println("Сума мінімальних елементів: " + SumMin);

    }

}

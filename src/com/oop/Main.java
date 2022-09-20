package com.oop;

public class Main {
    public static void main(String[] args) {
        char[][] B = {{'a', 'j'}, {'c', 'o'}};
        char[][] C = new char[B.length][B[0].length];
        int a = 2;


        System.out.println("Створена матриця С = аxB");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                char multipliedElement = B[i][j];

                for (int el = 0; el < a - 1; el++) {
                    multipliedElement += B[i][j];

                }

                C[i][j] = multipliedElement;
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }


        char SumMax = 0;
        char SumMin = 0;
        for (int i = 0; i < C[0].length; i++) {

            char maxElement = C[0][i];
            char countMax = maxElement;
            char minElement = C[0][i];
            char countMin = minElement;
            for (int j = 0; j < C.length; j++) {

                if (i % 2 == 0) {
                    if (C[j][i] >= maxElement) {
                        if (maxElement == C[j][i]) countMax += maxElement;
                        else {
                            maxElement = C[j][i];
                            countMax = maxElement;

                        }
                    }


                } else {
                    if (C[j][i] <= minElement) {
                        if (minElement == C[j][i]) countMin += minElement;
                        else {
                            minElement = C[j][i];
                            countMin = minElement;
                        }
                    }
                }
            }
            if (i % 2 == 0) SumMax += countMax;
            else SumMin += countMin;

        }
        System.out.println();
        System.out.println("Сума максимальних елементів: " + SumMax);
        System.out.println("Сума мінімальних елементів: " + SumMin);

        //char element ='a';
        //char element_2 = element;
        //element_2 +=element;
        //System.out.println("Сума по чар " + element_2);
        //System.out.println("Сума по інт " + (char)(element*1));

    }
}
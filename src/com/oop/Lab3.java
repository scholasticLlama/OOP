package com.oop;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) throws IOException {
        //С3 = 215 % 3 = 2 --> type(text) = String
        //С17 = 215 % 17 = 11 --> Із заданого тексту видалити всі слова визначеної довжини, що починаються з приголосної літери

        FileReader reader = new FileReader("winnie.txt");
        Scanner scan = new Scanner(reader);
        System.out.println(scan.nextLine());
        String text = "";
        int defaultLength = 4;
        int left, right, begging = 0, end = 0;

        while (scan.hasNextLine()) {
            text += scan.nextLine() + "\n";
        }
        reader.close();

        System.out.println("Original text\n" + text + "\nEdited text");
        text += ".!";
        String[] words = text.split("((?<=[,“”. ?;()!:])|(?=[,“”. ?;()!:]))");

        if (words[0].length() - 1 == defaultLength && String.valueOf(words[0].charAt(1)).matches("(?:(?![aeioyuAEUIOY])[a-zA-Z])")) {
            begging = 1;
            while (!words[begging].matches("[A-Za-z]+")) {
                begging += 1;

            }
            words[begging] = String.valueOf(words[begging].charAt(0)).toUpperCase(Locale.ROOT) + words[begging].substring(1);
        }

        for (int i = 2; i < words.length - 2; i++) {

            if (words[i].length() == defaultLength && (String.valueOf(words[i].charAt(0)).matches("(?:(?![aeioyuAEUIOY])[a-zA-Z])"))) {
                left = 0;
                right = 0;

                if (words[i + 1].matches("[?!.]")) {    // 'word.'
                    if (words[i - 1].equals(" ")) {     // ' word.'
                        left -= 1;
                        if (words[i - 2].matches("[;:,]")) {    // ', word.'
                            left -= 1;
                        } else if (words[i - 2].matches("[.!?]")) {    // '. Word.'
                            right += 1;
                            if ((i < words.length - 3) && words[i + 3].matches("[A-Za-z]+")) {
                                words[i + 3] = String.valueOf(words[i + 3].charAt(0)).toUpperCase(Locale.ROOT) + words[i + 3].substring(1);
                            }
                        }
                    }
                } else {
                    if ((words[i - 2].matches("[?!.]")) && (words[i - 1].equals(" "))) {  // '. Word word2'
                        left -= 1;
                        if (words[i + 1].matches("[,:;]")) {  // '. Word,'
                            right += 1;
                        }
                        if (words[i + 2].matches("[a-zA-Z0-9]+")) {  // '. Word word2'
                            words[i + 2] = String.valueOf(words[i + 2].charAt(0)).toUpperCase(Locale.ROOT) + words[i + 2].substring(1);
                        }
                    } else if (words[i - 1].equals("“")) {    // '“Word'
                        if (words[i].matches("[A-Z][a-z]+")) {
                            words[i + 2] = String.valueOf(words[i + 2].charAt(0)).toUpperCase(Locale.ROOT) + words[i + 2].substring(1);  // '“Word word2'
                        }
                        right += 1;

                    } else
                        left -= 1;
                    if (words[i + 1].matches("[,:;]") && words[i - 2].matches("[,:;]")) { // ', Word,'
                        right += 1;
                    }
                }
                end = i + left;
                for (int j = begging; j < end; j++) {
                    System.out.print(words[j]);
                }
                begging = i + right + 1;
            }

        }

        for (int j = begging; j < words.length - 2; j++) {
            System.out.print(words[j]);
        }
    }
}
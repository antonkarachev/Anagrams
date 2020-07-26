package com.aakarachev.anagrams;

import java.util.Scanner;

public class AnagramConsoleApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println(AnagramMaker.makeAnagram(sentence));

    }
}

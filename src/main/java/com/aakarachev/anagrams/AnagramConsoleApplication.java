package com.aakarachev.anagrams;

import java.util.Scanner;

import static com.aakarachev.anagrams.AnagramMaker.makeAnagram;

public class AnagramConsoleApplication {
    public static void main(String[] args) {

        System.out.print("Hey. This is an anagram app, enter your sentence, word or phrase \n" +
                "(but remember the numbers and characters will remain in place)\n"+
                "Enter here: ");

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.print("Your anagram: ");
        System.out.println(makeAnagram(sentence));
    }
}

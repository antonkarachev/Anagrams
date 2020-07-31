package com.aakarachev.anagrams;

public class AnagramMaker {

    private static final String SPACE_DELIMITER = " ";

    private AnagramMaker() {
        throw new IllegalStateException("You can`t create instance of this class, it`s just utility");
    }

    public static String makeAnagram(String sentence) {
        validate(sentence);

        String[] words = sentence.split(SPACE_DELIMITER);
        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = reverseWord(words[i]);
        }

        return concat(reversedWords);
    }

    private static void validate(String sentence) {

        if (sentence == null) {
            throw new IllegalArgumentException("Sentence is null");
        }
        if (sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("Sentence is empty or contains only tabulation symbols");
        }
    }

    private static String reverseWord(String word) {

        char[] reversedChars = word.toCharArray();
        int startIndex = 0;
        int endIndex = reversedChars.length - 1;

        while (startIndex < endIndex) {
            if (Character.isLetter(reversedChars[startIndex])) {
                if (Character.isLetter(reversedChars[endIndex])) {
                    swapChars(reversedChars, startIndex, endIndex);
                    startIndex++;
                }
                endIndex--;
            } else {
                startIndex++;
            }
        }

        return new String(reversedChars);
    }

    private static void swapChars(char[] inputSentence, int firstCharIndex, int secondCharIndex) {
        char temp = inputSentence[firstCharIndex];
        inputSentence[firstCharIndex] = inputSentence[secondCharIndex];
        inputSentence[secondCharIndex] = temp;
    }

    private static String concat(String[] words) {
        return String.join(SPACE_DELIMITER, words);
    }
}

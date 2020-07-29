package com.aakarachev.anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AnagramMakerTest {

    private final AnagramMaker anagramMaker = new AnagramMaker();

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithOneNonLetterSymbol() {
        String expected = "h";
        String actual = anagramMaker.makeAnagram("h");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithOneLetterSymbol() {
        String expected = "1";
        String actual = anagramMaker.makeAnagram("1");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithSameLetterSymbol() {
        String expected = "aa";
        String actual = anagramMaker.makeAnagram("aa");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithSameNonLetterSymbol() {
        String expected = "11";
        String actual = anagramMaker.makeAnagram("11");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentLetterSymbols() {
        String expected = "abcde";
        String actual = anagramMaker.makeAnagram("edcba");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentNonLetterSymbols() {
        String expected = "a!bcd1e";
        String actual = anagramMaker.makeAnagram("e!dcb1a");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentLetterSymbolsUpperAndLowerCases() {
        String expected = "AbcDe";
        String actual = anagramMaker.makeAnagram("eDcbA");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithOnlyLetters() {
        String expected = "abcde fghij";
        String actual = anagramMaker.makeAnagram("edcba jihgf");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithOnlyNonLettersSymbols() {
        String expected = "123456 789002";
        String actual = anagramMaker.makeAnagram("123456 789002");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithDifferentSymbols() {
        String expected = "a1bcd efgh23";
        String actual = anagramMaker.makeAnagram("d1cba hgfe23");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithOnlyLetters() {
        String expected = "abcde gthysd hgfdwq";
        String actual = anagramMaker.makeAnagram("edcba dsyhtg qwdfgh");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithOnlyNonLettersSymbols() {
        String expected = "123456 654321 7896544";
        String actual = anagramMaker.makeAnagram("123456 654321 7896544");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithDifferentSymbols() {
        String expected = "as2edw5q fds34fs 1fds333";
        String actual = anagramMaker.makeAnagram("qw2des5a sfs34df 1sdf333");

        assertEquals(expected, actual);
    }


    @Test
    void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceIsNull() {
        assertThrows(IllegalArgumentException.class, () -> anagramMaker.makeAnagram(null),
                "Sentence is null");
    }

    @Test
    void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> anagramMaker.makeAnagram(""),
                "Sentence is empty or contains only tabulation symbols");
    }

    @Test
    void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceContainsOnlyTabulation() {
        assertThrows(IllegalArgumentException.class, () -> anagramMaker.makeAnagram("       "),
                "Sentence is empty or contains only tabulation symbols");
    }
}

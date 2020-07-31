package com.aakarachev.anagrams;

import org.junit.jupiter.api.Test;

import static com.aakarachev.anagrams.AnagramMaker.makeAnagram;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AnagramMakerTest {

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithOneNonLetterSymbol() {
        String expected = "h";
        String actual = makeAnagram("h");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithOneLetterSymbol() {
        String expected = "1";
        String actual = makeAnagram("1");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithSameLetterSymbol() {
        String expected = "aa";
        String actual = makeAnagram("aa");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithSameNonLetterSymbol() {
        String expected = "11";
        String actual = makeAnagram("11");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentLetterSymbols() {
        String expected = "abcde";
        String actual = makeAnagram("edcba");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentNonLetterSymbols() {
        String expected = "a!bcd1e";
        String actual = makeAnagram("e!dcb1a");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentLetterSymbolsUpperAndLowerCases() {
        String expected = "AbcDe";
        String actual = makeAnagram("eDcbA");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithOnlyLetters() {
        String expected = "abcde fghij";
        String actual = makeAnagram("edcba jihgf");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithOnlyNonLettersSymbols() {
        String expected = "123456 789002";
        String actual = makeAnagram("123456 789002");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithDifferentSymbols() {
        String expected = "a1bcd efgh23";
        String actual = makeAnagram("d1cba hgfe23");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithOnlyLetters() {
        String expected = "abcde gthysd hgfdwq";
        String actual = makeAnagram("edcba dsyhtg qwdfgh");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithOnlyNonLettersSymbols() {
        String expected = "123456 654321 7896544";
        String actual = makeAnagram("123456 654321 7896544");

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithDifferentSymbols() {
        String expected = "as2edw5q fds34fs 1fds333";
        String actual = makeAnagram("qw2des5a sfs34df 1sdf333");

        assertEquals(expected, actual);
    }


    @Test
    void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceIsNull() {
        assertThrows(IllegalArgumentException.class, () -> makeAnagram(null),
                "Sentence is null");
    }

    @Test
    void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> makeAnagram(""),
                "Sentence is empty or contains only tabulation symbols");
    }

    @Test
    void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceContainsOnlyTabulation() {
        assertThrows(IllegalArgumentException.class, () -> makeAnagram("       "),
                "Sentence is empty or contains only tabulation symbols");
    }
}

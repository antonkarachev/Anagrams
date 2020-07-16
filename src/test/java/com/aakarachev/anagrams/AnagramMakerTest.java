package com.aakarachev.anagrams;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.assertEquals;

public class AnagramMakerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private final AnagramMaker anagramMaker = new AnagramMaker();

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithOneNonLetterSymbol() {
        String expected = "h";
        String actual = anagramMaker.makeAnagram("h");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithOneLetterSymbol() {
        String expected = "1";
        String actual = anagramMaker.makeAnagram("1");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithSameLetterSymbol() {
        String expected = "aa";
        String actual = anagramMaker.makeAnagram("aa");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithSameNonLetterSymbol() {
        String expected = "11";
        String actual = anagramMaker.makeAnagram("11");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentLetterSymbols() {
        String expected = "abcde";
        String actual = anagramMaker.makeAnagram("edcba");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentNonLetterSymbols() {
        String expected = "a!bcd1e";
        String actual = anagramMaker.makeAnagram("e!dcb1a");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsOneWordWithDifferentLetterSymbolsUpperAndLowerCases() {
        String expected = "AbcDe";
        String actual = anagramMaker.makeAnagram("eDcbA");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithOnlyLetters() {
        String expected = "abcde fghij";
        String actual = anagramMaker.makeAnagram("edcba jihgf");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithOnlyNonLettersSymbols() {
        String expected = "123456 789002";
        String actual = anagramMaker.makeAnagram("123456 789002");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsTwoWordWithDifferentSymbols() {
        String expected = "a1bcd efgh23";
        String actual = anagramMaker.makeAnagram("d1cba hgfe23");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithOnlyLetters() {
        String expected = "abcde gthysd hgfdwq";
        String actual = anagramMaker.makeAnagram("edcba dsyhtg qwdfgh");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithOnlyNonLettersSymbols() {
        String expected = "123456 654321 7896544";
        String actual = anagramMaker.makeAnagram("123456 654321 7896544");

        assertEquals(expected, actual);
    }

    @Test
    public void makeAnagramShouldSwapOnlyLettersIfSentenceContainsThreeWordWithDifferentSymbols() {
        String expected = "as2edw5q fds34fs 1fds333";
        String actual = anagramMaker.makeAnagram("qw2des5a sfs34df 1sdf333");

        assertEquals(expected, actual);
    }


    @Test
    public void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceIsNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Sentence is null");

        anagramMaker.makeAnagram(null);
    }

    @Test
    public void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceIsEmpty() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Sentence is empty or contains only tabulation symbols");

        anagramMaker.makeAnagram("");
    }

    @Test
    public void makeAnagramShouldThrowIllegalArgumentExceptionIfSentenceContainsOnlyTabulation() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Sentence is empty or contains only tabulation symbols");

        anagramMaker.makeAnagram("        ");
    }
}

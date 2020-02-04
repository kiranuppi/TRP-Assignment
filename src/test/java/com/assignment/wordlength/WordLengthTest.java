package com.assignment.wordlength;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordLengthTest {

    private static final String sentence = "The cow jumped over the moon.";
    private static final String expectedLongestWord = "jumped";
    private static final String expectedShortestWord = "The";

    @Test
    public void testLargestWordInSentenceTest() {
        WordLength.getLengthiestAndShortestWord(sentence);
        assertEquals(WordLength.largestWord, expectedLongestWord);
        assertEquals(WordLength.largestWord.length(), 6);

    }

    @Test
    public void testSmallestWordInSentenceTest() {
        WordLength.getLengthiestAndShortestWord(sentence);
        assertEquals(WordLength.smallestWord, expectedShortestWord);
        assertEquals(WordLength.smallestWord.length(), 3);

    }

    @Test
    public void testWhenBothLargestAndSmallestWordAreSame() {
        String sentence = "The end";
        String expectedSmallest = "The";
        String expectedLargest = "The";

        WordLength.getLengthiestAndShortestWord(sentence);
        assertEquals(WordLength.smallestWord, expectedSmallest);
        assertEquals(WordLength.smallestWord.length(), 3);

        assertEquals(WordLength.largestWord, expectedLargest);
        assertEquals(WordLength.largestWord.length(), 3);

    }

    @Test
    public void testLargestAndSmallestInEmptyString() {
        String sentence = StringUtils.EMPTY;

        WordLength.getLengthiestAndShortestWord(sentence);
        assertEquals(WordLength.smallestWord, StringUtils.EMPTY);
        assertEquals(WordLength.largestWord, StringUtils.EMPTY);

        assertEquals(WordLength.smallestWord.length(), 0);
        assertEquals(WordLength.largestWord.length(), 0);
    }

    @Test
    public void testLargestAndSmallestInAWord(){
        String imperativeSentence = "Stop!";
        String expectedSmallest = imperativeSentence;
        String expectedLargest = imperativeSentence;

        WordLength.getLengthiestAndShortestWord(imperativeSentence);
        assertEquals(WordLength.smallestWord, expectedSmallest);
        assertEquals(WordLength.smallestWord.length(), 5);

        assertEquals(WordLength.largestWord, expectedLargest);
        assertEquals(WordLength.largestWord.length(), 5);
    }

}

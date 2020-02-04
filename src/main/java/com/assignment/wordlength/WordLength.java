package com.assignment.wordlength;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class WordLength {

    static String largestWord, smallestWord;

    static void getLengthiestAndShortestWord(String str) {
        String[] words = str.split(" ");
        int i;

        int maxlength, minlength;

        maxlength = Integer.MIN_VALUE;
        minlength = Integer.MAX_VALUE;

        largestWord = smallestWord = "";

        for (i = 0; i < words.length; i++) {
            if (words[i].length() < minlength) {
                smallestWord = words[i];
                minlength = words[i].length();
            }
            if (words[i].length() > maxlength) {
                largestWord = words[i];
                maxlength = words[i].length();
            }
        }

    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text string");
        String str;
        try {
            str = br.readLine();
        } catch (Exception e) {
            System.out.println("Error reading input");
            return;
        }
        getLengthiestAndShortestWord(str);

        System.out.println("Largest Word in the sentence is :  " + largestWord + "  and its Length is : " + largestWord.length());
        System.out.println("Smallest Word in the sentence is :  " + smallestWord + "  and its Length is : " + smallestWord.length());
    }

}

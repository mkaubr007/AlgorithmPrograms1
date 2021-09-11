package com.biz.algorithm.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.biz.algorithm.programs.Operations.binarySearch;
import static java.util.Arrays.sort;

public class BinarySearch {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//decode them in character

        String [] words = new String[10];
        for(int i=0; i<10; i++) {
            System.out.print("words["+i+"]: ");
            words[i] = br.readLine();
        }

        sort(words); //import array sort
        for(int i=0; i<10; i++) {
            System.out.println("words["+i+"] = " + words[i]);
        }

        System.out.print("Enter word to search for: ");
        String word = br.readLine();

        int index = binarySearch(word, words, 0, words.length);
        if(index < 0) {
            System.out.println("not found");
        } else {
            System.out.println("found at index " + index);
        }
    }

}


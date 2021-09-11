package com.biz.algorithm.programs;

public class Operations {
    static int binarySearch(String word, String[] words, int a, int b) {
        if (b <= a)
            return -1;

        if (b - a == 1)
            return words[a].equals(word) ? a : -1;

        int pivot = (a + b) / 2;
        if (word.compareTo(words[pivot]) < 0) {
            return binarySearch(word, words, 0, pivot);
        } else if (word.compareTo(words[pivot]) > 0) {
            return binarySearch(word, words, pivot, b);
        }

        return pivot;
    }
}

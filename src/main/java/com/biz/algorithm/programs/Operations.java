package com.biz.algorithm.programs;

import java.util.Arrays;

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
    public String[] insertionSortAscending(String[] binaryStringArray) {

        for(int i = 1; i < binaryStringArray.length; i++) {
            String key = binaryStringArray[i];
            int j = i - 1;
            while((j > -1) && (binaryStringArray[j].compareTo(key) > 0)) {
                binaryStringArray[j+1] = binaryStringArray[j];
                j--;
            }
            binaryStringArray[j+1] = key;
        }

        return binaryStringArray;
    }
    public int[] bubbleSortAscending(int[] binaryIntArray) {

        int n = binaryIntArray.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n - 1 - i); j++) {
                if(binaryIntArray[j] > binaryIntArray[j+1]) {
                    int temp = binaryIntArray[j];
                    binaryIntArray[j] = binaryIntArray[j+1];
                    binaryIntArray[j+1] = temp;
                }
            }
        }
        return binaryIntArray;
    }
    public String[] mergeSort(String[] array){
        if(array.length == 1){
            return array;
        }
        String first[] = new String[array.length / 2];
        String last[] = new String[array.length - (array.length / 2)];
        for(int i = 0; i < first.length; i++){
            first[i] = array[i];
        }
        int j = 0;
        for(int i = first.length; i < array.length; i++){
            last[j] = array[i];
            j++;
        }
        first = mergeSort(first);
        last = mergeSort(last);

        String[] returnArray = new String[array.length];
        int firstPos = 0, lastPos = 0;
        for(int i = 0; i < returnArray.length; i++){
            if(lastPos == last.length){
                returnArray[i] = first[firstPos];
                firstPos++;
            }
            else if(firstPos == first.length){
                returnArray[i] = last[lastPos];
                lastPos++;
            }
            else if(first[firstPos].compareTo(last[lastPos]) > 0){
                returnArray[i] = last[lastPos];
                lastPos++;
            }
            else{
                returnArray[i] = first[firstPos];
                firstPos++;
            }
        }
        return returnArray;
    }
    public boolean anagram(String string1, String string2) {
        if(string1.length() != string2.length()) {
            return false;
        }
        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = string2.toCharArray();
        Arrays.sort(array2);

        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public String[] prime(int range) {
        String[] array = new String[1000];
        int position = 0;
        for(int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                array[position] = String.valueOf(i);
                position++;
            }
        }
        String[] returnArray = new String[position];
        for(int k = 0; k < position; k++) {
            returnArray[k] = array[k];
        }
        return returnArray;
    }
    public boolean palindrome(String string) {
        if(string.length() < 2) {
            return false;
        }
        char[] array = string.toCharArray();
        int n = array.length;
        for(int i = 0; i < n; i++) {
            if(array[i] != array[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}

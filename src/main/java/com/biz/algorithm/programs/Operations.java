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

}

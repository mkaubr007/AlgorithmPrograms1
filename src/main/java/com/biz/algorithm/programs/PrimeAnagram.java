package com.biz.algorithm.programs;

public class PrimeAnagram {

    public static void main(String[] args) {

        Operations operations = new Operations();	//	utility object
        //	prime numbers array between 0 and 1000
        String[] primeNumbers = operations.prime(1000);

        System.out.println("Anagram and prime numbers are:");
        //	prints prime numbers that are anagrams
        for(int i = 0; i < primeNumbers.length; i++) {
            for(int j = i + 1; j < primeNumbers.length; j++) {
                if(operations.anagram(primeNumbers[i], primeNumbers[j])) {
                    System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
                }
            }
        }

    }

}

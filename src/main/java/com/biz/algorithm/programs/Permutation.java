package com.biz.algorithm.programs;

import java.util.Scanner;

public class Permutation{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string for permutation");
        String str =sc.nextLine();
        int n = str.length();
        Operations operations = new Operations();
        operations.permute(str, 0, n - 1);
    }
}

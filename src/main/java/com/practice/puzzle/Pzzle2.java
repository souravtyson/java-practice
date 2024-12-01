package com.practice.puzzle;

/**
 * @author Sourav Suman - 01-12-2024
 */
public class Pzzle2 {
    public static void main(String[] args) {
        Integer[] num = {1,0,0,1,0,1,0,1,0,1,3,5,4,8,9};

        for (int i=0; i < num.length; i++) {
            for(int j = 0; j < i; j++) {
                if(num[i] < num[j]) {
                    num[j] = num[i] + num[j];
                    num[i] = num[j] - num[i];
                    num[j] = num[j] - num[i];
                }
            }
        }

        for (int k : num) {
            System.out.println(k);
        }
    }
}

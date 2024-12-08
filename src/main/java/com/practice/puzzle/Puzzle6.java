package com.practice.puzzle;

/**
 * @author Sourav Suman - 04-12-2024
 */
public class Puzzle6 {
    /*
    Write a function to find the maximum number of consecutive 1s in a binary array.
    Input: [1, 1, 0, 1, 1, 1]
    Output: 3

    Input: [1, 0, 1, 1, 0, 1]
    Output: 2
     */

    public static void main(String[] args) {
        System.out.println(getMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(getMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
        System.out.println(getMaxConsecutiveOnes(new int[]{0, 0, 0}));
        System.out.println(getMaxConsecutiveOnes(new int[]{1, 1, 1, 1, 1}));
        System.out.println(getMaxConsecutiveOnes(new int[]{0, 0, 0, 1}));
    }

    private static int getMaxConsecutiveOnes(int[] ints) {
        int onesCount = 0;
        int maxVal = 0;
        for(int i : ints) {
            if(i == 1) {
                onesCount++;
            }
            if(i == 0 && onesCount > maxVal) {
                maxVal = onesCount;
                onesCount = 0;
            }
        }
        return Math.max(onesCount, maxVal);
    }


}

package com.Packege.practice;


public class Practice {
    public static int fsl(int[] nums) {
        if (nums == null || nums.length < 2) {
            
        }

        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > fl) {
                sl = fl;
                fl = num;
            } else if (num > sl && num < fl) {
                sl = num;
            }
        }

        if (sl == Integer.MIN_VALUE) {
           
        }

        return sl;
    }

    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        try {
            System.out.println("The second largest element is: " + fsl(nums));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

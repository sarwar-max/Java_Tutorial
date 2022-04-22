package com;

import java.util.Arrays;
public class LISLengthByDPBottomUp {  
    static int lengthOfLIS(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        int[] cache = new int[a.length];
        Arrays.fill(cache, 1);

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    cache[i] = Math.max(cache[i], cache[j] + 1);
                }
            }
        }

        return Arrays.stream(cache).max().getAsInt();
    }


    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println("Length of LIS = "+lengthOfLIS(arr));
    }
}

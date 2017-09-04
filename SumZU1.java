package com.company;

import java.util.Arrays;

public class SumZU1 {
    private int[] sum = new int[32];
    private int[] a = new int[32];
    private int[] b = new int[32];
    private int i;

    public SumZU1(int[] o1, int x, int[] o2, int y) {
        i = x;
        a = Arrays.copyOf(o1,o1.length);
        b = Arrays.copyOf(o2,o2.length);

    }

    public void sumZU1() {
        int l = 0;

        for (int j = 0; j <= i; j++) {
            sum[j] += l;
            if (a[j] + b[j] + sum[j] == 0) {
                sum[j] = 0;
            } else if (a[j] + b[j] + sum[j] == 1) {
                sum[j] = 1;
                l = 0;
            } else if (a[j] + b[j] + sum[j] == 2) {
                sum[j] = 0;
                l = 1;
            } else {
                sum[j] = 1;
                l = 1;
            }

        }
        sum[31] = (a[31] + b[31] + l) % 2 == 0? 0: 1;
        l += a[31] + b[31] > 1? 1:0;

        if (l > 0) {
            l = 1;
            int[] c = new int[32];
            for (int j = 0; j <= i; j++) {
                sum[j] += l;
                if (c[j] + sum[j] == 0) {
                    sum[j] = 0;
                } else if (c[j] + sum[j] == 1) {
                    sum[j] = 1;
                    l = 0;
                } else if (c[j] + sum[j] == 2) {
                    sum[j] = 0;
                    l = 1;
                } else {
                    sum[j] = 1;
                    l = 1;
                }

            }

        }

    }
    public int getZU1(int a){return sum[a];}
    public int getI(){return i;}
}

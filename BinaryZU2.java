package com.company;

public class BinaryZU2 {

    private int[] tableZU2 = new int[32];
    int i;

    public BinaryZU2(int[] a, int j) {
        tableZU2 = a;
        i = j;
    }

    public int[] setZU2() {
        if (tableZU2[31] == 1) {
            boolean z = false;
            for (int k = 0; k <= i; k++) {
                if (z) {
                    tableZU2[k] = tableZU2[k] == 1 ? 0 : 1;
                } else if (tableZU2[k] == 1) {
                    z = true;
                }

            }
        }
        return tableZU2;

    }
}


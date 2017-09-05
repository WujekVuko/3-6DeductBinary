

class SumZU1 {
    private int[] sum = new int[32];
    private int[] a = new int[32];
    private int[] b = new int[32];
    private int i;

    SumZU1(int[] o1, int x, int[] o2, int y) {
        i = x;
        a = o1;
        b = o2;

    }

    void sumZU1() {
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

            for (int j = 0; j <= i; j++) {
                sum[j] += l;
                if (sum[j] == 0) {
                    sum[j] = 0;
                } else if (sum[j] == 1) {
                    sum[j] = 1;
                    l = 0;
                } else if (sum[j] == 2) {
                    sum[j] = 0;
                    l = 1;
                } else {
                    sum[j] = 1;
                    l = 1;
                }

            }

        }

    }
    int getZU1(int a){return sum[a];}
    int getI(){return i;}
}

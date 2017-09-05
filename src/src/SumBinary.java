import java.util.Arrays;

class SumBinary {
    private int[] sum = new int[32];
    private int[] a = new int[32];
    private int[] b = new int[32];
    private int[] c = new int[32];
    private int i;

    SumBinary(int g, int[] o1, int x, int h, int[] o2, int y) {
        i = x <= y ? y : x;
        a = g > h ? Arrays.copyOf(o1, o1.length) : Arrays.copyOf(o2, o2.length);
        b = h >= g ? Arrays.copyOf(o1, o1.length) : Arrays.copyOf(o2, o2.length);
        c = Arrays.copyOf(b,b.length);
    }

    void sumBinary() {
        int l = 0;

        if (a[31] != b[31]) {

            boolean z = false;
            for (int k = 0; k <= i; k++) {
                if (z) {
                    c[k] = c[k] == 1 ? 0 : 1;
                } else if (c[k] == 1) {
                    z = true;
                }
            }
        }
        for (int j = 0; j <= i; j++) {
            sum[j] += l;
            if (a[j] + c[j] + sum[j] == 0) {
                sum[j] = 0;
            } else if (a[j] + c[j] + sum[j] == 1) {
                sum[j] = 1;
                l = 0;
            } else if (a[j] + c[j] + sum[j] == 2) {
                sum[j] = 0;
                l = 1;
            } else {
                sum[j] = 1;
                l = 1;
            }

        }
        sum[31] = a[31];
    }
    int getSum(int a){return sum[a];}
    int getI(){return i;}
    int[] getA() {return a;}
    int[] getB() {return b;}
}

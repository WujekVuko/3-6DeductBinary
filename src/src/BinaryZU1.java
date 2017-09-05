import java.util.Arrays;

class BinaryZU1 {

   private int[] tableZU1 = new int[32];
   private int i;

    BinaryZU1(int[] a, int j){
        tableZU1 = Arrays.copyOf(a,a.length);
        i = j;


    }
    int[] setBinaryZU1() {
        if (tableZU1[31] == 1) {
            for (int k = i; k >= 0; k--) {
                tableZU1[k] = tableZU1[k] == 1 ? 0 : 1;
            }

        }
        return tableZU1;
    }
}

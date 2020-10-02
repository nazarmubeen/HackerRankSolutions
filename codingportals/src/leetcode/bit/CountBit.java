package leetcode.bit;

public class CountBit {

    public static void main(String[] args) {
        countBits(13);
    }

    public static int[] countBits(int num) {
        int[] result = new int[num + 1];

        int p = 1; //p tracks the index for number x
        int pow = 1;
        for (int i = 1; i <= num; i++) {
            if (i == pow) {
                result[i] = 1;
                System.out.println(" pow before " + pow);
                pow <<= 1;
                System.out.println(" pow after " + pow);
                p = 1;
            } else {
                System.out.println(" p " + p + " result[p] " + result[p]);
                result[i] = result[p] + 1;
                System.out.println(" i " + i + " result[i]" + result[i]);
                p++;
            }

        }

        return result;
    }
}

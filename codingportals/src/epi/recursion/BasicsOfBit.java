package epi.recursion;

public class BasicsOfBit {
    public static void main(String[] args) {

        int n = 8;
        System.out.println(Integer.toBinaryString(n - 1));
        System.out.println(Integer.toBinaryString(n & (n - 1)));
    }

    // Calculate the hamming weight for each Integer
    private int hammingWt(int num) {
        int wt = 0;
        while (num > 0) {
            wt++;
            num = num & (num - 1);
        }
        return wt;
    }
}

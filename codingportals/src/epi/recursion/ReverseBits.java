package epi.recursion;

public class ReverseBits {

    public static int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            System.out.println(Integer.toBinaryString(n));
            System.out.println(Integer.toBinaryString(res));
            res = (res << 1) | (n & 1);
            n = n >> 1;
            System.out.println(Integer.toBinaryString(n));
            System.out.println(" ");
        }
        return res;

    }

    public static void main(String[] args) {
        // System.out.println(reverseBits(43261596)); //answ 964176192 //input00000010100101000001111010011100
        System.out.println(reverseBits(4));
    }
}

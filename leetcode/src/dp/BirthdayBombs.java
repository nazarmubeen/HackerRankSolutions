package dp;

import Utils.ArrayUtilFunc;

import java.util.*;
import java.util.logging.Logger;


public class BirthdayBombs {
    public static ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
        ArrayList<Integer> resp = new ArrayList<>();
        int min = Collections.min(B);
        int available = A % min;

        int i = 0;
        while (resp.size() < A / min) {
            if (B.get(i) - min <= available) {
                available -= B.get(i) - min;
                resp.add(i);
            } else {
                i++;
            }
        }
        return resp;
    }

    public static void main(String[] args){
        solve(12,new ArrayList<>(Arrays.asList(8, 8, 6, 5, 4)));
    }
}

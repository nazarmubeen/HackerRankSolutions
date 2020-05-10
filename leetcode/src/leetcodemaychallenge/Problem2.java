package leetcodemaychallenge;

public class Problem2 {

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        numJewelsInStones(J,S);
    }

    public static int numJewelsInStones(String J, String S) {

        int count=0;

        for(int i=0;i<S.length();i++){

            if(J.indexOf(S.charAt(i))!=-1){
                count++;
            }

        }

        return count;
    }
}

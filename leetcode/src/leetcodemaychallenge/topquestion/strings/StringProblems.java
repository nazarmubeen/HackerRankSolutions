package leetcodemaychallenge.topquestion.strings;

import Utils.ArrayUtilFunc;

import java.util.*;

public class StringProblems {

    public static void main(String[] args){
  //      char[] s={'h','e','l','l','o'};
   //     reverseString(s);
   //     int number=1534236469;
     //   reverse(number);
      //  String s="leetcode";
     //   firstUniqChar(s);
        String s = "a", t = "b";
       // isAnagram(s,t);
        s="0P";
        System.out.println(isPalindrome(s));
    }

    public static void reverseString(char[] s) {

        System.out.println("reverse");
        int l=s.length;
        int mid=s.length/2;
        for(int i=0;i<mid;i++){
            System.out.println("i "+i);
            char temp=s[l-i-1];
            s[l-i-1]=s[i];
            s[i]=temp;

            ArrayUtilFunc.printArray(s);
        }
    }

    public static int reverse(int x) {

        int sum=0;
        while(x!=0) {
            int rem = x % 10;

            try {
                sum=Math.multiplyExact(sum,10);
                sum = Math.addExact(sum, rem);
            }catch (Exception e){
                System.out.println("exception");
                return 0;
            }
            x = x / 10;
            System.out.println(" rem "+rem+" sum "+sum+" num "+x);
        }

        return sum;
    }


    public static int firstUniqChar(String s) {
        int result=-1;

        for(int i=0;i<s.length();i++){

            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }

        }


        return result;

    }

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        System.out.println(s +" "+t);
        for(int i=0;i<s.length();i++){

            System.out.println("sc "+sc[i]+" "+tc[i]);
           if(sc[i]!=tc[i]){
                return false;
            }


        }
return true;

    }

    public static boolean isPalindrome(String s) {
        if(s.length()<=1){
            return true;
        }

        int begin=0;
        int last=s.length()-1;

        while(true)
        {
            System.out.println("start "+s.charAt(begin)+" last "+s.charAt(last));
            if(begin>=last )
            {
                break;
            }
            char c=s.charAt(begin);

            if(!isAlpha(c)){
                begin++;
                continue;
            }
             c=s.charAt(last);

            if(!isAlpha(c)){
                last--;
                continue;
            }

                if (Character.toUpperCase(s.charAt(begin))!=Character.toUpperCase(s.charAt(last))) {
                    return false;
                }
                last--;
                begin++;
        }
        return true;
    }

    static boolean isAlpha(char c){

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return true;
        else
            return false;
    }



}

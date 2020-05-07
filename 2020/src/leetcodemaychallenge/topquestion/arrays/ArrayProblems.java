package leetcodemaychallenge.topquestion.arrays;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ArrayProblems {

    //https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/798/
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int red=0;
        int blue=nums.length-1;
        int i=0;

        while (i <= blue) {
            if (nums[i] == 0) {
                swap(nums, i, red);
                red++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, blue);
                blue--;
            } else {
                i++;
            }
        }

    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

   // https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/
    // boyer moore algo
   public int majorityElement(int[] nums) {

       if (nums == null || nums.length == 0) {
           return 0;
       }
       return majorityElement(nums, 0);
   }

    private int majorityElement(int[] nums, int start){
        int count = 1;
        int num = nums[start];
        for(int i = start+1;i<nums.length;i++){
            if(num == nums[i]) count++;
            else count--;
            if(count == 0) return majorityElement(nums,i+1);
        }
        return num;
    }


//https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/799/
public int[] topKFrequent(int[] nums, int k) {



    int[] karray=new int[k];

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i:nums){

        if(map.get(i)==null){
            map.put(i,1);
        }
        else{
            map.put(i,map.get(i)+1);
        }
    }

    PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));

    // keep k top frequent elements in the heap
    for (int n: map.keySet()) {
        heap.add(n);
        if (heap.size() > k)
            heap.poll();
    }

    int n=karray.length-1;

    while (!heap.isEmpty() && n>=0){
        karray[n]=heap.poll();
        n--;
    }


    return karray;
}

//https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/800/
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> q=new PriorityQueue<>((n1,n2)-> n2-n1);

        for(int i:nums){
            q.add(i);
        }

        int n=-1;
        while(!q.isEmpty() && k>0){
            //  System.out.println(q.peek());
            n=q.poll();
            k--;
        }

        return n;
    }


}

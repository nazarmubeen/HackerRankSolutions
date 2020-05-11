package leetcodemaychallenge.topquestion.arrays;

import java.math.BigDecimal;
import java.util.*;

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

//https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/801/
    public int findPeakElement(int[] nums) {

        int min=0;
        int peak=0;

        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[min]){
                min++;
            }
            else{
                //       System.out.println(" i "+i);
                peak=min;
                return peak;
            }
        }

        return min;
    }

//https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/803/
    public int[][] merge(int[][] intervals) {

        if(intervals==null || intervals.length<=1){
            return intervals;
        }

        Arrays.sort(intervals,new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0]- b[0];
            }
        });

        ArrayList<int[]> result=new ArrayList<>();
        int[] prevArray=intervals[0];
        result.add(prevArray);


        for(int i=1;i<intervals.length;i++){

            int[] currentArray=intervals[i];

            if(prevArray[1]>=currentArray[0] || prevArray[0]>=currentArray[1]){
                int start=prevArray[0]>=currentArray[0]?currentArray[0]:prevArray[0];
                int end=prevArray[1]>=currentArray[1]?prevArray[1]:currentArray[1];
                int[] newArray={start,end};
                result.remove(result.size()-1);
                result.add(newArray);
                prevArray=newArray;
                continue;
            }
            result.add(currentArray);
            prevArray=currentArray;
        }



        int[][] fresult=new int[result.size()][2];

        for(int i=0;i<fresult.length;i++){
            fresult[i]=result.get(i);
        }

        return fresult;
    }

    //https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/802/
    public int[] searchRange(int[] nums, int target) {

        int[] finalAr={-1,-1};

        return searchMidIndex(nums,0,nums.length-1,target,finalAr);

    }

    int[] searchMidIndex(int[] nums, int start , int end,int target,int[] finalAr){

        if(start<0 || end>=nums.length || start>end){
            return finalAr;
        }

        int mid=start+((end-start)/2);
        //    System.out.println("mid "+mid);
        if(nums[mid]==target){

            int leftIndex= lowIndex(mid-1,target,nums);
            //         System.out.println("leftIndex "+leftIndex);
            int rightIndex= rightIndex(mid+1,target,nums);
            //          System.out.println("rightIndex "+rightIndex);
            finalAr[0]=leftIndex;
            finalAr[1]=rightIndex;
            return finalAr;
        }
        else if(nums[mid]<target){
            searchMidIndex(nums,mid+1,end,target,finalAr);
        }
        else{
            searchMidIndex(nums,start,mid-1,target,finalAr);
        }

        return finalAr;
    }

    int lowIndex(int index,int target,int[] nums){

        while(index>=0 && nums[index]==target){
            index--;
        }

        return index+1;
    }

    int rightIndex(int index,int target,int[] nums){

        while(index<nums.length && nums[index]==target){
            index++;
        }

        return index-1;
    }

    //https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/806/

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null || matrix.length<1)
            return false;
        //    target=20;
        int rowLength=matrix.length;
        int colLength=matrix[0].length;

        int i=0,j=0;

        while(i<rowLength && j<colLength && i>=0 && j>=0){
            //    System.out.println("start loop "+matrix[i][j]);
            //    System.out.println("i "+ i +" j "+j);
            while( j<colLength && matrix[i][j]<=target){

                if(matrix[i][j]==target)
                    return true;
                j++;
            }
            if(j==colLength)
                j--;

            //      System.out.println("j loop "+matrix[i][j]);


            while(i<rowLength  && j<colLength && matrix[i][j]<=target){
                if(matrix[i][j]==target)
                    return true;
                i++;
            }

            if(i==rowLength)
                i--;

            //        System.out.println("i loop "+matrix[i][j]);
            j--;
            colLength=j+1;
        }

        return false;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list;
        for(int i=0;i<nums.length;i++){

            list=new ArrayList<Integer>();
            int s=0-nums[i];
            System.out.println("s "+s);
            list.add(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                int b=s-nums[j];
                System.out.println("b "+b);
                list.add(nums[j]);
                System.out.println("list "+list);
                for(int k=j+1;k<nums.length;k++){
                    if(nums[k]==b){
                        list.add(nums[k]);
                        System.out.println("list "+list);
                        ArrayList<Integer> newlist=new ArrayList<>();
                        newlist.addAll(list);
                        Collections.sort(newlist);
                        if(!list.contains(newlist))
                        result.add(newlist);
                        System.out.println("result "+result);
                        list.remove(list.size()-1);
                    }


                }
                list.remove(list.size()-1);
            }


            list.remove(list.size()-1);

        }
        return result;
    }

    public boolean checkStraightLine(int[][] coordinates) {

        if(coordinates.length<=1){
            return false;
        }

        int[] prevPoint=coordinates[0];
        float slope=-1;

        for(int i=1;i<coordinates.length;i++){
            int[] currentPoint=coordinates[i];

            if(currentPoint[1]-prevPoint[1]==0 ||currentPoint[0]-prevPoint[0]==0){
                prevPoint=currentPoint;
                continue;
            }

            float currentSlope=(float)(currentPoint[1]-prevPoint[1])/(currentPoint[0]-prevPoint[0]);

            if (slope==-1){
                slope=currentSlope;
            }

            String a="";


            if(currentSlope!=slope){
                return false;
            }
            // System.out.println("slope of i "+slope+ " "+i);
            prevPoint=currentPoint;
        }

        return true;
    }

  //  https://leetcode.com/submissions/detail/336653885/?from=/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;

        while (l <= r) {
            long mid = l - (l - r) / 2;

            if (mid * mid == num)
                return true;
            else if (mid * mid < num)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return false;
    }

    //https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/
    public int findJudge(int N, int[][] trust) {
        if (trust.length < N - 1) {
            return -1;
        }

        int[] inEdges = new int[N + 1];
        int[] outEdges = new int[N + 1];
        for (int[] relation : trust) {
            outEdges[relation[0]]++;
            inEdges[relation[1]]++;
        }
        for (int i = 1; i <= N; i++) {
            if (inEdges[i] == N - 1 && outEdges[i] == 0) {
                return i;
            }
        }
        return -1;

    }

}

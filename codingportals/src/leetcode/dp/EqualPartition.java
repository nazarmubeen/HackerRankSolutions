package leetcode.dp;

import java.util.*;

public class EqualPartition {

    public static void main(String[] args){

        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1 ,7 ,15 ,29, 11 ,9));
        avgset(arr);
    }

    public static ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> arr) {
        ArrayList<Integer> subset=new ArrayList<>();
        int index=0;
        int[] A=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            A[i]=arr.get(i);
        }
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        int currentSum=0;
        for(int i=0;i<A.length;i++){
            currentSum+=A[i];
        }
        int average=currentSum/A.length;

        System.out.println("average "+average);
        Arrays.sort(A);
        findAllSubsets(subset,0,A,results,0,average);
        System.out.println("results"+results);
        Collections.sort(results, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.size()-o2.size();
            }
        });
        System.out.println("results"+results);
        for(int i=2;i<results.size();i++){
            results.remove(i);
        }
        System.out.println("results"+results);
        return results;
    }

    static void findAllSubsets(ArrayList<Integer> subset, int index, int[] arr,ArrayList<ArrayList<Integer>> results,int currentSum,int average){

        System.out.println("index "+index);
        System.out.println("curentsum "+currentSum);
        System.out.println(subset);
        // int sum=currentSum+arr[index];
        int length=subset.size();

        if(length>0 && currentSum%length==0 && currentSum/length==average){
            System.out.println("result "+subset);
            results.add(new ArrayList<>(subset));
            System.out.println("results"+results);
            return;
        }
        if(index>=arr.length){
            System.out.println("return");
            return;
        }



        for(int i=index;i<arr.length;i++){
       //     System.out.println("loop start for "+i);
            subset.add(arr[i]);
            currentSum=currentSum+arr[i];
            findAllSubsets(subset,i+1,arr,results,currentSum,average);
       //     System.out.println("current index "+i);
       //     System.out.println("after subset");
            currentSum= currentSum-arr[i];
            subset.remove(subset.size()-1);
       //     System.out.println("after subset "+subset);
        //    System.out.println("loop end fir "+i);
        }


        return;
    }

    //optimal
    private Map<Integer, Boolean> memo = new HashMap<>();

    public ArrayList<ArrayList<Integer>> avgset1(ArrayList<Integer> array)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Set<Integer> aIndex = new HashSet<>();

        int N = array.size();

        int totalSum = 0;
        for (int i = 0; i < N; i++)
            totalSum += array.get(i);

        Collections.sort(array);

        for (int aSize = 1; aSize < N; aSize++)
        {
            float aSum = (float)totalSum * aSize / N;
            if (aSum != (int)aSum)
                continue;

            for (int i = 0; i < N; i++)
            {
                if (find(i, aSize, aSum, array, aIndex))
                {
                    buildResult(result, array, aIndex, aIndex.size(), N - aIndex.size());
                    return result;
                }
            }
        }
        return result;
    }

    private boolean find(int index, int aSize, float aSum, ArrayList<Integer> array, Set<Integer> a)
    {
        if (index >= array.size() || aSize == 0)
            return false;

        int value = array.get(index);
        if (aSize == 1 && value == aSum)
        {
            a.add(index);
            return true;
        }

        if (find(index + 1, aSize - 1, aSum - value, array, a))
        {
            a.add(index);
            return true;
        }
        else if (find(index + 1, aSize, aSum, array, a))
            return true;

        return false;
    }

    private void buildResult(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> array,
                             Set<Integer> aIndex, int aSize, int bSize)
    {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < array.size(); i++)
        {
            if (aIndex.contains(i))
            {
                if (aSize <= bSize)
                    a.add(array.get(i));
                else
                    b.add(array.get(i));
            }
            else
            {
                if (aSize <= bSize)
                    b.add(array.get(i));
                else
                    a.add(array.get(i));
            }
        }
        result.add(a);
        result.add(b);
    }

}

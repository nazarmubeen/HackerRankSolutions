package dp;

import Utils.ArrayUtilFunc;

import java.util.Stack;

public class MaxRectangleInMatrix {

    public static void main(String[] args)
    {
        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=1;
        arr[0][2]=1;
        arr[1][0]=0;
        arr[1][1]=1;
        arr[1][2]=1;
        arr[2][0]=1;
        arr[2][1]=0;
        arr[2][2]=0;

        maximalRectangle(arr);
    }

    public static int maximalRectangle(int[][] A) {
    int maxArea=Integer.MIN_VALUE;
    int[] currentMat=new int[A.length];

    for(int i=0;i<=A.length-1;i++){
        for(int j=0;j<=A.length-1;j++){

            if(A[i][j]==1) {
                currentMat[j] = currentMat[j] + A[i][j];
            }
            else{
                currentMat[j] = A[i][j];
            }

        }
        ArrayUtilFunc.printArray(currentMat);
        maxArea=Math.max(calculateArea(currentMat),maxArea);
    }

    return maxArea;
    }

    static int calculateArea(int[] arr){

        int maxArea=Integer.MIN_VALUE;
        int top=-1;

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<arr.length;i++){
           if(arr[i]>=top){
               stack.push(i);
               top=arr[i];
           }else{
        //       System.out.println("top "+top);
        //       System.out.println("arr[i]"+arr[i]);
               while(top>arr[i]){
                   int area;
                   top=stack.peek();
                   if(stack.isEmpty()){
                       area=i*arr[top];
                   }
                   else{
                       int index=stack.pop();
                       area=arr[top]*(i-index-1);
                   }
                   maxArea=Math.max(area,maxArea);
               }
           }
        //   System.out.println("stack "+stack);
        }

        if(!stack.isEmpty()){
            int i=arr.length;
        //    System.out.println("i "+i);
            int area;
            while(!stack.isEmpty()){
                 top=stack.pop();
                if(stack.isEmpty()){
                    area=i*arr[top];
                }
                else {
                    area = arr[top] * (i - stack.peek() - 1);
                }
         //       System.out.println(" area ="+area);
                maxArea=Math.max(area,maxArea);
            }

        }
    //    System.out.println("max area"+maxArea);
        return maxArea;
    }
}

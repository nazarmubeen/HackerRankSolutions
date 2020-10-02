package leetcode.dp;

public class MinSumPathInMatrix {
    public static void main(String[] args){

        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=3;
        arr[0][2]=2;
        arr[1][0]=4;
        arr[1][1]=3;
        arr[1][2]=1;
        arr[2][0]=5;
        arr[2][1]=6;
        arr[2][2]=1;

        minPathSum(arr);
    }

    public static int minPathSum(int[][] A) {
        printMatrix(A);
        int lastRow=A.length-1;
        int lastColumn=A[0].length-1;

    for(int col=A[0].length-2;col>=0;col--){
        A[lastRow][col]=A[lastRow][col+1]+A[lastRow][col];
    }
        printMatrix(A);
        for(int row=A.length-2;row>=0;row--){
            A[row][lastColumn]=A[row+1][lastColumn]+A[row][lastColumn];
        }
        printMatrix(A);
    for(int i=A.length-2;i>=0;i--){

        for(int j=A[0].length-2;j>=0;j--){
                A[i][j]=Math.min(A[i+1][j],A[i][j+1])+A[i][j];
        }
    }
        printMatrix(A);
    System.out.println(A[0][0]);
    return A[0][0];


    }
    static void printMatrix(int[][] arr){

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                System.out.print( arr[row][col]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}

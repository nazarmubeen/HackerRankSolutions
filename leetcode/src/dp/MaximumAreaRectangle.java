package dp;

public class MaximumAreaRectangle {

    public static int solve(int[][] A) {
        printMatrix(A);
    //create hist matrix

        return getHistMatrx(A);

    //sort rows in matrix based upon numbrers


     //find area as column index multiply value;



    }


    private static int getHistMatrx(int[][] A){
        System.out.println("hist matrix cal");
        int[][] histarray=new int[A.length][A[0].length];
        //count number of 1 in each column
        for(int row=0;row<A.length;row++){

            System.out.println("row "+row);
            for(int col=0;col<A[row].length;col++){

                if(row>0 && A[row][col]!=0) {
                    histarray[row][col] = A[row][col] + histarray[row - 1][col];
                }
                else{
                    histarray[row][col]=A[row][col];
                }
            }

        }
        printMatrix(histarray);

        System.out.println("sort each rows");

        // Step 2: Sort rows of hist[][] in non-increasing order
        int R=A.length;
        int C= A[0].length;
        for (int i = 0; i < R; i++)
        {
            int count[] = new int[R + 1];

            // counting occurrence
            for (int j = 0; j < C; j++)
            {
                count[histarray[i][j]]++;
            }

            // Traverse the count array from right side
            int col_no = 0;
            for (int j = R; j >= 0; j--)
            {
                if (count[j] > 0)
                {
                    for (int k = 0; k < count[j]; k++)
                    {
                        histarray[i][col_no] = j;
                        col_no++;
                    }
                }
            }
        }
        printMatrix(histarray);

        // Step 3: Traverse the sorted hist[][] to find maximum area
        int curr_area, max_area = 0;
        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
            {
                // Since values are in decreasing order,
                // The area ending with cell (i, j) can
                // be obtained by multiplying column number
                // with value of hist[i][j]
                curr_area = (j + 1) * histarray[i][j];
                if (curr_area > max_area)
                {
                    max_area = curr_area;
                }
            }
        }
        return max_area;

    }

    static int[][] generateMatrix(int length,int range){

        int[][] arr=new int[length][length];

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(col%2==0)
                arr[row][col]=1;
                else{
                    arr[row][col]=0;
                }
            }
            System.out.println(" ");
        }
        return arr;
    }


    static void printMatrix(int[][] arr){

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                System.out.print( arr[row][col]+" ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args){
        solve(generateMatrix(3,2));
    }
}

/*
class Knapsack {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        return this.knapsackRecursive(profits, weights, capacity);
    }

    private int knapsackRecursive(int[] profits, int[] weights, int capacity) {
                int maxProfit=-1;

                int[][] dp=new int[][];

            for(int i=0;i<weights.length;i++){

                int currentProfit=profits[i];
                int currentCapacity=weights[i];

                int currentIndex=i+1;
                while(currentIndex<weights.length) {

                    for (int j = currentIndex; j < weights.length; j++) {
                        System.out.println(" i " + i + "j " + j);
                        System.out.println("currentCapacity+weights[j] " + (currentCapacity + weights[j]));
                        if (currentCapacity + weights[j] <= capacity) {
                            currentCapacity += weights[j];
                            currentProfit += profits[j];
                            System.out.println("currentProfit " + currentProfit);
                            maxProfit = Math.max(maxProfit, currentProfit);
                        }

                    }

                    currentIndex++;
                    currentProfit=profits[i];
                    currentCapacity=weights[i];
                }

            }

            return maxProfit;

    }

    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
      //  maxProfit = ks.solveKnapsack(profits, weights, 6);
     //   System.out.println("Total knapsack profit ---> " + maxProfit);
    }
}
*/

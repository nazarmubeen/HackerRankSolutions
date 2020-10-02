package leetcode.dp;

class EditDistance {
    public int minDistance(String word1, String word2) {

        if (word1.length() == 0) {
            return word2.length();
        }

        if (word2.length() == 0) {
            return word1.length();
        }
        if (word1.length() == 0 && word2.length() == 0) {
            return 0;
        }

        int[][] result = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            result[i][0] = i;
        }

        for (int j = 0; j <= word2.length(); j++) {
            result[0][j] = j;
        }

        for (int i = 1; i <= word1.length(); i++) {

            // System.out.println(" row "+i);

            for (int j = 1; j <= word2.length(); j++) {

                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    //   System.out.println("true");
                    result[i][j] = result[i - 1][j - 1];
                } else {
                    int min = Math.min(result[i - 1][j], result[i][j - 1]);
                    result[i][j] = Math.min(min, result[i - 1][j - 1]) + 1;
                    // System.out.println("result[i][j] "+result[i][j]);
                }
            }

        }

        return result[word1.length()][word2.length()];

    }
}
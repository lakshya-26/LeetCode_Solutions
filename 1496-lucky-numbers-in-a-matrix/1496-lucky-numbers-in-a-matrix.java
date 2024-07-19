class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         int[] min_row = new int[matrix.length];
        int[] max_col = new int[matrix[0].length];
        
        Arrays.fill(max_col, Integer.MIN_VALUE);
        
        // Find the minimum in each row
        for (int i = 0; i < matrix.length; i++) {
            min_row[i] = Arrays.stream(matrix[i]).min().getAsInt();
        }
        
        // Find the maximum in each column
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                max_col[j] = Math.max(max_col[j], matrix[i][j]);
            }
        }
        List<Integer> lucky_numbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == min_row[i] && matrix[i][j] == max_col[j]) {
                    lucky_numbers.add(matrix[i][j]);
                }
            }
        }
        
        return lucky_numbers;
    }
}
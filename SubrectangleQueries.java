class SubrectangleQueries {

    private int[][] subRectangle;        // Space: O(row x col)

    public SubrectangleQueries(int[][] rectangle) {     
        // Running Time: O(1))
        subRectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {      
        // Running Time: O(row x col) WCRT
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                subRectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {             
        // Running Time: O(1)
        return subRectangle[row][col];
    }
}

// Time: WCRT O(nm) where n = # of rows, m = # of columns

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startingColor = image[sr][sc];
        return fillHelper(image, sr, sc, color, startingColor);
    }

    public static int[][] fillHelper(int[][] image, int sr, int sc, int color, int startingColor) {
        if (image[sr][sc] == color) {
            return image;
        }
        if (image[sr][sc] == startingColor) {
            image[sr][sc] = color;
        }
        else {
            return image;
        }

        // check all 4 directions
        if (sr - 1 >= 0) {
            fillHelper(image, sr - 1, sc, color, startingColor);
        }
        if (sr + 1 < image.length) {
            fillHelper(image, sr + 1, sc, color, startingColor);
        }
        if (sc - 1 >= 0) {
            fillHelper(image, sr, sc - 1, color, startingColor);
        }
        if (sc + 1 < image[sr].length) {
            fillHelper(image, sr, sc + 1, color, startingColor);
        }

        return image;
    }
}
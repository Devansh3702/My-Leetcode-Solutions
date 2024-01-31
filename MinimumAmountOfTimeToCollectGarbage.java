class Solution {

    // Time: O(n*(n+m)) where n = garbage.length and m = length of longest String element.
    // Space: O(n)
    public int garbageCollection(String[] garbage, int[] travel) {
        return helper(garbage, travel, 'M') + helper(garbage, travel, 'P') + helper(garbage, travel, 'G');
    }

    public int helper(String[] garbage, int[] travel, char letter) {
        int limit = garbage.length - 1;
        int time = 0;
        int currHomeNdx = 0;
        time += getCount(garbage[0], letter);
        int traveled = 0;

        while (currHomeNdx <= limit) {
            int ndx = getNextIndex(garbage, currHomeNdx, letter);
            if (ndx == -1) {
                return time;
            }

            int count = getCount(garbage[ndx], letter);
            time += count;

            int placesToTravel = ndx - currHomeNdx;
            for (int i = traveled; i < traveled + placesToTravel; i++) {
                time += travel[i];
            }

            traveled += placesToTravel;

            currHomeNdx = ndx;

        }

        return time;
    }

    public int getNextIndex(String[] garbage, int currIndex, char letter) {
        int newIndex = currIndex + 1;

        for (int i = newIndex; i < garbage.length; i++) {
            char[] arr = garbage[i].toCharArray();
            for (char x : arr) {
                if (x == letter) {
                    return newIndex;
                }
            }
        }
        return -1;
    }

    public int getCount(String element, char letter) {
        int retVal = 0;
        for (int i = 0; i < element.length(); i++) {
            if (letter == element.charAt(i)) {
                retVal++;
            }
        }
        return retVal;
    }
}
// Time: O(n)
// Space: O(1)
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int distance = 0;
        int currPosition = -1;
        int currentCapacity = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (currentCapacity < plants[i]) {
                distance += (currPosition + 1);
                currPosition = -1;
                currentCapacity = capacity;
            }

            distance += (i - currPosition);
            currPosition = i;
            currentCapacity -= plants[i];
        }

        return distance;
    }
}
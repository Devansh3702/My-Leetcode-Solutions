// Time: O(n)
// Space: O(1)

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int retVal = 0;
        for (int i = 0; i < energy.length; i++) {
            if (initialEnergy <= energy[i]) {
                retVal += (energy[i] - initialEnergy + 1);
                initialEnergy = energy[i] + 1;
            }
            if (initialExperience <= experience[i]) {
                retVal += (experience[i] - initialExperience + 1);
                initialExperience = experience[i] + 1;
            }

            initialEnergy -= energy[i];
            initialExperience += experience[i];
        }
        return retVal;
    }
}